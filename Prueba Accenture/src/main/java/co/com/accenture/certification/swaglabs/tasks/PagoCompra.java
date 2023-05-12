package co.com.accenture.certification.swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.accenture.certification.swaglabs.userinterfaces.CarritoDeComprasSection.*;
import static co.com.accenture.certification.swaglabs.utils.constants.Constants.*;

public class PagoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CHECKOUT),
                Enter.theValue(CLIENT_NAME).into(TXT_NOMBRE_COMPRADOR),
                Enter.theValue(CLIENT_LASTNAME).into(TXT_APELLIDO_COMPRADOR),
                Enter.theValue(CLIENT_POSTAL_CODE).into(TXT_CODIGOPOSTAL_COMPRADOR),
                Click.on(BTN_CONTINUE)
        );
    }
    public static PagoCompra pago() {
        return new PagoCompra();
    }
}
