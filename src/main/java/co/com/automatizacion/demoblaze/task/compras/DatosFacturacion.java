package co.com.automatizacion.demoblaze.task.compras;

import co.com.automatizacion.demoblaze.ui.Factura;
import co.com.automatizacion.demoblaze.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosFacturacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Constantes.Nombre).into(Factura.Factura_Nombre),
                Enter.theValue(Constantes.Pais).into(Factura.Factura_Pais),
                Enter.theValue(Constantes.Ciudad).into(Factura.Factura_Ciudad),
                Enter.theValue(Constantes.Tarjeta_Credito).into(Factura.Factura_Tarjeta_Credito),
                Enter.theValue(Constantes.Mes).into(Factura.Factura_Mes),
                Enter.theValue(Constantes.Anio).into(Factura.Factura_Anio)

        );
    }

    public static DatosFacturacion datosFacturacion() {
        return instrumented(DatosFacturacion.class);
    }
}
