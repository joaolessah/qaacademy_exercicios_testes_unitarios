package medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio03_medium;

public class TestExercicio03 {
    static Exercicio03_medium exercicio03_medium;

    @BeforeClass
    public static void before (){
        exercicio03_medium = new Exercicio03_medium();
    }

    @Test
    public void somaNumerosAcumulados (){
        Exercicio03_medium.somaNumerosAcumulados();
    }
}
