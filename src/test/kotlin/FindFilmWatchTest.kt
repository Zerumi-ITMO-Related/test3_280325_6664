import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.firefox.FirefoxDriver
import java.time.Duration
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

class FindFilmWatchTest {
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
    fun findFilmWatch() {
        driver.get("https://www.ivi.tv/")
        driver.manage().window().size = org.openqa.selenium.Dimension(1280, 720)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
        driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[2]/nav/ul/li[2]/a/div")).click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/section[2]/div/div/div/div/div[4]/div/div")).click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/section[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/ul/li[17]/label/div"))
            .click()
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section[4]/div/div/div/div/ul/li[7]/a/div/div/div[2]"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        run {
            val element: WebElement = driver.findElement(By.tagName("body"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element, 0, 0).perform()
        }
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section[4]/div/div/div/div/ul/li[7]/a/div/div/div[2]"))
            .click()
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/section/div/div/div/div/div[3]/div[2]/div/div/div[2]/button"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        run {
            val element: WebElement = driver.findElement(By.tagName("body"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element, 0, 0).perform()
        }
        driver.findElement(By.xpath("//div[@id=\'ivi-player-root\']/div/div/div/a/div")).click()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
    }
}
