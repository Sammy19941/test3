package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="googleHome"                                
     , summary=""
     , relativeUrl=""
     , connection="Google"
     )             
public class googleHome {

	@TextType()
	@FindBy(xpath = "//input[@name='q' and @title='Search']")
	public WebElement SerachBox;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Gmail']")
	public WebElement gmail;
	@LinkType()
	@FindBy(xpath = "//parent::a[@data-label='header' and @data-action='create an account']")
	public WebElement getGmailCreateAnAccount;
			
}
