package SeleniumPractice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestsYandex extends WebDriverInit {
    @Test
    public void openPage(){
        getDriver().get(getBaseUrl());
        getDriver().findElement(By.className("input__ahead-hint"));

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.className("search2__input-wrapper")));

        getDriver().findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("Hello world");
        getDriver().findElement(By.className("search2__button")).click();

        Assert.assertFalse("Страница не получена", getDriver().getCurrentUrl() == "https://yandex.ru/search/?lr=213&text=Hello%20world");
    }
}
