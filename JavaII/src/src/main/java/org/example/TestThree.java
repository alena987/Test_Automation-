package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class TestThree {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://sankt-peterburg.rus-buket.ru/");

        WebElement webElement1 = driver.findElement(By.xpath(".//*[@id=\"header\"]/div[1]/nav/div[2]/a[2]/div"));

        List<WebElement> webElements = driver.findElements(By.name("error"));
        if(webElements.size()>1){
        }
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"js_login-email-or-phone\"]"));

        webElement2.click();
        webElement2.sendKeys("helengeek22@gmail.com");
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"js_form-login\"]/input[2]"));
        webElement3.click();
        webElement3.sendKeys("112233");
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"js_btn-login\"]"));
        webElement4.click();
        // driver.quit();
    }
}
