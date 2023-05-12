package co.com.accenture.certification.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoDeComprasSection {
    public static final Target BTN_CHECKOUT = Target.the("Boton para finalizar la compra")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-CHECKOUT']");
    public static final Target TXT_NOMBRE_COMPRADOR = Target.the("cuadro de texto para el nombre del comprador")
            .locatedBy("//android.widget.EditText[@content-desc='test-First Name']");
    public static final Target TXT_APELLIDO_COMPRADOR = Target.the("cuadro de texto para el apellido del comprador")
            .locatedBy("//android.widget.EditText[@content-desc='test-Last Name']");
    public static final Target TXT_CODIGOPOSTAL_COMPRADOR = Target.the("cuadro de texto para el codigo postal del comprador")
            .locatedBy("//android.widget.EditText[@content-desc='test-Zip/Postal Code']");
    public static final Target BTN_CONTINUE = Target.the("Boton para continuar con el pago")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-CONTINUE']");
    public static final Target BTN_FINALIZAR = Target.the("Boton para finalizar el pago")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-FINISH']");
    public static final Target LABEL_CHECKOUT = Target.the("Label para verificar que se llego al final de la transaccion")
            .locatedBy("//android.widget.ScrollView[@content-desc='test-CHECKOUT: COMPLETE!']/android.view.ViewGroup/android.widget.TextView[1]");


}
