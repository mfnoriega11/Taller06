package co.com.choucair.reto.tasks;

import co.com.choucair.reto.model.Reunion;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import co.com.choucair.reto.util.Constantes;

import java.util.List;

import static co.com.choucair.reto.userinterface.ReunionPage.*;

public class Programar implements Task {

    Reunion datosReunion;


    public Programar(Reunion datosReunion) {
        this.datosReunion = datosReunion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_REUNION),
                Click.on(LINK_PROGRAMAR_REUNION),
                Click.on(BOTON_NUEVA_REUNION),
                Enter.theValue(datosReunion.getNombre()).into(CAMPO_NOMBRE_REUNION),
                Click.on(CAMPO_Link_Reunion),
                Click.on(CAMPO_Unidad),
                Enter.theValue(datosReunion.getUnidad()).into(CAMPO_Unidad).thenHit(Keys.ENTER),
                Enter.theValue(datosReunion.getTelefono()).into(Campo_Tefelono),
                Click.on(Ubicacion),
                Enter.theValue(datosReunion.getUbicacion()).into(Nombre_Ubicacion),
                Click.on(Guardar_Ubicacion),
                Click.on(Btn_Guardar)

        );
    }

    public static Programar unaReunion(List<Reunion> datosReunion){

        return Instrumented.instanceOf(Programar.class).withProperties(datosReunion.get(0));
    }
}
