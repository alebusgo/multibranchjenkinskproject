package task;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.util.EnvironmentVariables;

import static userinterface.loginpage.*;

public class FillTheForm implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {

        String username = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("username");
        String password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("password");

        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(LOGIN_BTN)
        );
    }
    public static FillTheForm with(){
        return Tasks.instrumented(FillTheForm.class);
    }
}
