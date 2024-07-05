package co.com.automatizacion.demoblaze.questions.registro;

import co.com.automatizacion.demoblaze.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificacionUsuario implements Question <Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        String Usuario = actor.recall("Usuario");
        boolean compare = Home.Usuario_ingresado.resolveFor(actor).getText().equals("Welcome "+Usuario);
        return compare;
    }

    public static VerificacionUsuario verificacionUsuario(){
        return new VerificacionUsuario();
    }
}
