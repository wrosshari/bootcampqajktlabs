package Tugas3;

import org.testng.Assert;
import org.testng.annotations.Test;

import bootcamp.tugasbatch08.pages.Tugas3LoginPage;
import bootcamp.tugasbatch08.pages.Tugas3ProfilePage;

public class Tugas3Test extends BaseWebTest {

	// karena semua extends dari BaseWebTest maka semua driver mesti menggunakan
	// driver.get()
	@Test
	public void loginToWebAndSuccess() {
		Tugas3LoginPage loginPage = new Tugas3LoginPage(driver, explicitWait);
		Tugas3ProfilePage profilePage = new Tugas3ProfilePage(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();

		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginToWebNotClickingLoginButton() {
		Tugas3LoginPage loginPage = new Tugas3LoginPage(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);

		String actualText = loginPage.getBannerText();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginInvalidPassword() {
		Tugas3LoginPage loginPage = new Tugas3LoginPage(driver, explicitWait);
		Tugas3ProfilePage profilePage = new Tugas3ProfilePage(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();
		String expectedText = "Your password is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginInvalidUsername() {
		Tugas3LoginPage loginPage = new Tugas3LoginPage(driver, explicitWait);
		Tugas3ProfilePage profilePage = new Tugas3ProfilePage(driver, explicitWait);
		String username = "usernameSalah";
		String password = "SuperSecretPassword";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();
		String expectedText = "Your username is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
}
