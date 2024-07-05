package co.com.automatizacion.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cart {
    public static final Target Cart = Target.the("Cart Link")
            .locatedBy("//a[@id=\"cartur\"]");

    public static final Target Producto = Target.the("Producto")
            .locatedBy("(//tr[@class=\"success\"])[1]");

    public static Target Lista_Productos (String idProducto) {
        return Target.the("Producto " + idProducto)
                .locatedBy("(//tr[@class=\"success\"])["+idProducto+"]");
    }

    public static final Target Lista_Productos = Target.the("Product list in cart")
            .locatedBy("//tr[@class='success']/td[2]");

    public static final Target Valor_Total = Target.the("Valor a pagar")
            .located(By.id("totalp"));

    public static final Target Boton_Place_Order = Target.the("Boton Place Order")
            .locatedBy("//button[normalize-space()='Place Order']");
}
