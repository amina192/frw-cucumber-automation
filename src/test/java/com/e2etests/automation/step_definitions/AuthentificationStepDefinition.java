package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthentificationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	/* Instantiation */
	private AuthentificationPage authentificationPage;

	public AuthentificationStepDefinition() {
		this.authentificationPage = new AuthentificationPage();

	}

	@Given("Je me connecte sur le site Mercury")
	public void jeMeConnecteSurLeSiteMercury() {
		authentificationPage.goTOUrl();

	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authentificationPage.fillUserName(name);
	}

	@When("Je sais password {string}")
	public void jeSaisPassword(String password) {
		authentificationPage.fillPassword(password);

	}

	@When("Je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationPage.clickOnBtnSubmit();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.messageText.getText();
		Assert.assertEquals(text, message);
	}

}
