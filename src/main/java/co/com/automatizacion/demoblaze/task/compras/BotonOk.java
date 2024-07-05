package co.com.automatizacion.demoblaze.task.compras;

import co.com.automatizacion.demoblaze.ui.Mensaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonOk implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Mensaje.Boton_OK)
        );
    }

    public static BotonOk botonOk() {
        return instrumented(BotonOk.class);
    }
}
