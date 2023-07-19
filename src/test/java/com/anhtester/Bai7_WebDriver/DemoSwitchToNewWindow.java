package com.anhtester.Bai7_WebDriver;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class DemoSwitchToNewWindow extends BaseTest {

    public static void main(String[] args) {

        createBrowser();

        driver.get("https://github.com/anhtester/SeleniumMaven042023");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        sleep(1);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
        sleep(1);
        driver.switchTo().window(mainWindow); //Chuyển về của sổ mặc định ban đầu

        closeBrowser();
    }

}
