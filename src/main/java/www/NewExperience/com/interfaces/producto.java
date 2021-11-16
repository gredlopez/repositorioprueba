package www.NewExperience.com.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class producto {

    public static final Target item = Target.the("item to see").
            locatedBy("//*[@id=\"homefeatured\"]/li[7]/div/div[1]/div/a[1]/img");
    public static final Target Close = Target.the("close windws ").
            locatedBy("//*[@id=\"index\"]/div[2]/div/div/a");
    public static final Target product = Target.the("city").
            locatedBy("//body[@id=\"product\"]");
    public static final Target PostalCode = Target.the("postal code").
            locatedBy("//input[@id=\"zip\"]");

}



