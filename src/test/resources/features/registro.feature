#language: es
#Author: francisxavi090@gmail.com

  Característica: DemoBlaze

    @Registro
    Escenario: Registro exitoso
      Dado soy un usuario de DemoBlaze sin credenciales
      Cuando ingreso informacion necesaria para creacion de usuario
      Entonces se realiza el registro exitoso

    @Carrito
    Escenario: Registro carrito
      Dado que soy un usuario de DemoBlaze
      Cuando agrego un celular al carrito
      Entonces verifico que se encuentre agregado
