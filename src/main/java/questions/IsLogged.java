package questions;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.util.EnvironmentVariables;

import static userinterface.loginpage.LOGIN_MESSAGE;

public class IsLogged implements Question<Boolean> {

    private EnvironmentVariables environmentVariables;


    @Override
    public Boolean answeredBy(Actor actor) {

        String message = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("message");

        actor.attemptsTo(
                Ensure.that(LOGIN_MESSAGE).text().contains(message)
        );
        return true;
    }
    public static IsLogged validated() {
        return new IsLogged();
    }
}
