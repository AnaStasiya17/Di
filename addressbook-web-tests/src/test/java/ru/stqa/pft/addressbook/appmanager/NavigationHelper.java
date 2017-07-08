package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Dmitriy on 04.07.2017.
 */
public class NavigationHelper extends HelperBase{

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void gotoContactPage() {
        click(By.linkText("home"));
    }
}
