package co.com.automatizacion.demoblaze.questions.compras;

import co.com.automatizacion.demoblaze.ui.Cart;
import co.com.automatizacion.demoblaze.ui.Mensaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificacionMensajeCompra implements Question<String> {
    private final String mensajeEsperado;

    public VerificacionMensajeCompra(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    @Override
    public String answeredBy(Actor actor) {
        String mensajeActual = Mensaje.Mensaje_compra_exitosa.resolveFor(actor).getText().trim();
        System.out.println("Mesaje esperado: " + mensajeEsperado);
        System.out.println("Mensaje actual: " + mensajeActual);
        return mensajeActual;
    }

    public static VerificacionMensajeCompra verificacionMensajeCompra(String mensajeEsperado) {
        return new VerificacionMensajeCompra(mensajeEsperado);
    }

}
