package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import task.Esperar;
import ui.FormDatosPersonales;
import ui.FormDatosVehiculares;

public class IngresarContrante implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.segundos(5),
                Enter.theValue("46281245").into(FormDatosPersonales.DOCUMENTO_INPUT),
                Esperar.segundos(3),
                Enter.theValue("pepehinojosa@gmail.com").into(FormDatosPersonales.CORREO_INPUT),
                Esperar.segundos(3),
                Click.on(FormDatosPersonales.IR_A_SEGUROS_BUTTON)
        );

    }

    public static Performable deVehiculo() {
        return Instrumented.instanceOf(IngresarContrante.class).withProperties();
    }

}
