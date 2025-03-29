import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.firefox.FirefoxDriver
import java.time.Duration
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

class SearchFilmTest {
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
    fun searchFilm() {
        driver.get("https://www.ivi.tv/")
        driver.manage().window().size = org.openqa.selenium.Dimension(1400, 800)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div/div/a/img"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        run {
            val element: WebElement = driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[4]/a"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        run {
            val element: WebElement = driver.findElement(By.tagName("body"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element, 0, 0).perform()
        }
        driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[3]/div[2]/button/div")).click()
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[3]/div[2]/button/div"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        run {
            val element: WebElement = driver.findElement(By.tagName("body"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element, 0, 0).perform()
        }
        driver.findElement(By.xpath("//div[@id=\'search-root\']/div/div[2]/div/div/section/div/div/form/div/div/input"))
            .click()
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'search-root\']/div/div[2]/div/div/div/section/div/div/div/div/div/ul/li/a/div/div"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        run {
            val element: WebElement = driver.findElement(By.tagName("body"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element, 0, 0).perform()
        }
        run {
            val element: WebElement =
                driver.findElement(By.xpath("//div[@id=\'search-root\']/div/div[2]/div/div/div/section/div/div/div/div/div/ul/li/a/div/div/div[2]"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element).perform()
        }
        run {
            val element: WebElement = driver.findElement(By.tagName("body"))
            val builder = org.openqa.selenium.interactions.Actions(driver)
            builder.moveToElement(element, 0, 0).perform()
        }
        driver.findElement(By.xpath("//div[@id=\'search-root\']/div/div[2]/div/div/section/div/div/form/div/div/input"))
            .sendKeys("т34")
        Thread.sleep(2000)
        driver.findElement(By.xpath("//div[@id=\'search-root\']/div/div[2]/div/div/div/section/div/div/div/div/div/ul/li/a/div/div/div[2]/div"))
            .click()
    }
}
