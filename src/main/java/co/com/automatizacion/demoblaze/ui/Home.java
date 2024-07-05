package co.com.automatizacion.demoblaze.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public static final Target Sing_up = Target.the("SIGN UP")
            .locatedBy("//a[@id=\"signin2\"]");

    public static final Target Name_registro = Target.the("Name Registro")
            .located(By.id("sign-username"));

    public static final Target Password_registro = Target.the("Password Registro")
            .located(By.id("sign-password"));

    public static final Target Boton_Registro = Target.the("Registro completado")
            .locatedBy("//button[@onclick=\"register()\"]");

    public static final Target Log_in = Target.the("LOG IN")
            .located(By.id("login2"));

    public static final Target Username = Target.the("USERNAME")
            .located(By.id("loginusername"));

    public static final Target Password = Target.the("Password Registro")
            .located(By.id("loginpassword"));

    public static final Target Boton_Login = Target.the("Boton Login")
            .locatedBy("//button[@onclick=\"logIn()\"]");

    public static final Target Usuario_ingresado = Target.the("Usuario Ingresado")
            .locatedBy("//a[@id=\"nameofuser\"]");

    // Para el registro en el carro de compras
    public static final Target Cart = Target.the("Cart Link")
            .locatedBy("//a[@id=\"cartur\"]");

    public static final Target CelularSamsung = Target.the("Celular Samsung")
            .locatedBy("(//a[@href=\"prod.html?idp_=1\"])[2]");


    public static final Target Boton_Agregar_Carrito = Target.the("Agregar al carrito")
            .locatedBy("//a[@onclick=\"addToCart(1)\"]");


    public static final Target Boton_Home = Target.the("Boton Home")
            .locatedBy("//a[@id=\"nava\"]");

    public static Target producto(String nombreProducto) {
        return Target.the("Producto " + nombreProducto)
                .locatedBy("//a[text()='" + nombreProducto + "']");
    }

    public static Target Boton_Agregar_producto(String idCarrito) {
        return Target.the("Producto " + idCarrito)
                .locatedBy("//a[@onclick=\"addToCart("+idCarrito+")\"]");
    }
}
