package com.cedaniel200.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/prueba_cucumber4.feature"},
        glue = {"com.cedaniel200.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class PruebaCucumber4 {

}