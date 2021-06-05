package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	@FindBy(xpath="//button[@class='likeButton _4jy0 _4jy4 _517h _51sy _42ft']")
	private WebElement likebtn;
	
	public FacebookPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void likebutton() {
		likebtn.click();
	}
}
