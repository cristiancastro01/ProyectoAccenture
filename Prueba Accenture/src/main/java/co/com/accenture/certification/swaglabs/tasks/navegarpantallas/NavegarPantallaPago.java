package co.com.accenture.certification.swaglabs.tasks.navegarpantallas;

import co.com.accenture.certification.swaglabs.interactions.DesplazarPantalla;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.accenture.certification.swaglabs.userinterfaces.CarritoDeComprasSection.*;

public class NavegarPantallaPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!BTN_CHECKOUT.resolveFor(actor).isVisible()){
            actor.attemptsTo(DesplazarPantalla.haciaArriba());
            if (BTN_CHECKOUT.resolveFor(actor).isVisible()){
                break;
            }
        }
    }
}
