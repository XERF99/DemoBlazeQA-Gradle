package co.com.automatizacion.demoblaze.questions.registro;

import co.com.automatizacion.demoblaze.ui.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificacionProductoUno implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("Comparacion:" + Cart.Producto.resolveFor(actor).getText());
        boolean compare = Cart.Producto.resolveFor(actor).getText().contains("Samsung galaxy s6");
        return compare;
    }

    public static VerificacionProductoUno verificacionProductoUno(){
        return new VerificacionProductoUno();
    }

}
