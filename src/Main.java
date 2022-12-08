import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Lấy đường dẫn thư mục gốc
        String projectPath = System.getProperty("user.dir");
//        Trỏ đường dẫn đến chrome driver
//        System.setProperty("webdriver.chrome.driver", projectPath + "/web_drivers/chromedriver.exe");
//          System.setProperty("webdriver.gecko.driver", projectPath + "/web_drivers/geckodriver.exe");
        System.setProperty("webdriver.edge.driver", projectPath + "/web_drivers/msedgedriver.exe");
//        Khởi tạo 1 đối tượng chrome driver
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        System.out.println("This is new update for me");
        System.out.println("Checkout to create a new branch");
//        Điều hướng đến trang google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();

    }
}