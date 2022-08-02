package task;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

public class GoTo implements Task {
    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor){

        String url = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url");

        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static GoTo theUrl(){
        return Tasks.instrumented(GoTo.class);
    }

}
