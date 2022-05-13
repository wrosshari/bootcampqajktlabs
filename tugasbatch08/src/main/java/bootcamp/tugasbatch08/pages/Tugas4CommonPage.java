package bootcamp.tugasbatch08.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tugas4CommonPage extends BasePage {
	
	public Tugas4CommonPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void switchIframeInbox() {
		driver.get().switchTo().frame("ifinbox");
	}
	
	public void switchIframeEmail() {
		driver.get().switchTo().frame("ifmail");
	}
	
	public void switchBack() {
		driver.get().switchTo().defaultContent();
	}
}
