package stepdefinitions;

import cucumber.api.java8.En;

public class KrakenPageSteps implements En {
    public KrakenPageSteps() {
        Then("^I should see ([^\"]*) URL in the address bar", (String url) -> {
        });
        And("^I navigate to ([^\"]*) page from the menu$", (String menuItem) -> {
        });
    }
}
