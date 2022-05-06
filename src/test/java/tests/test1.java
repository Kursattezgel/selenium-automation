package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://demoqa.com/text-box");
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;


       /* WebElement fullName = driver.findElement(By.id("userName"));
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

        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = nameText.getText();

        WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        String e_mail = emailText.getText();

        System.out.println(e_mail);
        System.out.println(name); */

        String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckbox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckbox.click();

        homeCheckbox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        String homeCheckboxClassName = homeCheckbox.getAttribute("class");

        if (homeCheckboxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is checked");
        }
        else{
            System.out.println("Checkbox is unchecked");
        }

    }


}
