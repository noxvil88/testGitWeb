package ru.gb.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class SeleniumBlog {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.get("https://www.selenium.dev/");

        webDriver.findElement(By.xpath("//span[text()='Blog']")).click();
        webDriver.findElement(By.xpath("//a[text()='Announcing Selenium 4']")).click();
        Thread.sleep(5000);
        webDriver.quit();

    }
}
