package de.ait.sortMaster.gui.tests;

import de.ait.sortMaster.gui.core.BasePage;
import de.ait.sortMaster.gui.core.TestBase;
import de.ait.sortMaster.gui.page.AboutPage;
import de.ait.sortMaster.gui.page.ContainerPage;
import de.ait.sortMaster.gui.page.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContainerPageTests extends TestBase {
    private MainPage mainPage;
    private ContainerPage containerPage;

    @BeforeMethod
    public void setUpPage() {
        mainPage = new MainPage(app.getDriver());
        containerPage = new ContainerPage(app.getDriver());
        mainPage.click(mainPage.ContainersHeaderLink);
    }

    @Test
    public void AddNewItemToGlassContainerPositive () {
        containerPage.AddItemToGlassContainer("GlassItem5");

    }

    @Test
    public void AddNewItemToPaperContainerPositive () {
        WebDriver driver = app.getDriver();
        BasePage.scrollDown(driver, 500);
        containerPage.AddItemToPaperContainer("PaperItem5");

    }

    @Test
    public void AddNewItemToPlasticContainerPositive (){
        WebDriver driver = app.getDriver();
        BasePage.scrollDown(driver, 900);
        containerPage.AddItemToPlasticContainer("PlasticItem5");

    }


}


