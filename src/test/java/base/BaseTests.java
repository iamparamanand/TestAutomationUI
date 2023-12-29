package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import testAutomationui.Pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.gecko.driver","resources/geckodriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
//        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(430,932));
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
//        inputsLink.click();
//        WebElement inputsLink1 = driver.findElement(By.linkText("Example 1: Menu Element"));
//        inputsLink1.click();
//        List<WebElement> links1 = driver.findElements(By.tagName("a"));
//        System.out.println(links1.size());

        homePage = new HomePage(driver);

//        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
