package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormDatosPersonales {

    public static Target DOCUMENTO_INPUT = Target.the("Ingresar Nro de documento")
            .located(By.xpath("//input[@class=\"is-input rounded-left-0 peer\"]"));

    public static Target CORREO_INPUT = Target.the("Ingresar correo")
            .located(By.xpath("//input[@type=\"email\"]"));

    public static Target IR_A_SEGUROS_BUTTON = Target.the("Continuar con planes")
            .located(By.xpath("//button//*[contains(text(),'IR A PLANES')]//.."));


    public static Target NOMBRE_INPUT = Target.the("Nombre de contratante")
            .located(By.xpath("//input//following-sibling::label[contains(text(),'Nombre')]/../input"));

    public static Target APELLIDO_PATERNO_INPUT = Target.the("Primer apellido")
            .located(By.xpath("//input//following-sibling::label[contains(text(),'Apellido paterno')]/../input"));

    public static Target APELLIDO_MATERNO_INPUT = Target.the("Segundo apellido")
            .located(By.xpath("//input//following-sibling::label[contains(text(),'Apellido materno')]/../input"));

    public static Target CELULAR_INPUT = Target.the("Celular")
            .located(By.xpath("//input//following-sibling::label[contains(text(),'Celular')]/../input"));



    public static Target ESCOGER_SEGURO_BUTTON = Target.the("Escoger seguro")
            .located(By.xpath("//div[contains(@class,'relative')]//button[contains(text(),'LO QUIERO')]"));

    public static Target IR_A_PAGAR_BTN = Target.the("Pagar seguro")
            .located(By.xpath("//button[contains(text(),'IR A PAGAR')]"));




}
