package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {
	private ConfigFileReader configFileReader;

	/*@FindBy*/
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public static WebElement registerBtn;
	@FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[2]/input[1]")
	public static WebElement first;
	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td[2]/input[1]")
	public static WebElement nLast ;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phoneNumber;
	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement adress;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	@FindBy(how = How.NAME, using = "email")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement pwd;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPwd;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement submitBtn;



	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader=new ConfigFileReader();
	}
	/*Create Method*/
	public void goToUrl()  {
		Setup.driver.get(configFileReader.getProperties("home.url"));
		
		}
	
	public void ClickRegisterBtn() {
		registerBtn.click();
}
	public void fillUser(String name) throws InterruptedException {
		Thread.sleep(3000);
		first.sendKeys(name);
	}
	public void fillLast(String text) {
		nLast.sendKeys(text);

	}
	public void fillPhone(String text) {
		phoneNumber.sendKeys(text);
}
	public void fillEmail(String mail) {
		email.sendKeys(mail);
}
	public void fillAdress(String add) {
		 adress.sendKeys(add);
}
	public void fillCity(String cty) {
		city.sendKeys(cty);
}
	public void fillState(String province) {
		state.sendKeys(province);
}
	public void fillPostalCode(String postCod) {
		postalCode.sendKeys(postCod);
}
public void selectCountry(String contry) {
	Select select = new Select(country);
	select.selectByValue(contry);}

public void fillUserName(String name1) {
	userName.sendKeys(name1);
}
public void fillPwd(String passWd) {
	pwd.sendKeys(passWd);
	
}
public void fillConfirmPwd(String confPwd) {
	confirmPwd.sendKeys(confPwd);
}
public void ClickBtn() {

	submitBtn.click();
}



}