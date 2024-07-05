package co.com.automatizacion.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Factura {

    public static final Target Factura_Nombre = Target.the("Nombre de la factura")
            .locatedBy("//input[@id='name']");

    public static final Target Factura_Pais = Target.the("Pais de la factura")
            .locatedBy("//input[@id='country']");

    public static final Target Factura_Ciudad = Target.the("Ciudad de la factura")
            .locatedBy("//input[@id='city']");

    public static final Target Factura_Tarjeta_Credito = Target.the("Tarjeta de credito de la factura")
            .locatedBy("//input[@id='card']");

    public static final Target Factura_Mes = Target.the("Mes de la factura")
            .locatedBy("//input[@id='month']");

    public static final Target Factura_Anio = Target.the("Anio de la factura")
            .locatedBy("//input[@id='year']");

    public static final Target Factura_Boton_Purchase = Target.the("Boton Purchase de la factura")
            .locatedBy("//button[normalize-space()='Purchase']");


}
