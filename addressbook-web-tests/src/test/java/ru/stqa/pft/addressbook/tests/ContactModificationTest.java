package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Dmitriy on 08.07.2017.
 */
public class ContactModificationTest extends TestBase{

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("testName", "testFirstName", "testMiddleName", "testLastName", "testNickName", "testTitle", "testCompany", "testAddress", "testHome", "testMobile", "testWork", "testFax", "testEmail", "testSecAddress", "testSecHome", "testSecNotes"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToContactPage();
    }
}
