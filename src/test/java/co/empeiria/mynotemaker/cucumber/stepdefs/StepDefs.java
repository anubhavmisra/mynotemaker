package co.empeiria.mynotemaker.cucumber.stepdefs;

import co.empeiria.mynotemaker.MynotemakerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MynotemakerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
