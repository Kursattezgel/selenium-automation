package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;



        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Kürşat Tezgel");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[type=\'email\']"));
        email.click();
        email.sendKeys("kursattezgel1@gmail.com");

        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Samsun/İlkadım");



        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        js.executeScript("arguments[0].scrollIntoView();", permanentAddress);
        permanentAddress.click();
        permanentAddress.sendKeys("Samsun/İlkadım");



        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

       // driver.quit();

    }


}
