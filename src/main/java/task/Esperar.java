package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Esperar implements Task {
    private final int segundos;

    public Esperar(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static Esperar segundos(int segundos) {
        return new Esperar(segundos);
    }
}
