package pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private final Page page;

    public HomePage(Page page){
        this.page = page;
    }

    public void navigateToHomePage(){
        page.navigate("https://automationexercise.com/");
    }

    public String getTitle(){
        return page.title();
    }
}
