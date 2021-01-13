import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest
{
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver","/Users/praveenbr/IntelliJIdea/AuctionDemo/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://auction.enavexpense.com/");

        driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("demotest");
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();

        Thread.sleep(Long.parseLong("8000"));

        driver.findElement(By.xpath("//*[@id='ulMenu']/li[1]/a/p")).click();

        Thread.sleep(Long.parseLong("5000"));

        driver.findElement(By.xpath("(//*[@id='tblRFQDashboard']/tbody/tr[1]/td[1]/span/a)[1]")).click();

        Thread.sleep(Long.parseLong("5000"));

        driver.findElement(By.xpath("//*[@id='btnLogout']")).click();

        Thread.sleep(Long.parseLong("5000"));

        driver.close();

        driver.quit();

    }
}
