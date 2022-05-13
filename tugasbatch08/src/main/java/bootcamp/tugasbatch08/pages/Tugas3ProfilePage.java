package bootcamp.tugasbatch08.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tugas3ProfilePage extends Tugas3BasePage {
	@FindBy(xpath = "//div[@id='flash']")
	private WebElement profileText;

	public Tugas3ProfilePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
		// TODO Auto-generated constructor stub
	}

	public String getProfileText() {
		return profileText.getText();
	}
}