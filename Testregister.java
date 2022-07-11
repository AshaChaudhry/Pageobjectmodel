package com.demonopcommerce.tests;

import com.demonopcommerce.Pages.Registerpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testregister {
    WebDriver driver;
    Registerpage registerpage;
@BeforeMethod

    public void verifyTitle(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();

     registerpage=new Registerpage(driver);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
        registerpage.gettitle();

    }
@Test
    public void getregister(){

         registerpage=new Registerpage(driver);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
        registerpage.register();
    }
    @AfterMethod
    public void teardown(){
    driver.close();
    }
}
