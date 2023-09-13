package facil;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio11_easy;

public class TestExercicio11_easy {
    static Exercicio11_easy exercicio11_easy;

    @BeforeClass
    public static void before (){
        exercicio11_easy = new Exercicio11_easy();
    }

    @Test
    public void somaDois(){
        int valorEsperado = 210;
        int valorAtual =  exercicio11_easy.somaDois(10);
        
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
