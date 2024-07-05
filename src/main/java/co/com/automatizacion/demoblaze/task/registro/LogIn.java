package co.com.automatizacion.demoblaze.task.registro;

import co.com.automatizacion.demoblaze.ui.Home;
import co.com.automatizacion.demoblaze.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String usuario = actor.recall("Usuario");
        actor.attemptsTo(
                Click.on(Home.Log_in),
                Enter.theValue(usuario).into(Home.Username),
                Enter.theValue(Constantes.Password).into(Home.Password),
                Click.on(Home.Boton_Login)
        );
        try {
            sleep(3000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static LogIn logIn() {
        return instrumented(LogIn.class);
    }
}
