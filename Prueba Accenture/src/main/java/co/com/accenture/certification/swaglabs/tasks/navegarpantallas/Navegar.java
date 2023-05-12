package co.com.accenture.certification.swaglabs.tasks.navegarpantallas;

import net.serenitybdd.screenplay.Performable;

import static co.com.accenture.certification.swaglabs.utils.constants.TipoClaseConstante.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar {
    private Navegar() {
        throw new IllegalStateException(CLASE_TASK);
    }

    public static Performable pantallaCompra() {
        return instrumented(NavegarPantallaCompra.class);
    }

    public static Performable pantallaFinal() {
        return instrumented(NavegarPantallaPago.class);
    }

    public static Performable pantallaFinalizar() {
        return instrumented(NavegarPantallaFinalizar.class);
    }
}
