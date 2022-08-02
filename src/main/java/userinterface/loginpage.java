package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class loginpage {

    public static final Target USERNAME_INPUT = Target.the("Label input username").locatedBy("#username");
    public static final Target PASSWORD_INPUT = Target.the("Label input PASSWORD").locatedBy("#password");
    public static final Target LOGIN_BTN = Target.the("Login button").locatedBy("//button[@type='submit']");
    public static final Target LOGIN_MESSAGE = Target.the("Login message").locatedBy("#flash");
}
