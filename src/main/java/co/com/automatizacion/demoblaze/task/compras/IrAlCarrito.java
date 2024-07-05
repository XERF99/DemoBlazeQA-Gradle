package co.com.automatizacion.demoblaze.task.compras;

import co.com.automatizacion.demoblaze.ui.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Cart.Cart)
        );
        try {
            sleep(5000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static IrAlCarrito irAlCarrito() {
        return instrumented(IrAlCarrito.class);
    }
}
