package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

	private RegisterPage registerPage;

	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();

	}

	@Given("J accéde à lapplication Mercury")
	public void jAccédeÀLapplicationMercury() {
		registerPage.goToUrl();
	}

	@When("Je clique sur le bouton register")
	public void jeCliqueSurLeBoutonRegister() {
		registerPage.ClickRegisterBtn();

	}

	@When("Je saisie First Name {string}")
	public void jeSaisieFirstName(String name) throws InterruptedException {
		registerPage.fillUser(name);
		
	}

	@When("Je saisie Last Name {string}")
	public void jeSaisieLastName(String text) {
		registerPage.fillLast(text);
	}

	@When("Je saisie Phone {string}")
	public void jeSaisiePhone(String text) {
		registerPage.fillPhone(text);
	}

	@When("Je saisie Email {string}")

		public void jeSaisieEmail(String mail) {
			registerPage.fillEmail(mail);
		}


	@When("Je saisie Adresse {string}")
	public void jeSaisieAdresse(String add) {
		registerPage.fillAdress(add);
	}

	@When("Je saisie la ville {string}")
	public void jeSaisieLaVille(String cty) {
		registerPage.fillCity(cty);
	}

	@When("Je saisie la région {string}")
	public void jeSaisieLaRégion(String province) {
		registerPage.fillState(province);
	}

	@When("Je saisie le code postal {string}")
	public void jeSaisieLeCodePostal(String postCod) {
		registerPage.fillPostalCode(postCod);
	}

	@When("Je choisis le pays {string}")
	public void jeChoisisLePays(String contry) {
		registerPage.selectCountry(contry);
	}

	@When("Je saisie un User Name {string}")
	public void jeSaisieUnUserName(String name1) {
		registerPage.fillUserName(name1);
	}

	@When("Je saisie un password {string}")
	public void jeSaisieUnPassword(String passWd) {
		registerPage.fillPwd(passWd);
	}

	@When("Je confirme le password {string}")
	public void jeConfirmeLePassword(String confPwd) {
		registerPage.fillConfirmPwd(confPwd);
	}

	@When("Je clique sur le bouton envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		registerPage.ClickBtn();
	}

	@Then("Je me redirige vers la register")
	public void jeMeRedirigeVersLaRegister() {

	}

}
