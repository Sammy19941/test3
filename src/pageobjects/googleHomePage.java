package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="googleHomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="Google"
     )             
public class googleHomePage {

	@TextType()
	
	@PageWaitAfter.Timed(durationSeconds = 5)
	@PageWait.Timed(durationSeconds = 5)
	@FindBy(xpath = "//input[@name='q' and @title='Search']")
	public WebElement SerachBox;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Gmail']")
	public WebElement gmail2;
			
}
