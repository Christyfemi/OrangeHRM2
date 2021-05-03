import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEMO {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://login.yahoo.com/?.src=fpctx&.intl=uk&.lang=en-GB&.done=https://uk.yahoo.com&pspid=2023392312");
   driver.findElement(By.id("login-username")).click();
   driver.findElement(By.id("login-username")).sendKeys("femiadekomaya@yahoo.com");
   
   //driver.quit();
   



	}

}
