package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.mustache.BaseChunk;

import POM.Addtocart;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import genericlib.BaseClass;

public class Addthecoursetocart extends BaseClass{

	@Test
	public void tc1() throws InterruptedException, FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapps();
		
		utilies.switchingtabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver,d.getCoursebtn());
		
		d.seleniumtrainingbtn();
		
		Addtocart a=new Addtocart(driver);
		utilies.doubleClick(driver,a.getAddbtn());
		
		a.addtocartbtn();
		
		utilies.alert(driver);
		
		Assert.assertEquals(driver.getTitle(),pf.getdata("addtocarttitle"));
		
		
		
		
		
	}
}
