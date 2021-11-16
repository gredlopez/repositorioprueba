package www.NewExperience.com.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class articulo {
    public static final Target size = Target.the("Blouse size").
            locatedBy("//select[@id=\"group_1\"]");
    public static final Target ButtonCart = Target.the("Cart").
            locatedBy("//button[@name=\"Submit\"]");
    public static final Target Confirmcar = Target.the("article added").
            locatedBy("//*[@id=\"layer_cart\"]/div[1]");
    public static final Target Checkout = Target.the("article added").
            locatedBy("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    public static final Target ProceedCheckout = Target.the(" Proceed to Checkout").
            locatedBy("//*[@id=\"center_column\"]/p[2]/a[1]");
    public static final Target processAddress = Target.the("processAddress").
            locatedBy("//button[@name=\"processAddress\"]");
    public static final Target Termsservice = Target.the("Terms of service").
            locatedBy("//input[@id=\"cgv\"]");
    public static final Target processOrder = Target.the("processCarrier").
            locatedBy("//button[@name=\"processCarrier\"]");
    public static final Target payment = Target.the("Terms of service").
            locatedBy("//a[@class=\"bankwire\"]");
    public static final Target Finish = Target.the("Finish").
            locatedBy("//*[@id=\"cart_navigation\"]/button");


}
