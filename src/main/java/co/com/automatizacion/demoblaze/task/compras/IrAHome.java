package co.com.automatizacion.demoblaze.task.compras;

import co.com.automatizacion.demoblaze.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAHome implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(Home.Boton_Home)
        );
    }

    public static IrAHome irAHome() {
        return instrumented(IrAHome.class);
    }
}
