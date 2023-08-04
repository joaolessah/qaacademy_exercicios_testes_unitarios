package medium;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio05_medium;

public class TestExercicio05 {

    static Exercicio05_medium exercicio05_medium;

    @BeforeClass
    public static void before(){
        exercicio05_medium = new Exercicio05_medium();
    }

    @Test
    public void verificarMenorNumero(){
        Assert.assertEquals(1,exercicio05_medium.verificaMenorNumero());
        
    }
}
