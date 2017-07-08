package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Dmitriy on 04.07.2017.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);

    }

    public void deleteSelectedContacts() {
        click(By.name("selected[]"));
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        clickOnAlert();
    }

    public void returnToContactPage() {
        wd.findElement(By.linkText("home")).click();
    }

    public void submitContactCreation() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void fillContactForm(ContactData contactData) {
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
    }

    public void initContactCreation() {
        wd.findElement(By.name("new")).click();
    }
}
