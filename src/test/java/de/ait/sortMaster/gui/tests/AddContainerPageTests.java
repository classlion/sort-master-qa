package de.ait.sortMaster.gui.tests;

import de.ait.sortMaster.gui.core.TestBase;
import de.ait.sortMaster.gui.page.AboutPage;
import de.ait.sortMaster.gui.page.AddContainerPage;
import de.ait.sortMaster.gui.page.ContainerPage;
import de.ait.sortMaster.gui.page.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContainerPageTests extends TestBase {

    private MainPage mainPage;
    private AddContainerPage addContainerPage;

    @BeforeMethod
    public void setUpPage() {
        mainPage = new MainPage(app.getDriver());
        addContainerPage = new AddContainerPage (app.getDriver());
        mainPage.click(mainPage.AddContainerHeaderLink);
    }

    @Test
    public void AddNewContainerToBase(){
        addContainerPage.addNameForContainer("New Container");
        addContainerPage.addDescriptionForContainer("Description");
        addContainerPage.addColorForContainer("#00FF00");
        addContainerPage.click(addContainerPage.submitNewContainer);
    }


}
