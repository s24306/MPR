import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FuelTest {

    private static WebDriver driver;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", "src/main/resources");
        driver = new FirefoxDriver();
        driver.get("https://www.calculator.net/fuel-cost-calculator.html");
        driver.findElement(By.className("clearbtn")).click();
    }
    @Test
    public void fuelTest1() {
        setup();
        String distance = "344";
        String fuelEff = "5.5";
        String cost = "$1.8";
        calculateFuel(distance, fuelEff, cost);
    }

    // xpath=//div[@id='content']/p[2]/font/b
    // xpath=//div[@id='content']/p[2]/font[2]/b dokończyć !!

    private String calculateFuel(String tripDistance, String fuelEfficiency, String fuelPrice) {
        driver.findElement(By.name("tripdistance")).sendKeys(tripDistance);
        driver.findElement(By.name("fuelefficiency")).sendKeys(fuelEfficiency);
        driver.findElement(By.name("gasprice")).sendKeys(fuelPrice);
        driver.findElement(By.xpath("xpath=//input[@value='Calculate']")).click();
        return driver.findElement(By.className("verybigtext")).getText();
    }

}

