package medium;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio02_medium;

public class TestExercicio02 {
    static Exercicio02_medium exercicio02_medium;
    static DecimalFormat df;

    @BeforeClass
    public static void before(){
        exercicio02_medium = new Exercicio02_medium();
        df = new DecimalFormat();
    }

    @Test
    public void calculaInvestimentoJurosCompostos(){
        String valorEsperado = "628,895";
        String valorAtual = df.format(exercicio02_medium.calculaInvestimentoJurosCompostos(1000.00));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void calculaValorTotalInvestimento(){
        String valorEsperado = "1.628,895";
        String valorAtual = df.format(exercicio02_medium.calculaValorTotalInvestimento(1000, exercicio02_medium.calculaInvestimentoJurosCompostos(1000)));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
