package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlacaPage {

    public static Target PLACA_TXT = Target.the("Ingresar placa para cotizar")
                                           .located(By.id("plate"));

    public static Target COTIZAR_BTN = Target.the("Cotizar")
                                             .located(By.xpath("//button[@class=\"w-full shadow-lg btn-secondary\"]//*[contains(text(),'COTIZAR')]"));
}
