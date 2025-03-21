package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormDatosVehiculares {

    public static Target CLASE_VEHICULAR_SELECT = Target.the("Clase de vehiculo")
                                                 .located(By.xpath("//input//following-sibling::label[contains(text(),'Clase')]/../input"));

    public static Target MARCA_VEHICULO_SELECT = Target.the("Marca de vehiculo")
                                                .located(By.xpath("//input//following-sibling::label[contains(text(),'Marca')]/../input"));

    public static Target USO_VEHICULO_SELECT = Target.the("Uso de vehiculo")
                                                .located(By.xpath("//input//following-sibling::label[contains(text(),'Uso')]/../input"));

    public static Target ANIO_VEHICULO_INPUT = Target.the("Año de vehiculo")
                                                .located(By.xpath("//input//following-sibling::label[contains(text(),'Año')]/../input"));

    public static Target MODELO_VEHICULO_SELECT = Target.the("Modelo de vehiculo")
                                                .located(By.xpath("//input//following-sibling::label[contains(text(),'Modelo')]/../input"));

    public static Target ASIENTOS_VEHICULO_INPUT = Target.the("Asientos de vehiculo")
                                                .located(By.xpath("//input//following-sibling::label[contains(text(),'asientos')]/../input"));

    public static Target DEPARTAMENTOS_VEHICULO_SELECT = Target.the("Departamentos de vehiculo")
                                                .located(By.xpath("//input//following-sibling::label[contains(text(),'Departamento')]/../input"));

    public static Target PROVINCIA_VEHICULO_SELECT = Target.the("Provincia de vehiculo")
                                                .located(By.xpath("//input//following-sibling::label[contains(text(),'Provincia')]/../input"));

    public static Target DISTRITO_VEHICULO_SELECT = Target.the("Distrito de vehiculo")
                                                 .located(By.xpath("//input//following-sibling::label[contains(text(),'Distrito')]/../input"));




    public static Target CLASE_VEHICULAR_OPTION = Target.the("Clase")
                                                        .located(By.xpath("//div[@class='v-dropdown-container' and not(contains(@style, 'display: none'))]//*[contains(text(), 'AUTOMOVIL')]"));

    public static Target MARCA_VEHICULAR_OPTION = Target.the("Marca")
            .located(By.xpath("//div[@class='v-dropdown-container' and not(contains(@style, 'display: none'))]//*[contains(text(), 'TOYOTA')]"));

    public static Target MODELO_VEHICULAR_OPTION = Target.the("Modelo")
            .located(By.xpath("//div[@class='v-dropdown-container' and not(contains(@style, 'display: none'))]//*[contains(text(), 'INNOVA')]"));

    public static Target USO_VEHICULAR_OPTION = Target.the("Uso")
            .located(By.xpath("//div[@class='v-dropdown-container' and not(contains(@style, 'display: none'))]//*[contains(text(), 'PARTICULAR')]"));

    public static Target DEPARTAMENTO_VEHICULAR_OPTION = Target.the("Departamento")
            .located(By.xpath("//div[@class='v-dropdown-container' and not(contains(@style, 'display: none'))]//*[contains(text(), 'AREQUIPA')]"));

    public static Target PROVINCIA_VEHICULAR_OPTION = Target.the("Provincia")
            .located(By.xpath("//div[@class='v-dropdown-container' and not(contains(@style, 'display: none'))]//*[contains(text(), 'CAMANA')]"));

    public static Target DISTRITO_VEHICULAR_OPTION = Target.the("Distrito")
            .located(By.xpath("//div[@class='v-dropdown-container' and not(contains(@style, 'display: none'))]//*[contains(text(), 'CAMANA')]"));


    public static Target CONTINUAR_BUTTON = Target.the("Continuar con cotizacion")
            .located(By.xpath("//*[@class=\"grid grid-cols-1 md:grid-cols-1 gap-3\"]//button[contains(text(),'CONTINUAR')]"));

    public static Target NRO_SERIE_INPUT = Target.the("Serie de vehiculoS")
            .located(By.xpath("//input//following-sibling::label[contains(text(),'serie')]/../input"));




}
