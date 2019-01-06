package TourneauWebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.concurrent.TimeUnit;

public class MySearch {

    WebDriver driver = null;

    public void setProperty() {
        System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharif/Downloads/chromedriver");

    }
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tourneau.com/");
    }
    public void getPageTitle(){
        //printing page title
        System.out.println("This is the landing page Title: "+driver.getTitle());
    }
    public void searchInput (){
        //driver.findElement(By.cssSelector("#header > header > div.header-search > form > fieldset > input.valid")).sendKeys("Air-King");
        driver.findElement(By.xpath("//*[@id=\"header\"]/header/div[1]/form/fieldset/input[1]")).sendKeys("Air-King", Keys.ENTER);
    }
//    public void clickSearch(){
//        driver.findElement(By.xpath("//*[@id=\"header\"]/header/div[1]/form/fieldset/input[2]")).click();
//    }
    public void contactLink(){//clicking on the ContactLink
        driver.findElement(By.className("contactUsLinkRN" )).click();
    }

    public void fillContactForm(){//Filling out the contact Form
       driver.findElement(By.xpath("//*[@id=\"dwfrm_contactus_firstname\"]")).sendKeys("palash");
       driver.findElement(By.xpath("//*[@id=\"dwfrm_contactus_lastname\"]")).sendKeys("Sharif");
       driver.findElement(By.xpath("//*[@id=\"dwfrm_contactus_email\"]")).sendKeys("palash@gmail.com");

    }
    public void cLickDropDn (){//clicking on the dropdown list
        driver.findElement(By.xpath("//*[@id=\"dwfrm_contactus_emailsubject\"]")).click();

    }
    public void selectMenu(){
        //selecting from dropdown menu
        Select subject = new Select(driver.findElement(By.cssSelector("#dwfrm_contactus_emailsubject")));
        subject.selectByValue("Financing");
    }
    public void writeCommen(){
        driver.findElement(By.id("dwfrm_contactus_comment")).sendKeys("Anything");
    }

    public void contactForm(){
        System.out.println("Contact Form Appears: "+driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[5]/div[1]/div/div[3]/ul/li[5]/a")).isDisplayed());
    }
    public void sceduleStoreVisit(){
        // Verifying if Schedule a Store Visit Link Appears right below contact form
        System.out.println("Schedule a Store Visit Link Appears: "+driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[5]/div[3]/div[2]/a")).isDisplayed());
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
