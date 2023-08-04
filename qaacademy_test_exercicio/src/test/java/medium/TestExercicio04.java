package medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio04_medium;

public class TestExercicio04 {
    static Exercicio04_medium exercicio04_medium;

    @BeforeClass
    public static void before (){
        exercicio04_medium = new Exercicio04_medium();
    }

    @Test
    public void multiplicacaoNumerosAteMil (){
        exercicio04_medium.multiplicacaoNumerosAteMil();
    }
}
