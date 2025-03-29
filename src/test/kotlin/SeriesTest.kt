import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import java.time.Duration
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

class SeriesTest {
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
    fun series() {
        driver.get("https://www.ivi.tv/")
        driver.manage().window().setSize(org.openqa.selenium.Dimension(1400, 748))
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
        driver.findElement(By.xpath("//div[@id=\'headerTop\']/div/div/div/div/div[2]/nav/ul/li[3]/a/div")).click()
        Thread.sleep(3000)
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/section[2]/div/div/div/div/div[4]/div/div")).click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/section[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/ul/li[17]/label/div"))
            .click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section[3]/div/div/div/div/div[5]/div/div")).click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section[3]/div/div/div/div/div[5]/div/div[2]/div/div/div/ul/li[2]/label/div"))
            .click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section/div/div/div[2]/div/div[2]/div")).click()
        driver.findElement(By.xpath("//div[@id=\'root\']/div[3]/div/section[4]/div/div/div/div/ul/li[2]/a/div/div/div[2]"))
            .click()
        driver.findElement(By.xpath("//div[@id=\'ivi-player-root\']/div/div/div/a")).click()
    }
}
