package co.com.automatizacion.demoblaze.task.compras;

import co.com.automatizacion.demoblaze.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ColocarCarrito implements Task {

    private final String xpathCarrito;

    public ColocarCarrito(String xpathCarrito) {
        this.xpathCarrito = xpathCarrito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.Boton_Agregar_producto(xpathCarrito))
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
    }

    public static ColocarCarrito colocarCarrito(String xpathCarrito) {
        return instrumented(ColocarCarrito.class, xpathCarrito);
    }
}
