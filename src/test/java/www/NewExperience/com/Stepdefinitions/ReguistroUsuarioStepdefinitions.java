package www.NewExperience.com.Stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.actions.Open;
import www.NewExperience.com.interfaces.Paginaprincipal;
import www.NewExperience.com.tasks.Compra;
import www.NewExperience.com.tasks.RegistroUsuario;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReguistroUsuarioStepdefinitions {
    @Managed(driver = "chrome")
    public WebDriver navegador;
    public Paginaprincipal paginaprincipal = new  Paginaprincipal();
    public   Actor actor = Actor.named("Gregoria");

    @Dado("^:  Que el usuario este en la pagina de inicio$")
    public void que_el_usuario_este_en_la_pagina_de_inicio() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(paginaprincipal));

    }

    @Cuando("^: El usuario desee completar todos los campos para reguistrarse$")
    public void el_usuario_desee_completar_todos_los_campos_para_reguistrarse() {
        actor.attemptsTo(RegistroUsuario.information());

    }

    @Entonces("^: puede tener acceso a la pagina para compar un articulo$")
    public void puedeTenerAccesoALaPaginaParaComparUnArticulo() {
        actor.attemptsTo(Compra.item());
    }



    }


