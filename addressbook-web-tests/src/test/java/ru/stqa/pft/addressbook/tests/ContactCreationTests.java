package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.goTo().contactPage();
        Contacts before = app.contact().all();

        ContactData contact = new ContactData().withTestFirstName("testFirstName").withTestMiddleName("testMiddleName")
                .withTestLastName("testLastName").withTestNickName("testNickName").withTestTitle("testTitle")
                .withTestCompany("testCompany").withTestAddress("testAddress").withTestHome("testHome")
                .withTestMobile("testMobile").withTestWork("testWork").withTestFax("testFax")
                .withTestEmail("testEmail").withTestSecAddress("testSecAddress")
                .withTestSecHome("testSecHome").withTestSecNotes("testSecNotes").withGroup("[none]");
        app.contact().createContact(contact, true);
        Contacts after = app.contact().all();
        Assert.assertEquals(after.size(), before.size() + 1);
        assertThat(after, equalTo(
                before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }

}
