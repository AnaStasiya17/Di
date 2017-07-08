package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoContactPage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("testName", "testFirstName", "testMiddleName", "testLastName", "testNickName", "testTitle", "testCompany",
                    "testAddress", "testHome", "testMobile", "testWork", "testFax",
                    "testEmail", "testSecAddress", "testSecHome", "testSecNotes",
                    "test1"), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().returnToContactPage();

    }

}
