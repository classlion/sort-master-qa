package de.ait.sortMaster.gui.tests;

import de.ait.sortMaster.gui.core.TestBase;
import de.ait.sortMaster.gui.page.AboutPage;
import de.ait.sortMaster.gui.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutPageTests extends TestBase {

    private MainPage mainPage;
    private AboutPage aboutPage;

    @BeforeMethod
    public void setUpPage() {

        mainPage = new MainPage(app.getDriver());
        aboutPage = new AboutPage(app.getDriver());
    }

    @Test
    public void shouldDisplayAboutDescription() {
        mainPage.click(mainPage.AboutHeaderLink);
        Assert.assertEquals(aboutPage.getAboutText(), "About Page");
    }

}
