package co.com.accenture.certification.swaglabs.tasks.navegarpantallas;

import co.com.accenture.certification.swaglabs.interactions.DesplazarPantalla;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.accenture.certification.swaglabs.userinterfaces.ComprasSection.*;

public class NavegarPantallaCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!BTN_AGREGAR_CARRITO.resolveFor(actor).isVisible()){
            actor.attemptsTo(DesplazarPantalla.haciaArriba());
            if (BTN_AGREGAR_CARRITO.resolveFor(actor).isVisible()){
                break;
            }
        }
    }
}
