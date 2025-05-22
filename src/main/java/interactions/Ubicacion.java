package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import ui.FormDatosVehiculares;

public class Ubicacion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormDatosVehiculares.DEPARTAMENTOS_VEHICULO_LIST),
                Click.on(FormDatosVehiculares.DEPARTAMENTO_VEHICULAR_OPTION),
                Click.on(FormDatosVehiculares.PROVINCIA_VEHICULO_LIST),
                Click.on(FormDatosVehiculares.PROVINCIA_VEHICULAR_OPTION),
                Click.on(FormDatosVehiculares.DISTRITO_VEHICULO_LIST),
                Click.on(FormDatosVehiculares.DISTRITO_VEHICULAR_OPTION),
                Click.on(FormDatosVehiculares.CONTINUAR_BUTTON)
        );

    }

    public static Performable dondeCirculaVehiculo() {
        return Instrumented.instanceOf(Ubicacion.class).withProperties();
    }
}
