package co.com.accenture.certification.swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.certification.swaglabs.userinterfaces.ComprasSection.*;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AGREGAR_CARRITO),
                Click.on(BTN_VOLVER_PRODUCTOS)
        );
    }

    public static AgregarProducto addProduct(){
        return new AgregarProducto();
    }
}
