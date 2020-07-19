package pa.com.demo.automationtesting.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.demo.automationtesting.certificacion.userinteface.FormValidationPage;

public class Answer implements Question<Boolean>{
    private String question;
    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(FormValidationPage.OUTPUT_TEXT).viewedBy(actor).asString();
        if(question.equals(nameCourse)){
            result = false;
        }else{
            result = true;
        }
        return result;
    }
}
