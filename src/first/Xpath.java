package first;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Naveen\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement em = driver.findElement(By.name("email"));
		em.sendKeys("naveenkumart46@gmail.com");
		WebElement ps = driver.findElement(By.name("pass"));
		ps.sendKeys("lvphotogr@phyfbb");
		WebElement lg = driver.findElement(By.id("loginbutton"));
		lg.click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	

}
