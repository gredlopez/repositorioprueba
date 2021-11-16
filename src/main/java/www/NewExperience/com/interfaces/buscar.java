package www.NewExperience.com.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class buscar {
    public static final Target  bar = Target.the("shearch bar").
            locatedBy("//input[@id=\"search_query_top\"]");

    public static final Target  Blouse = Target.the("Blouse").
            locatedBy("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");

    public static final Target  Close = Target.the("close windows").
            locatedBy("//*[@id=\"search\"]/div[2]/div/div/a");

}


