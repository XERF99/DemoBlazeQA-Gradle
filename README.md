Proyecto de Automatización de Pruebas para DemoBlaze
Este proyecto utiliza Serenity BDD con el patrón Screenplay para automatizar pruebas en el sitio web de DemoBlaze. Las pruebas están escritas en lenguaje Gherkin y se ejecutan utilizando JUnit.


Requisitos

- Java JDK 11 o superior
- Gradle 7.0 o superior
- IntelliJ IDEA (opcional, pero recomendado para desarrollo)
- Navegador Chrome

Instalación
1. Clona este repositorio:
  - git clone https://github.com/XERF99/DemoBlazeQA-Gradle.git
  - cd DemoBlazeQA-Gradle
2. Configura las dependencias utilizando Gradle:
   - .\gradlew clean build
Estructura del Proyecto
   - src/main/java: Contiene el código fuente principal.
   - co.com.automatizacion.demoblaze.tasks: Clases que definen tareas que los actores pueden realizar.
   - co.com.automatizacion.demoblaze.questions: Clases que definen las preguntas que los actores pueden hacer.
   - co.com.automatizacion.demoblaze.userinterface: Clases que definen los mapeos de los elementos de la interfaz de usuario.
   - co.com.automatizacion.demoblaze.utils: Clases que definen las constantes de los elementos de la interfaz de usuario.
   - src/test/java: Contiene las pruebas.
   - co.com.automatizacion.demoblaze.stepdefinitions: Clases que definen los pasos de las pruebas.
   - co.com.automatizacion.demoblaze.runners: Clases que configuran y ejecutan las pruebas.
   - src/test/resources: Contiene los archivos de características (Gherkin).

Ejecución de Pruebas
1. Para ejecutar todas las pruebas, usa el siguiente comando:
    .\gradlew clean test

2. Para ejecutar un conjunto específico de pruebas, puedes usar el nombre del runner. Por ejemplo:
   .\gradlew clean test --tests "co.com.certification.demoblaze.runners.RunnerRegistro"

Ejemplo de Ejecución de Pruebas
Para ejecutar las pruebas del caso de registro:
    .\gradlew clean test --tests "co.com.certification.demoblaze.runners.RunnerRegistro"

Programas utilizados

- IntelliJ IDEA
- Navegador Chrome en su version 126

Problemas Comunes
SLF4J No-operation Logger: Si ves advertencias sobre SLF4J, puedes ignorarlas o agregar una implementación de SLF4J en tu archivo build.gradle.
Versiones de CDP: Asegúrate de usar una versión de Selenium compatible con tu versión de Chrome.

Contribución
- Crea un fork del proyecto.
- Crea una rama (git checkout -b feature/nueva-funcionalidad).
- Realiza tus cambios y commitea (git commit -am 'Añade nueva funcionalidad').
- Empuja la rama (git push origin feature/nueva-funcionalidad).
- Crea un Pull Request.
- Licencia
Este proyecto está licenciado bajo la Licencia MIT.
