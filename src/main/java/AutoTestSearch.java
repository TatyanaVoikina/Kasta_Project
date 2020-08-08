import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTestSearch {
    WebDriver driver;

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kasta.ua/");
        Thread.sleep(3000);
    }

    @Test
    public void testSearch () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[2]/div[2]/div[2]/form/input")).sendKeys("Футболки");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
        Thread.sleep(3000);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div[2]/div/div[1]/div[1]/span/span[3]/a/span")));
        System.out.println("Test finished");
        Thread.sleep(3000);
    }

    @Test
    public void NOktestSearch () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[2]/div[2]/div[2]/form/input")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[2]/div[2]/div[2]/form/input")).sendKeys("61561816464646");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
        Thread.sleep(3000);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div[2]/div/div[1]/span")));
        System.out.println("Test finished");
        Thread.sleep(3000);
    }



    @After
    public void quit() {
        driver.quit();
    }



}

