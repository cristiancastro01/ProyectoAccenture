package co.com.accenture.certification.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginSection {
    public static final Target TXT_USER = Target.the("cuadro de texto usuario").locatedBy("//android.widget.EditText[@content-desc='test-Username']");
    public static final Target TXT_PASSWORD = Target.the("cuadro de texto contraseña").locatedBy("//android.widget.EditText[@content-desc='test-Password']");
    public static final Target BTN_LOGIN = Target.the("Boton login").locatedBy("//android.view.ViewGroup[@content-desc='test-LOGIN']");

}
