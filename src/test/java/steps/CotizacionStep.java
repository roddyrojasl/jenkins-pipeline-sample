package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ValidarCotizacion;
import task.Cotizar;
import task.IngresarDatos;
import ui.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class CotizacionStep {


    @Managed
    WebDriver driver;

    private Actor actor;


    @Given("que {string} navega en la pagina de cotizacion")
    public void usuarioNavegaEnLaPagina(String nombre) {
        actor =  OnStage.theActorCalled(nombre);
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(Open.browserOn().the(HomePage.class));

    }

    @When("ingresa la placa {string} de su vehiculo")
    public void ingresaLaPlacaDeSuVehiculo(String placa) {
        actor.attemptsTo(
                Cotizar.placaVehicular(placa)
        );

    }


    @And("los sus datos personales y del vehiculo")
    public void datosPersonalesYVehicular() {
        actor.attemptsTo(
                IngresarDatos.vehiculares()
        );

    }

    @Then("Ruben valida su nuevo SOAT")
    public void rubenValidaSuNuevoSOAT() {
        actor.should(
                seeThat("Texto a valdiar", ValidarCotizacion.pago(), equalTo("¡Paga y obtén tu SOAT al instante!"))

        );
    }
}
