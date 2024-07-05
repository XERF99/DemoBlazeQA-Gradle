package co.com.automatizacion.demoblaze.stepdefinitions;

import co.com.automatizacion.demoblaze.questions.compras.VerificacionMensajeCompra;
import co.com.automatizacion.demoblaze.questions.compras.VerificacionProducto;
import co.com.automatizacion.demoblaze.questions.compras.VerificacionValorAPagar;
import co.com.automatizacion.demoblaze.task.compras.*;
import co.com.automatizacion.demoblaze.task.registro.LogInCart;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Francisco");
    }

    @Dado("que el usuario abre la pagina de Demoblaze")
    public void queElUsuarioAbreLaPaginaDeDemoblaze() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }
    @Cuando("el usuario selecciona el primer producto")
    public void elUsuarioSeleccionaElPrimerProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProducto.seleccionarProducto("Samsung galaxy s6"));
    }
    @Cuando("el usuario coloca el primer producto en el carrito")
    public void elUsuarioColocaElPrimerProductoEnElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(ColocarCarrito.colocarCarrito("1"));
    }
    @Entonces("el usuario regresa a la pagina principal")
    public void elUsuarioRegresaALaPaginaPrincipal() {
        theActorInTheSpotlight().attemptsTo(IrAHome.irAHome());
    }
    @Cuando("el usuario selecciona el segundo producto")
    public void elUsuarioSeleccionaElSegundoProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProducto.seleccionarProducto("Nokia lumia 1520"));
    }
    @Cuando("el usuario coloca el segundo producto en el carrito")
    public void elUsuarioColocaElSegundoProductoEnElCarrito() {
        theActorInTheSpotlight().attemptsTo(ColocarCarrito.colocarCarrito("2"));
    }
    @Entonces("el usuario verifica que los productos en el carrito son los que selecciono")
    public void elUsuarioVerificaQueLosProductosEnElCarritoSonLosQueSelecciono() {
        theActorInTheSpotlight().attemptsTo(IrAlCarrito.irAlCarrito());
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionProducto
                        .verificacionProducto(Arrays.asList("Samsung galaxy s6", "Nokia Lumia 1520")),
                Matchers.is(true)));
    }
    @Entonces("el usuario verifica que el monto a pagar es {string}")
    public void elUsuarioVerificaQueElMontoAPagarEs(String montoEsperado) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionValorAPagar
                        .verificacionValorAPagar(montoEsperado),
                Matchers.equalTo(montoEsperado)));
    }
    @Cuando("el usuario procede al pago")
    public void elUsuarioProcedeAlPago() {
        theActorInTheSpotlight().attemptsTo(CompletarOrden.completarOrden());
    }
    @Cuando("el usuario ingresa sus datos de facturacion")
    public void elUsuarioIngresaSusDatosDeFacturacion() {
        theActorInTheSpotlight().attemptsTo(DatosFacturacion.datosFacturacion());
    }
    @Cuando("el usuario confirma la compra")
    public void elUsuarioConfirmaLaCompra() {
        theActorInTheSpotlight().attemptsTo(CompletarCompra.completarCompra());
    }
    @Entonces("el usuario verifica que el mensaje de confirmacion es {string}")
    public void elUsuarioVerificaQueElMensajeDeConfirmacionEs(String mensajeEsperado) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionMensajeCompra
                        .verificacionMensajeCompra(mensajeEsperado),
                Matchers.equalTo(mensajeEsperado)));
    }
    @Entonces("el usuario hace clic en el boton OK")
    public void elUsuarioHaceClicEnElBoton() {
        theActorInTheSpotlight().attemptsTo(BotonOk.botonOk());
    }
    @Entonces("la compra finaliza exitosamente")
    public void laCompraFinalizaExitosamente() {
        theActorInTheSpotlight().attemptsTo(IrAHome.irAHome());
    }


}
