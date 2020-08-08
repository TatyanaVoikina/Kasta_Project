import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTestNavigation {
    WebDriver driver;

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kasta.ua/");
        Thread.sleep(1500);
    }

    @Test
    public void testNavigation () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div[1]/div/a[2]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div[1]/div/a[1]/div")).click();
        Thread.sleep(2000);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[1]/div[1]/a/img")));
        System.out.println("Test finished");
        Thread.sleep(2000);
    }


    @After
    public void quit() {
        driver.quit();
    }



}

