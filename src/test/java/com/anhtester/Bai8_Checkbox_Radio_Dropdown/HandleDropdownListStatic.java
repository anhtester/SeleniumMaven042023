package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdownListStatic extends BaseTest {

    public static void main(String[] args) {
        createBrowser();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        //Handle Dropdown List Tĩnh

        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));

        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);
        select.selectByVisibleText("Tuesday");

        //Kiểm tra đã chọn đúng hay chưa
        System.out.println(select.getFirstSelectedOption().getText());
        //Assert.assertEquals(select.getFirstSelectedOption().getText(), "Tuesday"); So sánh 2 giá trị có bằng nhau hay không
        sleep(1);
        select.selectByIndex(4); //Wednesday
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);
        select.selectByValue("Saturday");
        System.out.println(select.getFirstSelectedOption().getText());

        System.out.println("======================");
        List<WebElement> listOptions = select.getAllSelectedOptions();
        for (WebElement element : listOptions){
            System.out.println(element.getText());
        }

        System.out.println("======================");
        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
        selectMultiple.selectByIndex(1);
        selectMultiple.selectByIndex(2);
        selectMultiple.selectByIndex(3);
        List<WebElement> listOptionsMulti = selectMultiple.getAllSelectedOptions();
        for (WebElement element : listOptionsMulti){
            System.out.println(element.getText());
        }

        closeBrowser();
    }

}
