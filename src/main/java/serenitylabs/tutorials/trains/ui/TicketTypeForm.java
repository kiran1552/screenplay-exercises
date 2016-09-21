package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


/**
 * Created by kimahale on 9/21/2016.
 */
public class TicketTypeForm {
    public static Target FROM = Target.the("Departure station")
            .located(By.id("depart-from"));
    public static Target TO = Target.the("Destination station")
            .locatedBy("#going-to");

    public static Target BUY_TICKETS = Target.the("Buy Tickets Button")
            .locatedBy(".planner__submit");


}
