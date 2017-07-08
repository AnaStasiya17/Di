package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().createContact(new ContactData("testName", "testFirstName", "testMiddleName", "testLastName", "testNickName", "testTitle", "testCompany",
                "testAddress", "testHome", "testMobile", "testWork", "testFax",
                "testEmail", "testSecAddress", "testSecHome", "testSecNotes",
                "test1"), true);
    }

}
