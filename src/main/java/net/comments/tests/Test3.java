package net.comments.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class Test3 {
    private WebDriver driver;

    @Test
    public void test() {
        this.driver.get("http://commentssprintone.azurewebsites.net");
        this.driver.findElement(By.id("main")).click();
        this.driver.findElement(By.xpath("(//input[@name='SelectedId'])[3]")).click();
        this.driver.findElement(By.xpath("//input[@value='Edit..']")).click();
        this.driver.findElement(By.id("Text")).sendKeys("Comment Text 123");
        this.driver.findElement(By.id("Number")).sendKeys("123");
        this.driver.findElement(By.xpath("//input[@value='Save & Return']")).click();
        final String page = this.driver().getPageSource();
        assertThat("Comment Text 123 is present", page.contains("Comment Text 123"));
    }

    @BeforeMethod
    public void createDriver() {
        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void closeDriver() {
        driver.close();
    }

    private WebDriver driver() {
        return this.driver;
    }
}
