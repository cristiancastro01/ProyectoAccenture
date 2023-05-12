package co.com.accenture.certification.swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.certification.swaglabs.userinterfaces.ComprasSection.*;

public class ConfirmarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CARRITO)
        );
    }

    public static ConfirmarCompra confirmar() {
        return new ConfirmarCompra();
    }
}
