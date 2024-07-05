package co.com.automatizacion.demoblaze.questions.compras;


import co.com.automatizacion.demoblaze.ui.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class VerificacionProducto implements Question<Boolean> {

    private final List<String> productosEsperados;

    public VerificacionProducto(List<String> productosEsperados) {
        this.productosEsperados = productosEsperados;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        List<String> nombresEnTabla = Cart.Lista_Productos.resolveAllFor(actor).stream()
                .map(element -> element.getText().trim().toLowerCase()) // Convertir a minúsculas
                .collect(Collectors.toList());

        List<String> productosEsperadosLower = productosEsperados.stream()
                .map(String::toLowerCase) // Convertir a minúsculas
                .collect(Collectors.toList());

        // Ordenar ambas listas antes de la comparación
        Collections.sort(productosEsperadosLower);
        Collections.sort(nombresEnTabla);

        System.out.println("Productos esperados: " + productosEsperadosLower);
        System.out.println("Productos en tabla: " + nombresEnTabla);

        return nombresEnTabla.equals(productosEsperadosLower);
    }

    public static VerificacionProducto verificacionProducto(List<String> productosEsperados){
        return new VerificacionProducto(productosEsperados);
    }
}
