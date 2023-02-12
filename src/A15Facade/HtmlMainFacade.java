package A15Facade;

public class HtmlMainFacade {

    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
        PageMaker.makeLinkPage("linkpage.html");
    }
}