package www.NewExperience.com.tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import www.NewExperience.com.interfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Compra implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(articulo.ButtonCart),
                WaitUntil.the(articulo.Confirmcar,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(articulo.Checkout),
                Scroll.to(articulo.ProceedCheckout),
                Click.on(articulo.ProceedCheckout),
                Scroll.to(articulo.processAddress),
                Click.on(articulo.processAddress),
                Click.on(articulo.Termsservice),
                Click.on(articulo.processOrder),
                Scroll.to(articulo.payment),
                Click.on(articulo.payment),
                Scroll.to(articulo.Finish),
                Click.on(articulo.Finish)
        );
    }
    public static Compra item(){
        return instrumented(Compra.class);
    }

}
