import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import java.time.Duration
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

class MainPageScrollTest {
    private lateinit var driver: WebDriver

    @BeforeTest
    fun setUp() {
        driver = FirefoxDriver()
    }

    @AfterTest
    fun tearDown() {
        driver.quit()
    }

    @Test
    fun mainPageScroll() {
        driver.get("https://www.ivi.tv/")
        driver.manage().window().size = org.openqa.selenium.Dimension(1400, 800)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/div/div[3]/div/div")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3))
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/div/div[3]/div/div")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3))
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/div/div[3]/div/div")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3))
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/div/div[3]/div/div")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3))
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/div/div[3]/div/div")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3))
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/div/div[3]/div/div")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3))
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/div/div[3]/div/div")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3))
    }
}
