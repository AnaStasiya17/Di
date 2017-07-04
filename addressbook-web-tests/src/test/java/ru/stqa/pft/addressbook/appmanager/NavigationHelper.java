package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Dmitriy on 04.07.2017.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
        wd.findElement(By.name("searchstring")).click();
        wd.findElement(By.name("searchstring")).sendKeys("\\9");
        wd.findElement(By.linkText("groups")).click();
    }
}
