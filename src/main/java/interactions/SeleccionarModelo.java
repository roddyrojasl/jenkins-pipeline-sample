package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.FormDatosVehiculares;

public class SeleccionarModelo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormDatosVehiculares.MODELO_VEHICULO_LIST),
                Click.on(FormDatosVehiculares.MODELO_VEHICULAR_OPTION)
        );

    }

    public static Performable deVehiculo() {
        return Instrumented.instanceOf(SeleccionarModelo.class).withProperties();
    }

}
