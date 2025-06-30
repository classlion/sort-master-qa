package de.ait.sortMaster.gui.page;

import de.ait.sortMaster.gui.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage extends BasePage {


    @FindBy(xpath = "//div[normalize-space()='About Page']")
    WebElement about;


    public AboutPage(WebDriver driver) {
        super(driver);
    }

    public String getAboutText() {
        return about.getText();
    }


}
