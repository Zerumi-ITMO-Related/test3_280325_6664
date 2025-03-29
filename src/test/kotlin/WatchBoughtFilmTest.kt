import org.junit.jupiter.api.Disabled
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.firefox.FirefoxDriver
import java.time.Duration
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

@Disabled
class WatchBoughtFilmTest {
    private lateinit var driver: WebDriver
    private lateinit var js: JavascriptExecutor

    @BeforeTest
    fun setUp() {
        driver = FirefoxDriver()
        js = driver as JavascriptExecutor
    }

    @AfterTest
    fun tearDown() {
        driver.quit()
    }

    @Test
    fun watchBoughtFilm() {
        driver.get("https://www.ivi.tv/")
        driver.manage().window().size = org.openqa.selenium.Dimension(1280, 720)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[6]/a/button/div"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[6]/a/button/div")).click()
        Thread.sleep(3000)
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div[2]/section/div/div/div/div[2]/button/div")).click()
        Thread.sleep(3000)
        driver.findElement(By.xpath("//input[@name=\'login\']")).sendKeys("89376535050")
        Thread.sleep(3000)
        driver.findElement(By.xpath("//div[@id=\'modal-container\']/div/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/button/div"))
            .click()
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'modal-container\']/div/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/button/div"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        run {
            val element: WebElement = driver.findElement(By.tagName("body"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element, 0, 0).perform()
        }

        Thread.sleep(30000)

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))

        driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[6]/a/div/div/div[2]")).click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section/div/div/div/ul[3]/li[3]/a")).click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section[3]/div/div/div/ul/li/a/div/div/div[2]"))
            .click()
        driver.findElement(By.xpath("//div[@id=\'ivi-player-root\']/div/div/div/a/div")).click()
    }
}
