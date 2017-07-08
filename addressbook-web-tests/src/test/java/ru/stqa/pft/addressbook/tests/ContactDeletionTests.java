package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().contactPage();
        if (app.contact().list().size() == 0) {
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
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        app.contact().delete(index);
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(index);
        Assert.assertEquals(before, after);

    }


}
