package co.com.automatizacion.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro.feature",
    glue = "co.com.automatizacion.demoblaze.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE//, tags = "@Registro"
)
public class RunnerRegistro {

}
