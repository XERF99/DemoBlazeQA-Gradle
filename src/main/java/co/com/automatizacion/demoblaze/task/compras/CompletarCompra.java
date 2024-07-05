package co.com.automatizacion.demoblaze.task.compras;

import co.com.automatizacion.demoblaze.ui.Factura;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Factura.Factura_Boton_Purchase)
        );

        try {
            sleep(3000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static CompletarCompra completarCompra() {
        return instrumented(CompletarCompra.class);
    }
}
