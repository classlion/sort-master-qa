package de.ait.sortMaster.gui.page;

import de.ait.sortMaster.gui.core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContainerPage extends BasePage {

    @FindBy(xpath = "//input[@id='name']")
    WebElement inputNewContainerName;

    @FindBy(xpath = "//input[@id='color']")
    WebElement chooseColorForInput;

    @FindBy(xpath = "//input[@id='description']")
    WebElement inputNewContainerDescription;

    @FindBy(xpath = "//button[normalize-space()='Create Container']")
    public WebElement submitNewContainer;

    public AddContainerPage(WebDriver driver) {
        super(driver);
    }

    public void addNameForContainer(String name) {
        type(inputNewContainerName, name);
        pause(500);
    }

    public void addColorForContainer(String color) {
        type(chooseColorForInput, color);
        pause(500);
    }

    public void addDescriptionForContainer(String description) {
        type(inputNewContainerDescription, description);
        pause(500);
    }

    public void setColorViaJs(String hexColor) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
                chooseColorForInput, hexColor);
        pause(1000);
    }
}