package co.com.automatizacion.demoblaze.task.compras;

import co.com.automatizacion.demoblaze.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {

    private final String producto;

    public SeleccionarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.producto(producto))
        );
    }

    public static SeleccionarProducto seleccionarProducto(String producto) {
        return instrumented(SeleccionarProducto.class, producto);
    }
}
