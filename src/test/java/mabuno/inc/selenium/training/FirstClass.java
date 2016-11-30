package mabuno.inc.selenium.training;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by unambo on 16.11.2016.
 */
public class FirstClass extends BaseClass {

    @Test
    public void firstTest() throws Exception
    {
        driver.navigate().to("http://localhost/litecart/admin");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");

//        driver.findElement(By.cssSelector("(\"input#text.input__control.input__input\")")).sendKeys("selenium");
//        driver.findElement(By.cssSelector("button.button.suggest2-form__button")).click();
//        assert driver.getTitle().contains("selenium");
    }

}
