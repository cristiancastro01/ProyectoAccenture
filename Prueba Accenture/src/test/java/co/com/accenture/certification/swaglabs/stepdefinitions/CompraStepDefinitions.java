package co.com.accenture.certification.swaglabs.stepdefinitions;

import co.com.accenture.certification.swaglabs.models.Productos;
import co.com.accenture.certification.swaglabs.tasks.*;
import co.com.accenture.certification.swaglabs.tasks.navegarpantallas.Navegar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CompraStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Cristian");
    }

    @Given("^El usuario realiza el proceso de logueo$")
    public void elUsuarioRealizaElProcesoDeLogueo() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginSwaglabs.inTheLogin());
    }

    @Given("^El usuario filtra por orden alfabetico$")
    public void elUsuarioFiltraPorOrdenAlfabetico() {
        OnStage.theActorInTheSpotlight().attemptsTo(OrdenarProductosSwaglabs.ordenAlfabetico());
    }

    @When("^El usuario agrega al carrito los productos$")
    public void elUsuarioAgregaAlCarritoLos(List<Productos> send) {
        for (int i= 0; i< send.size(); i++){
            OnStage.theActorInTheSpotlight()
                    .attemptsTo(
                            SeleccionarProductosSwaglabs.seleccion(send.get(i)),
                            Navegar.pantallaCompra(),
                            AgregarProducto.addProduct()
                    );
        }
    }

    @Then("^El usuario finaliza la compra$")
    public void elUsuarioFinalizaLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConfirmarCompra.confirmar(),
                Navegar.pantallaFinal(),
                PagoCompra.pago(),
                Navegar.pantallaFinalizar(),
                FinalizarCompra.finish()
        );
    }

}
