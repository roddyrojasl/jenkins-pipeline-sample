package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import task.Esperar;
import ui.FormDatosPersonales;


public class Escoger implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.segundos(5),
                Click.on(FormDatosPersonales.ESCOGER_SEGURO_BUTTON)
        );

    }
    public static Performable seguro() {
        return Instrumented.instanceOf(Escoger.class).withProperties();
    }
}
