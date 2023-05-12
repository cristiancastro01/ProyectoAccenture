package co.com.accenture.certification.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ComprasSection {
    public static final Target BTN_FILTROS = Target.the("boton que nos muestra los filtros")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Modal Selector Button']/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    public static final Target BTN_ORDER_ALFABET = Target.the("boton para selecionar el filtro de orden algabetico")
            .locatedBy("//android.widget.ScrollView[@content-desc='Selector container']/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
    public static final Target SELECCIONAR_PRODUCTO = Target.the("Selecciona el producto")
            .locatedBy("(//android.widget.TextView[@text='{0}'])");
    public static final Target LABEL_DESCRIPTION = Target.the("Label con el nombre del producto")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Description']/android.widget.TextView");
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Agregar el producto al carrito")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-ADD TO CART']");
    public static final Target BTN_VOLVER_PRODUCTOS = Target.the("Volver al menu de productos")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-BACK TO PRODUCTS']");
    public static final Target BTN_CARRITO = Target.the("ir al carrito de compras")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.ImageView");
}
