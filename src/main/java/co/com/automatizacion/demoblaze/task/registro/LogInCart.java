package co.com.automatizacion.demoblaze.task.registro;

import co.com.automatizacion.demoblaze.ui.Cart;
import co.com.automatizacion.demoblaze.ui.Home;
import co.com.automatizacion.demoblaze.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogInCart  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.Log_in),
                Enter.theValue(Constantes.Name).into(Home.Username),
                Enter.theValue(Constantes.Password).into(Home.Password),
                Click.on(Home.Boton_Login),
                WaitUntil.the(Home.CelularSamsung, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Home.CelularSamsung),
                Click.on(Home.Boton_Agregar_Carrito)
        );
        // Manejar la alerta
        try {
            Thread.sleep(1000); // Esperar un segundo para asegurar que la alerta aparezca
            WebDriver driver = actor.abilityTo(BrowseTheWeb.class).getDriver();
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            // Manejo de excepción si no se encuentra la alerta
            e.printStackTrace();
        }

        // Continuar con la navegación al carrito
        actor.attemptsTo(
                Click.on(Cart.Cart)
        );

        // Esperar por 10 segundos para verificar los elementos del carrito
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static LogInCart logInCart() {
        return instrumented(LogInCart.class);
    }
}
