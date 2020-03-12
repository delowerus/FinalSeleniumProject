package framework.webPages;

import org.openqa.selenium.By;

public class DarkSkyRegisterPage extends BasePage {

    private By registerButton = By.xpath("//button[contains(text(),'Register')]");
    private By registerHeader = By.xpath("//h1[@class='stand-alone title']");


    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }

    public String getRegisterHeaderText(){
       return getTextFromElement(registerHeader);
    }

}
