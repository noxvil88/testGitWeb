package ru.gb.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumSupport {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.get("https://www.selenium.dev/");

        webDriver.findElement(By.xpath("//span[text()='Support']")).click();
        webDriver.findElement(By.xpath("//a[text()='Official User Group']")).click();

        Thread.sleep(5000);
        webDriver.quit();

    }
}
