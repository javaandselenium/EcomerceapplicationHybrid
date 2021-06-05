package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import POM.SeleniumPage;
import POM.SkillraryLoginPage;
import POM.Takethiscourse;
import genericlib.BaseClass;

public class TakeTheCourse extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
	   s.serachtextbox(pf.getdata("coursename"));
		s.searchbutton();
		
		SeleniumPage sp=new SeleniumPage(driver);
		sp.corejavacourse();
		
		Takethiscourse t=new Takethiscourse(driver);
		utilies.switchIntoframe(driver);
		t.playbutton();
		Thread.sleep(15000);
		t.pausebutton();
		utilies.switchBackframe(driver);
		Thread.sleep(3000);
		t.takecourse();
		
	
	}

}
