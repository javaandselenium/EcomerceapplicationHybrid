package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.FacebookPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import POM.TestingPage;
import genericlib.BaseClass;

public class Facebooklike extends BaseClass{
	
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapps();
		
		utilies.switchingtabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilies.dropDown(d.getCoursedd(),pf.getdata("coursedd"));
		
		TestingPage t=new TestingPage(driver);
		utilies.draganddrop(driver,t.getSeleniumtrainingbtn(),t.getCart());
		t.facebookicon();
		
		FacebookPage fb=new FacebookPage(driver);
		fb.likebutton();
		
		Assert.assertEquals(driver.getTitle(),pf.getdata("fbtitle"));
		
		
	}

}
