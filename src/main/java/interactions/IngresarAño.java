package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import ui.FormDatosVehiculares;

public class IngresarAño implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("2010").into(FormDatosVehiculares.ANIO_VEHICULO_INPUT)
        );

    }

    public static Performable defabricacion() {
        return Instrumented.instanceOf(IngresarAño.class).withProperties();
    }

}
