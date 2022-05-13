package bootcamp.tugasbatch08.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tugas4HomeScreen extends BasePage {
	By searchBox = By.xpath("//input[@id='login']");
	By nextButton = By.xpath("//i[@class='material-icons-outlined f36']");

	public Tugas4HomeScreen(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void inputSearchText(String searchText) {
		setText(searchBox, searchText);
		clickAndWait(nextButton);
	}

}
