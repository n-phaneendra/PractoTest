package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class specialistPage extends BasePage {

	public specialistPage(WebDriver driver) {
		super(driver);
		
	}
	
    //locating dropDown PatientStories
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[2]")
public	WebElement patientStoriesDropdownClick;
	
	//locating dropDown Experience
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[3]")
public	WebElement experienceDropdownClick;
	
	//locating dorpDown allFilters
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[4]/i")
public	WebElement allFiltersClick;
	
	//locating dropDown sortBy
	@FindBy(xpath="//span[@class='c-sort-dropdown__selected c-dropdown__selected']")
public 	WebElement sortByClick;//not locating

	//location dropDownList patientStories
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[2]/ul/li")
public 	List<WebElement> patientStories;
	
	//location dropDownList experience
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[3]/ul/li")
public	List<WebElement> experience;
    
	//locating dropDownList Fees
	
	//@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[2]/div/div[1]/div/label[1]/span/span")
	@FindBy(xpath="//span[@data-qa-id='Fees_title']/following-sibling::label")
public	List<WebElement> feeDropdown;//appollo white dental
	
	//locating dropDownList availability
	//@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[2]/div/div[2]/div/label/span")
	@FindBy(xpath="//span[@data-qa-id='Availability_title']/following-sibling::label")
public	List<WebElement> availability;//frr drp
	
	//locating dropDownList sortBy
	@FindBy(xpath="//ul[@data-qa-id='sort_by_list']/li")
public	List<WebElement> sortBy;//not locating
	
	//locating doctorDetials
	@FindBy(xpath="//*[@class='info-section']")
public	List<WebElement> doctorDetials;
	
	//locating forCoperate icon
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[1]/span/span[2]")
public	WebElement forCorporatesIcon;
	
	//locating health and wellness plan
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[1]/span/div/div[1]/a")
public	WebElement healthandWellness;
	
	//locating selected location
	@FindBy(xpath="//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[1]/div[1]/h1")
	public WebElement selectedLocation;
	
	//locating selected specialist
	@FindBy(xpath="//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/div[1]/span")
	public WebElement selectedSpecialist;
	
	public String getSelectedLocation() {
		return selectedLocation.getText();
	}
	
	public String getSelectedSpecialist() throws InterruptedException {
		String specialist=selectedSpecialist.getText();
		Thread.sleep(2000);
		return specialist;
	}
	public void dropDownclick(WebElement dropDown) throws InterruptedException {
		dropDown.click();
		Thread.sleep(2000);
	}
	
	public void selectDropdown(List<WebElement> dropDown) throws InterruptedException {
		dropDown.get(0).click();
		Thread.sleep(3000);
	}
	
	public void selectAvailability(List<WebElement> dropDown) throws InterruptedException {
		dropDown.get(2).click();
		Thread.sleep(4000);
	}
	
	public List<String> getString(List<WebElement> doc){
		List<String> s=new ArrayList<String>();
		for(int i=0;i<=5;i++) {
			s.add(doc.get(i).getText());
//			System.out.println(doc.get(i).getText());
		}
		return s;
	}
	
	public void printDetials() {
		for(int i=0;i<5;i++) {
			System.out.println(doctorDetials.get(i).getText());
		}
	}
	
	public void openHealthform() throws InterruptedException {
		forCorporatesIcon.click();
		Thread.sleep(2000);
		healthandWellness.click();
	}
}
