package bootcamp.tugasbatch08.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tugas4EmailPage extends BasePage {
	By emailThumbnail = By.xpath("//div[@id='e_ZwVjAGRlZQHjZQR5ZQNjZGNmAmZjAN==']//button[@class='lm']");
	By emailBody = By.xpath("//div[normalize-space()='You changed your Nissan Sentra booking']");
	By bodyText = By.xpath("//tbody//tr[@valign='top']//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//p[1]//strong[1]//span[1]");

	public Tugas4EmailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void switchIfmail() {
		
	}
	
	public void clickEmailThumbnail() {
		clickAndWait(emailThumbnail);
	}
	
	public void clickEmailBody() {
		clickAndWait(emailBody);
	}
	
	public String getBodyText() {
		return getText(bodyText);
	}
}