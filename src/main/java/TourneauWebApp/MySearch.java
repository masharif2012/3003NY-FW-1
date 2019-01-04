package TourneauWebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MySearch {

    WebDriver driver = null;

    public void setProperty() {
        System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharif/Downloads/chromedriver");

    }
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tourneau.com/");
    }
    public void getPageTitle(){
        //printing page title
        System.out.println("This is the landing page Title: "+driver.getTitle());
    }
    public void searchInput (){
        driver.findElement(By.cssSelector("#header > header > div.header-search > form > fieldset > input.valid")).sendKeys("Air-King");

    }
    public void clickSearch(){
        driver.findElement(By.cssSelector("#header > header > div.header-search > form > fieldset > input[type=\"submit\"]:nth-child(4)")).click();
    }
    public void contactLink(){
        driver.findElement(By.cssSelector("#wrapper > div.block-overflow.rolex > div.top > div > div.top-links > ul > li:nth-child(5) > a")).click();
    }
    public void contactForm(){
        System.out.println("Contact Form Appears: "+driver.findElement(By.cssSelector("#ContactUsForm > fieldset > div")));
    }
    public void sceduleStoreVisit(){
        // Verifying if Schedule a Store Visit Link Appears right below contact form
        System.out.println("Schedule a Store Visit Link Appears: "+driver.findElement(By.cssSelector("#wrapper > div.block-overflow.rolex > div.contacts-wrap > div.schedule-visit > a")).isDisplayed());
    }
    public void waitTime(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    public void verifyLogo(){
        // printing text from logo.

        System.out.println("Logo Displayed:  "+driver.findElement(By.cssSelector("#headerbanner > a > img")).isDisplayed());
    }

    public void clickRolexTab(){
        driver.findElement(By.cssSelector("#navigation > nav > ul > li:nth-child(3) > a"));
    }

    public void selectChoice(){
        driver.findElement(By.cssSelector("#rolex-cat-landing > div > ul > li.landing-watch.with-overlay.day-date > div.name > a"));
    }
    public void closeBrowser() {
        driver.close();
    }

}
