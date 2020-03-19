package framework.webPages;

import org.openqa.selenium.By;

public class DarkSkyHomePage extends BasePage{

    private By todayTimeline = By.xpath("//span[contains(text(),'Today')]");
    private By minTemp = By.xpath("(//span[@class='minTemp'])[1]");
    private By maxTemp = By.xpath("(//span[@class='maxTemp'])[1]");
    private By lowestTemp = By.xpath("(//span[@class='temp'])[1]");
    private By highestTemp = By.xpath("(//span[@class='temp'])[2]");



    public void scrollUpToToday(){
        scrollUpToElement(todayTimeline);
    }

    public void clickOnTodayTimeline(){
        clickOn(todayTimeline);
    }

    public String getMinTemp(){
        return getTextFromElement(minTemp);
    }

    public String getMaxTemp(){
        return getTextFromElement(maxTemp);

    }

    public String getLowestTemp(){
        return getTextFromElement(lowestTemp);
    }

    public String getHighestTemp(){
        return getTextFromElement(highestTemp);
    }





   }


