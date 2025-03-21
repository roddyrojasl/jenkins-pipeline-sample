package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import ui.FormDatosVehiculares;

public class IngresarNumero implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("6").into(FormDatosVehiculares.ASIENTOS_VEHICULO_INPUT)
        );

    }

    public static Performable deAsientos() {
        return Instrumented.instanceOf(IngresarNumero.class).withProperties();
    }

}
