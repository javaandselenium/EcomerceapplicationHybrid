package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	@FindBy(id="add")
	private WebElement addbtn;
	
	public WebElement getAddbtn() {
		return addbtn;
	}

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocart;
	
	public Addtocart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartbtn() {
		addtocart.click();
	}

}
