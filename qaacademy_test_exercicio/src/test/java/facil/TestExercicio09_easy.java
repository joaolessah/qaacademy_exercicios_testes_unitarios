import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio09_easy;

public class TestExercicio09_easy {

    static Exercicio09_easy exercicio09_easy;

    @BeforeClass
    public static void before(){
        exercicio09_easy = new Exercicio09_easy();
    }

    @Test
    public void testeTabuada(){
        Exercicio09_easy.tabuada(10);
    }
    
}
