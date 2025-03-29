import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.firefox.FirefoxDriver
import java.time.Duration
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

class AnimeTest {
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
    fun anime() {
        driver.get("https://www.ivi.tv/")
        driver.manage().window().size = org.openqa.selenium.Dimension(1280, 720)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[2]/nav/ul/li[4]/a/div"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        driver.findElement(By.xpath("//div[@id=\'headerDropdownBody\']/div/div/div/div/div/div/div[2]/div/a")).click()
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section[4]/div/div/div/div/ul/li/a/div/div/div[2]"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section[4]/div/div/div/div/ul/li/a/div/div/div[2]"))
            .click()
        Thread.sleep(3000)
        driver.findElement(By.xpath("//div[@id=\'ivi-player-root\']/div/div/div/a")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
    }
}
