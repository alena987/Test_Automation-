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
//1. Перейти на сайт   www.sankt-peterburg.rus-buket.ru  -  Открылась главная страница сайта  www.sankt-peterburg.rus-buket.ru;
//2. В  правом верхнем углу нажать "Войти" -  Открылась  форма "авторизации/регистрации".;
//3. В поле "E-mail" ввести: "helengeek22@gmail.com" - Электронная почта вводится и отображается;
//4. В поле "пароль " ввести:  "388817" - Пароль вводится и отображается точками;
//5. Нажать кнопку "Войти в кабинет" -  Авторизация прошла успешно. В правом верхнем углу вместо ссылки "Войти" появилась надпись "Привет, Алена";
public class TestOne {
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
        webElement3.sendKeys("388817");
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"js_btn-login\"]"));
        webElement4.click();
        // driver.quit();
    }
}