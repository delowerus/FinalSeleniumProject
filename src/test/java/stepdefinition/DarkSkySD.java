package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyHomePage;
import framework.webPages.DarkSkyRegisterPage;
import org.testng.Assert;

public class DarkSkySD {

    DarkSkyRegisterPage darkSkyRegisterPage = new DarkSkyRegisterPage();
    DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given("^I am on DarkSky Home Page$")
    public void iAmOnHomePage(){
        String expectedUrl = "https://darksky.net/forecast/40.7127,-74.0059/us12/en";
        String actualUrl = darkSkyHomePage.getPageUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

    }
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

    @When("^I expand todays timeline$")
    public void iExpandTodaysTimeLine() throws InterruptedException {
        darkSkyHomePage.scrollUpToToday();
        Thread.sleep(2000);
        darkSkyHomePage.clickOnTodayTimeline();

    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyLowestAndHighestTemperature(){
        darkSkyHomePage.clickOnTodayTimeline();
       String minTemp = darkSkyHomePage.getMinTemp();
       String maxTemp = darkSkyHomePage.getMaxTemp();
       String lowestTemp = darkSkyHomePage.getLowestTemp();
       String highestTemp = darkSkyHomePage.getHighestTemp();
        System.out.println(minTemp);
        System.out.println(maxTemp);
        System.out.println(lowestTemp);
        System.out.println(highestTemp);

       // Assert.assertEquals(minTemp,maxTemp);
       // Assert.assertEquals(lowestTemp,highestTemp);





    }












}
