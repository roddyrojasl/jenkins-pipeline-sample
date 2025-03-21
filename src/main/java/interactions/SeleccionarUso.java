package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import ui.FormDatosVehiculares;

public class SeleccionarUso implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormDatosVehiculares.USO_VEHICULO_SELECT),
                Click.on(FormDatosVehiculares.USO_VEHICULAR_OPTION)
        );

    }

    public static Performable deVehiculo() {
        return Instrumented.instanceOf(SeleccionarUso.class).withProperties();
    }


}
