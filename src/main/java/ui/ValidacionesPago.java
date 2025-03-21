package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidacionesPago {

    public static Target CONTINUAR_VALIDACION_BUTTON = Target.the("Continuar con pago")
            .located(By.xpath("//button[contains(text(),'CONTINUAR')]"));

    public static Target OBTEN_TU_SOAT_TEXT = Target.the("Validar cuadro de pago")
            .located(By.xpath("//*[contains(text(),'obtén tu SOAT al instante')]"));

    public static Target VALIDA_DNI_TEXT = Target.the("Validar cuadro de pago")
            .located(By.xpath("    //*[contains(text(),'DNI') and @class]"));






}
