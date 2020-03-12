package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyRegisterPage;
import org.testng.Assert;

public class DarkSkySD {

    DarkSkyRegisterPage darkSkyRegisterPage = new DarkSkyRegisterPage();

    @Given("^I am on the darkSky Register page$")
    public void iAmOnRegisterPage(){
        String expectedUrl = "https://darksky.net/dev/register";
        String actualUrl = darkSkyRegisterPage.getPageUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @When("^I click on Register button$")
    public void iClickOnRegisterButton(){
        darkSkyRegisterPage.clickOnRegisterButton();
    }

    @Then("^I verify I am on Register page by asserting Register header$")
    public void verifyRegisterHeader(){
        String expectedText = "Register";
        String actualText = darkSkyRegisterPage.getRegisterHeaderText();

        Assert.assertEquals(actualText,expectedText);
    }



}
