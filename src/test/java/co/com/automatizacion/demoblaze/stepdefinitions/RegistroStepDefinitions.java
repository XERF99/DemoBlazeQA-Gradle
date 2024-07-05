package co.com.automatizacion.demoblaze.stepdefinitions;



import co.com.automatizacion.demoblaze.questions.registro.VerificacionProductoUno;
import co.com.automatizacion.demoblaze.questions.registro.VerificacionUsuario;
import co.com.automatizacion.demoblaze.task.registro.LogIn;
import co.com.automatizacion.demoblaze.task.registro.LogInCart;
import co.com.automatizacion.demoblaze.task.registro.Registro;
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

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Francisco");
    }

    @Dado("soy un usuario de DemoBlaze sin credenciales")
    public void soyUnUsuarioDeDemoBlazeSinCredenciales() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }

    @Cuando("ingreso informacion necesaria para creacion de usuario")
    public void ingresoInformacionNecesariaParaCreacionDeUsuarios() {
        theActorInTheSpotlight().attemptsTo(Registro.registro());
        theActorInTheSpotlight().attemptsTo(LogIn.logIn());
    }

    @Entonces("se realiza el registro exitoso")
    public void seRealizaElRegistroExitoso() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionUsuario.verificacionUsuario(), Matchers.is(true)));
    }

    @Dado("que soy un usuario de DemoBlaze")
    public void queSoyUnUsuarioDeDemoBlaze() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }
    @Cuando("agrego un celular al carrito")
    public void agregoUnCelularAlCarrito() {
        theActorInTheSpotlight().attemptsTo(LogInCart.logInCart());
    }
    @Entonces("verifico que se encuentre agregado")
    public void verificoQueSeEncuentreAgregado() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionProductoUno.verificacionProductoUno(), Matchers.is(true)));
    }

}
