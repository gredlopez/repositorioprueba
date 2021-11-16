package www.NewExperience.com.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Info_personal {
    public static final Target Radio1 = Target.the("MR").
            locatedBy("//div[@id=\"uniform-id_gender1\"]");

    public static final Target Firstname = Target.the("first name").
            locatedBy("//input[@id=\"customer_firstname\"]");
    public static final Target Lastname = Target.the("last name").
            locatedBy("//input[@id=\"customer_lastname\"]");
    public static final Target Passw = Target.the("email").
            locatedBy("//input[@id=\"passwd\"]");


    public static final Target Brithday = Target.the("day").
            locatedBy("//select[@id=\"days\"]");
    public static final Target Month = Target.the(" monts").
            locatedBy("//select[@id=\"months\"]");
    public static final Target BirthYear = Target.the("birth Year").
            locatedBy("//select[@id=\"years\"]");

    //adress

    public static final Target name = Target.the("name").
            locatedBy("//input[@id=\"firstname\"]");
    public static final Target Lstname = Target.the("Last name").
            locatedBy("//input[@id=\"lastname\"]");
    public static final Target Company = Target.the("my company").
            locatedBy("//input[@id=\"company\"]");
    public static final Target Adress = Target.the("my Adress").
            locatedBy("//input[@id=\"address1\"]");
    public static final Target City = Target.the("city").
            locatedBy("//input[@id=\"city\"]");
    public static final Target State = Target.the("state").
            locatedBy("//select[@id=\"id_state\"]");
    public static final Target PostalCode = Target.the("postal code").
            locatedBy("//input[@id=\"postcode\"]");
    public static final Target phone = Target.the("phone mobile").
            locatedBy("//input[@id=\"phone_mobile\"]");


    public static final Target create = Target.the("btn create").
            locatedBy("//button[@id=\"submitAccount\"]");




}
