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

public class IngresarDatosComplementarios implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.segundos(5),
                Enter.theValue("Carlos").into(FormDatosPersonales.NOMBRE_INPUT),
                Enter.theValue("Ramirez").into(FormDatosPersonales.APELLIDO_PATERNO_INPUT),
                Enter.theValue("Rojas").into(FormDatosPersonales.APELLIDO_MATERNO_INPUT),
                Enter.theValue("998157423").into(FormDatosPersonales.CELULAR_INPUT),
                Enter.theValue("D565D5F5D4D6D5D5D22").into(FormDatosVehiculares.NRO_SERIE_INPUT),
                Click.on(FormDatosPersonales.IR_A_PAGAR_BTN),
                Esperar.segundos(8)
                );

    }

    public static Performable deContratante() {
        return Instrumented.instanceOf(IngresarDatosComplementarios.class).withProperties();
    }
}
