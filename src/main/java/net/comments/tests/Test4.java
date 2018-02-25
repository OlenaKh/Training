package net.comments.tests;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {
    private WebDriver driver;

    @Test
    public void test() {
        this.driver().get("http://commentssprintone.azurewebsites.net");
        this.driver().findElements(By.name("SelectedId")).get(0).click();
        this.driver().findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        this.driver().findElement(By.xpath("//span[text()=\"Yes\"]")).click();
        final String page = this.driver().getPageSource();
        MatcherAssert.assertThat("Comment Text 0 is present", !page.contains("Comment Text 0"));
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
