#language: es
#Author: francisxavi090@gmail.com

  Característica: Como Tester quiero realizar una prueba de automatización al sitio web de DemoBlaze para la compra
    de dos productos.

  @Compra
  Escenario: Compra de dos productos en la tienda de DemoBlaze
    Dado que el usuario abre la pagina de Demoblaze
    Cuando el usuario selecciona el primer producto
    Y el usuario coloca el primer producto en el carrito
    Entonces el usuario regresa a la pagina principal
    Cuando el usuario selecciona el segundo producto
    Y el usuario coloca el segundo producto en el carrito
    Entonces el usuario verifica que los productos en el carrito son los que selecciono
    Y el usuario verifica que el monto a pagar es "1180"
    Cuando el usuario procede al pago
    Y el usuario ingresa sus datos de facturacion
    Y el usuario confirma la compra
    Entonces el usuario verifica que el mensaje de confirmacion es "Thank you for your purchase!"
    Y el usuario hace clic en el boton OK
    Entonces la compra finaliza exitosamente