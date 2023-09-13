package facil;
import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio10_easy;

public class TestExercicio10_easy {
    static Exercicio10_easy exercicio10_easy;
    static DecimalFormat df;
    
    @BeforeClass
    public static void before(){
        exercicio10_easy = new Exercicio10_easy();
        df = new DecimalFormat("#,###.00");
    }

    @Test
    public void calcularValorJuros(){
        String valorEsperado = "500,00";
        String valorAtual = df.format(exercicio10_easy.calcularValorJuros(1000.00));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
