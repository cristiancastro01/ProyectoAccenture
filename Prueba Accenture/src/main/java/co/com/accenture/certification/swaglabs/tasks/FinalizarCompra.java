package co.com.accenture.certification.swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.certification.swaglabs.userinterfaces.CarritoDeComprasSection.*;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FINALIZAR)
        );
    }

    public static FinalizarCompra finish() {
        return new FinalizarCompra();
    }
}
