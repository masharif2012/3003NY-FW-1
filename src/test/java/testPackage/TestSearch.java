package testPackage;

import TourneauWebApp.MySearch;

public class TestSearch {

    public static void main(String[] args) throws InterruptedException {
        MySearch search = new MySearch();

        search.setProperty();
        search.launchBrowser();
        search.searchInput();
        search.contactLink();
        Thread.sleep(2000);
        search.fillContactForm();
        search.cLickDropDn();
        search.selectMenu();
        search.writeCommen();
        search.closeBrowser();


        //search.sceduleStoreVisit();
    }
}
