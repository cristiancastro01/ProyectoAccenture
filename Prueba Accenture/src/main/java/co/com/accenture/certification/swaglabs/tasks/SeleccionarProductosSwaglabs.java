package co.com.accenture.certification.swaglabs.tasks;

import co.com.accenture.certification.swaglabs.models.Productos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

import static co.com.accenture.certification.swaglabs.userinterfaces.ComprasSection.*;

public class SeleccionarProductosSwaglabs implements Task {
    private Productos producto;

    public SeleccionarProductosSwaglabs(Productos producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECCIONAR_PRODUCTO.of(producto.getProducto())),
                Click.on(LABEL_DESCRIPTION)
        );

    }

    public static SeleccionarProductosSwaglabs seleccion(Productos producto){
        return Tasks.instrumented(SeleccionarProductosSwaglabs.class, producto);
    }
}
