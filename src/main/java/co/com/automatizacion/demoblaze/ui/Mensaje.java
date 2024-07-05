package co.com.automatizacion.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Mensaje {

    public static final Target Mensaje_compra_exitosa = Target.the("Mensaje de compra exitosa")
            .locatedBy("//h2[normalize-space()='Thank you for your purchase!']");

    public static final Target Boton_OK = Target.the("Boton OK")
            .locatedBy("//button[normalize-space()='OK']");


}
