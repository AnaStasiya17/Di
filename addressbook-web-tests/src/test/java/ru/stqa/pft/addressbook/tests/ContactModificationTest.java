package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Dmitriy on 08.07.2017.
 */
public class ContactModificationTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().contactPage();
        if (app.contact().all().size() == 0) {
            app.contact().createContact(new ContactData().withTestFirstName("testFirstName").withTestMiddleName("testMiddleName")
                    .withTestLastName("testLastName").withTestNickName("testNickName").withTestTitle("testTitle")
                    .withTestCompany("testCompany").withTestAddress("testAddress").withTestHome("testHome")
                    .withTestMobile("testMobile").withTestWork("testWork").withTestFax("testFax")
                    .withTestEmail("testEmail").withTestSecAddress("testSecAddress")
                    .withTestSecHome("testSecHome").withTestSecNotes("testSecNotes").withGroup("[none]"), true);
        }
    }

    @Test
    public void testContactModification() {
        Contacts before = app.contact().all();
        ContactData modifiedContact = before.iterator().next();
        ContactData contact = new ContactData().withId(modifiedContact.getId()).withTestFirstName("testFirstName").withTestMiddleName("testMiddleName")
                .withTestLastName("testLastName").withTestNickName("testNickName").withTestTitle("testTitle")
                .withTestCompany("testCompany").withTestAddress("testAddress").withTestHome("testHome")
                .withTestMobile("testMobile").withTestWork("testWork").withTestFax("testFax")
                .withTestEmail("testEmail").withTestSecAddress("testSecAddress")
                .withTestSecHome("testSecHome").withTestSecNotes("testSecNotes");
        app.contact().modify(contact);
        Contacts after = app.contact().all();
        Assert.assertEquals(after.size(), before.size());
        assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));
    }

}
