package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.ValidacionesPago;

public class ValidarCotizacion  {

    public static Question<String> pago(){
        return actor -> Text.of(ValidacionesPago.OBTEN_TU_SOAT_TEXT).answeredBy(actor);
    }
}
