package seleniumTestsDepicate;

import org.junit.Test;
import org.openqa.selenium.*;

import static org.junit.Assert.fail;

public class OpenPages extends WebDriverSettings{
    @Test
    public void testOpenPages() throws Exception {
        driver.get("https://3dex-tst.eurochem.ru/3dpassport/login?service=https%3A%2F%2F3dex-tst.eurochem.ru%2F3dspace%2F");
        auth(driver);
        driver.findElement(By.xpath("//div[@id='My Enovia']/div[2]/ul/li[4]/a/label")).click();
        driver.findElement(By.xpath("//*[@id=\"My Enovia\"]/div[2]/ul/li[4]/a")).click();
    }
}
