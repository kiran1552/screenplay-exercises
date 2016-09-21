package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by kimahale on 9/21/2016.
 */
public class OutboundJourneySummary {
    public static final Target ORIGIN = Target.the("Departure").locatedBy(".planner-header__origin");
    public static final Target DESTINATION = Target.the("Destination").locatedBy(".planner-header__destination");
}
