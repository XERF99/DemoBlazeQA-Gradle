package co.com.automatizacion.demoblaze.task.registro;

import co.com.automatizacion.demoblaze.ui.Home;
import co.com.automatizacion.demoblaze.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int valor = new Random().nextInt(10000+1)+1;
        String username = Constantes.Name + valor;
        actor.attemptsTo(
                Click.on(Home.Sing_up),
                Enter.theValue(Constantes.Name+valor).into(Home.Name_registro),
                Enter.theValue(Constantes.Password).into(Home.Password_registro),
                Click.on(Home.Boton_Registro)
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

        actor.remember("Usuario", Constantes.Name+valor);
    }

    public static Registro registro() {
        return instrumented(Registro.class);
    }
}
