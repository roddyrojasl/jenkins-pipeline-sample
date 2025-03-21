package task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import ui.PlacaPage;

public class Cotizar implements Interaction {

    private String placa;

    public Cotizar (String placa){
        this.placa = placa;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(placa).into(PlacaPage.PLACA_TXT),
                Click.on(PlacaPage.COTIZAR_BTN)
        );
    }

    public static Performable placaVehicular(String placa) {
        return Instrumented.instanceOf(Cotizar.class).withProperties(placa);
    }


}
