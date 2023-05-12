package co.com.accenture.certification.swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.accenture.certification.swaglabs.userinterfaces.LoginSection.*;
import static co.com.accenture.certification.swaglabs.utils.constants.Constants.*;

public class LoginSwaglabs  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USER_NAME).into(TXT_USER),
                Enter.theValue(USER_PASSWORD).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginSwaglabs inTheLogin() {
        return new LoginSwaglabs();
    }
}
