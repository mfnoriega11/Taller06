package co.com.choucair.reto.questions;
import co.com.choucair.reto.userinterface.ReunionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;



public class Answer implements Question<Boolean> {
    private String questions;

    public Answer (String questions)
    {
        this.questions=questions;
    }

    public static Answer toThe (String questions)
        {
            return new Answer(questions);

         }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String nombre_reunion = Text.of(ReunionPage.Nombre_de_La_Reunion).viewedBy(actor).asString();
        if (questions.equals(nombre_reunion))
        {
            result = true;
        }
          else
        {
            result = false;

        }
        return result;
    }
}
