package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Dmitriy on 08.07.2017.
 */
public class ContactModificationTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().contactPage();
        if (app.contact().list().size() == 0) {
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
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        ContactData contact = new ContactData().withId(before.get(index).getId()).withTestFirstName("testFirstName").withTestMiddleName("testMiddleName")
                .withTestLastName("testLastName").withTestNickName("testNickName").withTestTitle("testTitle")
                .withTestCompany("testCompany").withTestAddress("testAddress").withTestHome("testHome")
                .withTestMobile("testMobile").withTestWork("testWork").withTestFax("testFax")
                .withTestEmail("testEmail").withTestSecAddress("testSecAddress")
                .withTestSecHome("testSecHome").withTestSecNotes("testSecNotes");
        app.contact().modify(index, contact);
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(contact);

        Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }

}
