package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
private WebElement seleniumtrainingbtn;

@FindBy(id="mycart")
private WebElement cart;


@FindBy(xpath="//i[@class='fa fa-facebook']")
private WebElement faceookicon;

public TestingPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getSeleniumtrainingbtn() {
	return seleniumtrainingbtn;
}

public WebElement getCart() {
	return cart;
}

public void facebookicon() {
	faceookicon.click();
}
}
