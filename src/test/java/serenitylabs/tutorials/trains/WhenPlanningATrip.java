package serenitylabs.tutorials.trains;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenitylabs.tutorials.trains.questions.TheOutboundJourneySummary;
import serenitylabs.tutorials.trains.tasks.ViewTheAvailableTickets;
import serenitylabs.tutorials.trains.ui.ChosenTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


@RunWith(SerenityRunner.class)
public class WhenPlanningATrip {

    @Managed
    WebDriver browser;

    Actor tracy;


    @Before
    public void setTheStage() throws Exception {
        tracy = Actor.named("Tracy");
        tracy.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void booking_a_simple_trip() {
        // Tracy goes to book a ticket
        // Given
        tracy.has(ChosenTo.bookATicket());

        // Tracy views the tickets from London to Oxford
        // When
        tracy.attemptsTo(
                ViewTheAvailableTickets.from("London Paddington").to("Oxford")
        );

        // Tracy should check the Departure & Destinations are corrects
        tracy.should(

                seeThat(TheOutboundJourneySummary.origin(), is("London Paddington")),
                seeThat(TheOutboundJourneySummary.destination(), is("Oxford"))
        );

    }
}
