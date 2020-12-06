package SeleniumPractice02;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverInit {
    private WebDriver driver;
    private WebDriverWait wait;
    private String baseUrl;

    @Before
    public void setUpTests(){
        // driver Version for download 86
        System.setProperty("webdriver.chrome.driver", "/Users/y.ershov/Downloads/chromedriver");
        baseUrl = "https://yandex.ru";
        driver = new ChromeDriver();
//        driver.manage().window().setSize(new Dimension(640, 480));
    }

    @After
    public void clouseTests(){
//        driver.close();
    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
