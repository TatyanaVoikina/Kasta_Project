import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTestBranches {
    WebDriver driver;

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kasta.ua/");
        Thread.sleep(1500);
    }

    @Test
    public void testBranches1 () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[1]/div[2]/div[1]/a")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Одеса");
        Thread.sleep(1500);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div[2]/div/div[1]/div/div[2]/div/div[2]")));
        System.out.println("Test finished");
        Thread.sleep(1500);
    }
    @Test
    public void testBranches2 () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[1]/div[2]/div[1]/a")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Київ");
        Thread.sleep(1500);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div[2]/div/div[1]/div/div[2]/div/div[2]")));
        System.out.println("Test finished");
        Thread.sleep(1500);
    }


    @After
    public void quit() {
        driver.quit();
    }

}
