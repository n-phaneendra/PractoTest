package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SurgeriesPage extends BasePage {

	public SurgeriesPage(WebDriver driver) {
		super(driver);
		
	}
	//locating surgiers link from home page
	//*[@id="container"]/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[5]/a/div[1]
	@FindBy(xpath="//a[@aria-label='Surgeries']")
	WebElement surgriesIcon;
	
	//locating surgiers link 
	@FindBy(xpath="//div[text()='Surgeries']")
	public WebElement surgries;
	
	//locating forcooperates
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/div[1]/div/div[3]/div/div[3]/div[1]/span/span[2]")
	public WebElement forcopertes;
	
	
	//locating healthwellness
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/div[1]/div/div[3]/div/div[3]/div[1]/span/div/div[1]/a")
	public WebElement healthwellness;
	
	
	@FindBy(xpath="//*[@id=\"surgeries\"]/div/div[1]/div/div/div/div/p")
	List<WebElement> listofSurgiers;
	
	//locating popular Surgiers
	@FindBy(xpath="//*[@id=\"surgeries\"]/div/div[1]/div/h1")
	public WebElement popularSurgiers;

    public void surgiersClick() throws InterruptedException {
    	
    	surgries.click();
    	Thread.sleep(10000);
//    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//    	wait.until(ExpectedConditions.elementToBeClickable(surgries)).click();
    	
    }
    
    public void printSurgiers() {
    	try {
    	for(WebElement ele:listofSurgiers) {
    		System.out.println(ele.getText());
    	}
    	}
    	catch(Exception e) {
    		
    	}
    	
    }
    
    public void openForm() throws InterruptedException {
    	forcopertes.click();
    	Thread.sleep(2000);
    	healthwellness.click();
    }
}
