package TourneauWebApp;

public class TestSearch {

    public static void main(String[] args) {
        MySearch search = new MySearch();

        search.setProperty();
        search.launchBrowser();
        search.searchInput();
        search.clickSearch();
        search.contactForm();
        search.sceduleStoreVisit();
    }
}
