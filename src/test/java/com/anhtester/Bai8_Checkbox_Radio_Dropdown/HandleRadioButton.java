package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createBrowser();
        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        //Handle Radio

        boolean checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male: " + checkRadioMale);
        boolean checkRadioFemale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Female: " + checkRadioFemale);

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).click();

        boolean checkRadioMaleSelected = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male Selected: " + checkRadioMaleSelected);

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).click();

        boolean checkRadioMale2 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male2: " + checkRadioMale2);
        boolean checkRadioFemale2 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Female2: " + checkRadioFemale2);

        //Handle multi Radio button
        List<WebElement> listRadio = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label/input"));
        System.out.println("Radio Total: " + listRadio.size());

        for (int i = 0; i < listRadio.size(); i++) {
            System.out.println("Radio thứ " + (i + 1) + ": " + listRadio.get(i).isSelected());
        }

        listRadio.get(1).click(); //Click chọn Radio thứ 2 (tương ứng index 1 trong List)

        List<WebElement> listRadio2 = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label/input"));
        System.out.println("Radio Total: " + listRadio2.size());

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < listRadio2.size(); i++) {
            System.out.println("Radio thứ " + (i + 1) + ": " + listRadio2.get(i).isSelected());

            if(listRadio2.get(i).isSelected() == true) {
                count2 ++;
            }
        }

        if(listRadio2.get(1).isSelected() == true) {
            count1 ++;
        }
        if(count1 == 1 && count2 == 1){
            //Pass
            //Assert
        }

        closeBrowser();
    }
}
