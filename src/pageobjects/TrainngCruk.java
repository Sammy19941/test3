package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="TrainngCruk"                                
     , summary=""
     , relativeUrl=""
     , connection="CrukTrainingOrg"
     )             
public class TrainngCruk {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//span/span[normalize-space(.)='Training CRUK']")
	public WebElement name;
			
}
