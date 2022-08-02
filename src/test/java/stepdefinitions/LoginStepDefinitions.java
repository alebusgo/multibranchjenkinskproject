package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.IsLogged;
import task.FillTheForm;
import task.GoTo;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} has opened the web site")
    public void thatUserHasOpenedTheWebSite(String actorName) {
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }
    @When("he fills the login form")
    public void heFillsTheLoginForm() {
        theActorInTheSpotlight().attemptsTo(FillTheForm.with());
    }
    @Then("he should access to his account")
    public void heShouldAccessToHisAccount() {
        theActorInTheSpotlight().should(seeThat(IsLogged.validated()));
    }
}
