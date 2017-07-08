package ru.stqa.pft.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitriy on 04.07.2017.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void deleteSelectedContacts() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        clickOnAlert();
    }

    public void returnToContactPage() {
        wd.findElement(By.linkText("home")).click();
    }

    public void submitContactCreation() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void submitContactModification() {
        wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getTestFirstName());
        type(By.name("middlename"), contactData.getTestMiddleName());
        type(By.name("lastname"), contactData.getTestLastName());
        type(By.name("nickname"), contactData.getTestNickName());
        type(By.name("title"), contactData.getTestTitle());
        type(By.name("company"), contactData.getTestCompany());
        type(By.name("address"), contactData.getTestAddress());
        type(By.name("mobile"), contactData.getTestMobile());
        type(By.name("home"), contactData.getTestHome());
        type(By.name("work"), contactData.getTestWork());
        type(By.name("fax"), contactData.getTestFax());
        type(By.name("email"), contactData.getTestEmail());
        type(By.name("address2"), contactData.getTestSecAddress());
        type(By.name("phone2"), contactData.getTestSecHome());
        type(By.name("notes"), contactData.getTestSecNotes());
        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void initContactCreation() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void initContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void createContact(ContactData contactData, Boolean creation) {
        initContactCreation();
        fillContactForm(contactData, creation);
        submitContactCreation();
        returnToContactPage();
    }

    public List<ContactData> list() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.xpath("//*[@id=\"maintable\"]/tbody/tr"));
        elements.remove(0);
        for (WebElement element : elements) {
            String lastName = element.findElements(By.tagName("td")).get(1).getText();
            String firstName = element.findElements(By.tagName("td")).get(2).getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            ContactData contact = new ContactData().withId(id).withTestFirstName(firstName).withTestLastName(lastName);
            contacts.add(contact);
        }
        return contacts;
    }

    public void modify(int index, ContactData contact) {
        selectContact(index);
        initContactModification();
        fillContactForm(contact, false);
        submitContactModification();
        returnToContactPage();
    }

    public void delete(int index) {
        selectContact(index);
        deleteSelectedContacts();
        returnToContactPage();
    }
}
