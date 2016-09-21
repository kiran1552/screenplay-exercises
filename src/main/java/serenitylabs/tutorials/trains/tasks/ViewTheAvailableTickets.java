package serenitylabs.tutorials.trains.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import serenitylabs.tutorials.trains.ui.TicketTypeForm;

/**
 * Created by kimahale on 9/21/2016.
 */
public class ViewTheAvailableTickets implements Task {
    private final String from;
    private final String to;

    public ViewTheAvailableTickets(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(from).into(TicketTypeForm.FROM).thenHit(Keys.TAB),
                Enter.theValue(to).into(TicketTypeForm.TO).thenHit(Keys.TAB),
                Click.on(TicketTypeForm.BUY_TICKETS)
        );

    }

    public static ViewTheAvailableTicketsBuilder from(String from) {
        return new ViewTheAvailableTicketsBuilder(from);
    }

    public static class ViewTheAvailableTicketsBuilder {
        private final String from;

        public ViewTheAvailableTicketsBuilder(String from) {
            this.from = from;
        }

        public ViewTheAvailableTickets to(String to) {
            return Instrumented.instanceOf(ViewTheAvailableTickets.class).withProperties(from, to);
        }
    }
}
