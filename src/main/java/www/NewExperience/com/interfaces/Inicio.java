package www.NewExperience.com.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Inicio {
    public static final Target Register = Target.the("register").
            locatedBy("//a[@class=\"login\"]");
    public static final Target intoemail = Target.the("register").
            locatedBy("//input[@id=\"email_create\"]");
    public static final Target btnCreate = Target.the("register").
            locatedBy("//button[@id=\"SubmitCreate\"]");

    public static final Target logo = Target.the("register").
            locatedBy("//div[@id=\"header_logo\"]");

}
