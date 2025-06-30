package de.ait.sortMaster.gui.page;

import de.ait.sortMaster.gui.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContainerPage extends BasePage {

    @FindBy (xpath = "//h2[normalize-space()='Rubbish Containers']")
    WebElement ContainersPageMainHeader;
    /// /////
    @FindBy (xpath = "//li[1]//div[1]//form[1]//div[1]//input[1]")
    WebElement GlassContainerInput;
    @FindBy (xpath = "//li[1]//div[1]//form[1]//button[1]")
    WebElement GlassContainerAddButton;

    /// /////
    @FindBy (xpath = "//li[2]//div[1]//form[1]//div[1]//input[1]")
    WebElement PaperContainerInput;
    @FindBy (xpath = "//li[2]//div[1]//form[1]//button[1]")
    WebElement PaperContainerAddButton;
    /// /////
    @FindBy (xpath = "//li[3]//div[1]//form[1]//div[1]//input[1]")
    WebElement PlasticContainerInput;
    @FindBy (xpath = "//li[3]//div[1]//form[1]//button[1]")
    WebElement PlasticContainerAddButton;

    public ContainerPage(WebDriver driver) {
        super(driver);
    }

    public void AddItemToGlassContainer(String query) {
        type(GlassContainerInput, query);
        pause(1500);
        click(GlassContainerAddButton);
    }

    public void AddItemToPaperContainer(String query) {
        type(PaperContainerInput, query);
        pause(1500);
        click(PaperContainerAddButton);
    }

    public void AddItemToPlasticContainer(String query) {
        type(PlasticContainerInput, query);
        pause(1500);
        click(PlasticContainerAddButton);
    }


}
