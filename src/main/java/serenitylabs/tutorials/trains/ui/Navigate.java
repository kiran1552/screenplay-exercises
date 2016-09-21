package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import serenitylabs.tutorials.trains.model.MainMenu;

/**
 * Created by kimahale on 9/21/2016.
 */
public class Navigate implements Interaction {

    private final MainMenu mainMenuOption;
    private BuyTicketsPage buyTicketsPage;


    public Navigate(MainMenu mainMenuOption) {
        this.mainMenuOption = mainMenuOption;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(buyTicketsPage)
        );
    }

    public static Performable to(MainMenu mainMenuOption) {
        return Instrumented.instanceOf(Navigate.class).withProperties(mainMenuOption);
    }
}
