package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Set;

public class ContactDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().contactPage();
        if (app.contact().all().size() == 0) {
            app.contact().createContact(new ContactData().withTestFirstName("testFirstName").withTestMiddleName("testMiddleName")
                    .withTestLastName("testLastName").withTestNickName("testNickName").withTestTitle("testTitle")
                    .withTestCompany("testCompany").withTestAddress("testAddress").withTestHome("testHome")
                    .withTestMobile("testMobile").withTestWork("testWork").withTestFax("testFax")
                    .withTestEmail("testEmail").withTestSecAddress("testSecAddress")
                    .withTestSecHome("testSecHome").withTestSecNotes("testSecNotes").withGroup("test1"), true);
        }
    }

    @Test
    public void testContactDeletion() {
        Contacts before = app.contact().all();
        ContactData deletedContact = before.iterator().next();
        app.contact().delete(deletedContact);
        Contacts after = app.contact().all();
        Assert.assertEquals(after.size(), before.size() - 1);
        MatcherAssert.assertThat(after, CoreMatchers.equalTo(before.without(deletedContact)));

    }


}
