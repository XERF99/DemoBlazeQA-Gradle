package co.com.automatizacion.demoblaze.questions.compras;

import co.com.automatizacion.demoblaze.ui.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificacionValorAPagar implements Question<String> {

    private final String montoEsperado;

    public VerificacionValorAPagar(String montoEsperado) {
        this.montoEsperado = montoEsperado;
    }

    @Override
    public String answeredBy(Actor actor) {
        String montoActual = Cart.Valor_Total.resolveFor(actor).getText().trim();
        System.out.println("Monto esperado: " + montoEsperado);
        System.out.println("Monto actual: " + montoActual);
        return montoActual;
    }

    public static VerificacionValorAPagar verificacionValorAPagar(String montoEsperado) {
        return new VerificacionValorAPagar(montoEsperado);
    }
}
