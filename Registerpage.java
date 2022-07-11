package com.demonopcommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Registerpage {
WebDriver driver;
    By Fname= By.id("FirstName");
    By Lname=By.id("LastName");
    By email= By.id("Email");
    By password=By.id("Password");
    By confirmpassword=By.id("ConfirmPassword");
    By registerbtn=By.xpath("//*[@id=\"register-button\"]");

    //create constructor
    public Registerpage(WebDriver driver){
        this.driver=driver;
    }

    public void gettitle(){
        driver.get("https://demo.nopcommerce.com/register");
    }
    public void register(){
        driver.findElement(Fname).sendKeys("Radha");
        driver.findElement(Lname).sendKeys("Krishna");
        driver.findElement(email).sendKeys("Test@gmail.com");
        driver.findElement(password).sendKeys("abcdef12");
        driver.findElement(confirmpassword).sendKeys("abcdef12");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(registerbtn).click();
    }

   /* public void register(String Fname,String Lname,String email,String password,String confirmpassword){
    driver.findElement(Fname).sendKeys(Fname);
        driver.findElement(Lname).sendKeys(Lname);
        driver.findElement(email).sendKeys(email);
        driver.findElement(password).sendKeys(password);
        driver.findElement(confirmpassword).sendKeys(confirmpassword);
        driver.findElement(registerbtn).click();*/

    }


