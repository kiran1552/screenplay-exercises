package serenitylabs.tutorials.trains.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import serenitylabs.tutorials.trains.ui.OutboundJourneySummary;

/**
 * Created by kimahale on 9/21/2016.
 */
public class TheOutboundJourneySummary {
    public static Question<String> origin() {
        return actor -> Text.of(OutboundJourneySummary.ORIGIN).viewedBy(actor).asString();
    }

    public static Question<String> destination() {
        return actor -> Text.of(OutboundJourneySummary.DESTINATION).viewedBy(actor).asString();
    }
}
