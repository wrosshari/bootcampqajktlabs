package Tugas4;

import org.testng.Assert;
import org.testng.annotations.Test;

import bootcamp.tugasbatch08.pages.Tugas4CommonPage;
import bootcamp.tugasbatch08.pages.Tugas4EmailPage;
import bootcamp.tugasbatch08.pages.Tugas4HomeScreen;

public class Tugas4Test extends Tugas04BaseWebTest{
	
	Tugas4HomeScreen homeScreen = new Tugas4HomeScreen (driver, explicitWait);
	Tugas4EmailPage emailPage = new Tugas4EmailPage (driver, explicitWait);
	Tugas4CommonPage commonPage = new Tugas4CommonPage(driver, explicitWait);

	@Test
	public void searchByKeyword() {
		String searchText = "automationtest";
		
		homeScreen.inputSearchText(searchText);
		commonPage.switchIframeInbox();
		emailPage.clickEmailThumbnail();
		commonPage.switchBack();	
		commonPage.switchIframeEmail();
		
		String actualText = emailPage.getBodyText();

		String expectedText = "The monthly payment for your Renault Captur is due in 24 hours.";
		Assert.assertTrue(actualText.contains(expectedText));
		
	}
	
}
