package ru.gb.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDocumentation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.get("https://www.selenium.dev/");


        webDriver.findElement(By.xpath("//span[text()='Documentation']")).click();
        webDriver.findElement(By.xpath("//a[text()='freely available']")).click();

        Thread.sleep(5000);
        webDriver.quit();


    }
}
