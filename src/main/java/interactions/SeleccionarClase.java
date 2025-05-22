package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import task.Esperar;
import ui.FormDatosVehiculares;

public class SeleccionarClase implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.segundos(5),
                //WaitUntil.the(FormularioDatos.CLASE_VEHICULAR, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(FormDatosVehiculares.CLASE_VEHICULAR_LIST),
                Click.on(FormDatosVehiculares.CLASE_VEHICULAR_OPTION)
        );

    }

    public static Performable deVehiculo() {
        return Instrumented.instanceOf(SeleccionarClase.class).withProperties();
    }
}
