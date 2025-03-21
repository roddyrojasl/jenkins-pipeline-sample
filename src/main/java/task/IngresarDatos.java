package task;

import interactions.*;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class IngresarDatos implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarClase.deVehiculo(),
                SeleccionarMarca.deVehiculo(),
                SeleccionarModelo.deVehiculo(),
                SeleccionarUso.deVehiculo(),
                IngresarAño.defabricacion(),
                IngresarNumero.deAsientos(),
                Ubicacion.dondeCirculaVehiculo()

        );

        actor.attemptsTo(
                IngresarContrante.deVehiculo()
        );

        actor.attemptsTo(
                Escoger.seguro()
        );

        actor.attemptsTo(
                IngresarDatosComplementarios.deContratante()
        );


    }

    public static Performable vehiculares() {
        return Instrumented.instanceOf(IngresarDatos.class).withProperties();
    }
}
