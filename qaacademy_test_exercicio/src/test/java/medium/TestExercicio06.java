package medium;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio06_medium;

public class TestExercicio06 {

    static Exercicio06_medium exercicio06_medium;

    @BeforeClass
    public static void before(){
        exercicio06_medium = new Exercicio06_medium();
    }

    @Test
    public void fatorial(){
        
        Assert.assertEquals(120, Exercicio06_medium.calculaFatotial(5));
    }
}
