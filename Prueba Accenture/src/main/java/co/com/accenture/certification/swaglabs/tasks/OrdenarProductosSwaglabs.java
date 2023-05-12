package co.com.accenture.certification.swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.certification.swaglabs.userinterfaces.ComprasSection.*;

public class OrdenarProductosSwaglabs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FILTROS),
                Click.on(BTN_ORDER_ALFABET)
        );
    }
    public static OrdenarProductosSwaglabs ordenAlfabetico(){
        return new OrdenarProductosSwaglabs();
    }
}
