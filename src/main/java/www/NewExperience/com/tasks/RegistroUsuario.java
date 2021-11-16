package www.NewExperience.com.tasks;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import www.NewExperience.com.interfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RegistroUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Inicio.Register),
                SendKeys.of("grFuuenniiuoegopoo.lopez@gmail.com").into(Inicio.intoemail),
                Click.on(Inicio.btnCreate),
                Click.on(Info_personal.Radio1),
                SendKeys.of("manuel").into(Info_personal.Firstname),
                SendKeys.of("guzman").into(Info_personal.Lastname),
                SendKeys.of("perez").into(Info_personal.Passw),
                Click.on(Info_personal.Brithday),
                Hit.the(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).into(Info_personal.Brithday),
                Click.on(Info_personal.Month),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(Info_personal.Month),
                Click.on(Info_personal.BirthYear),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(Info_personal.BirthYear),
                SendKeys.of("manuel").into(Info_personal.name),
                SendKeys.of("guzman").into(Info_personal.Lstname),
                SendKeys.of("Choucair").into(Info_personal.Company),
                SendKeys.of("call-34 32 3KR2").into(Info_personal.Adress),
                SendKeys.of("Medellin").into(Info_personal.City),
                Click.on(Info_personal.State),
                Hit.the(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).into(Info_personal.State),
                SendKeys.of("23102").into(Info_personal.PostalCode),
                SendKeys.of("31351137").into(Info_personal.phone),
                Click.on(Info_personal.create),
                Click.on(Inicio.logo),
                Scroll.to(producto.item),
                Click.on(producto.item),
                Click.on(producto.Close),
                SendKeys.of("Blouse").into(buscar.bar),
                Hit.the(Keys.ENTER).into(buscar.bar),
                Scroll.to(buscar.Blouse),
                Click.on(buscar.Blouse),
                Click.on(articulo.size),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(articulo.size)




// Click.on(buscar.Close)


        );
    }
    public static RegistroUsuario information(){
        return instrumented(RegistroUsuario.class);
    }
}
