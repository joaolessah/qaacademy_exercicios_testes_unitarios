import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio07_easy;

public class TestExercicio07_easy {
    
    static Exercicio07_easy exercicio07_easy;
    static DecimalFormat df;

    @Before
    public void before(){
        exercicio07_easy = new Exercicio07_easy();
        df = new DecimalFormat("#,###.00");
    }

    @Test
    public void testeSalarioPrimeiraFaixa(){        
        String valorEsperado = "78,38";
        String valorAtual = df.format(exercicio07_easy.calculoDoInss(1045.00));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioSegundaFaixa(){        
        String valorEsperado = "94,05";
        String valorAtual = df.format(exercicio07_easy.calculoDoInss(1045.01));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioSegundaFaixaSegundaCondicao(){        
        String valorEsperado = "188,06";
        String valorAtual = df.format(exercicio07_easy.calculoDoInss(2089.60));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioTerceiraFaixa(){        
        String valorEsperado = "250,75";
        String valorAtual = df.format(exercicio07_easy.calculoDoInss(2089.61));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioTerceiraFaixaSegundaCondicao(){        
        String valorEsperado = "376,13";
        String valorAtual = df.format(exercicio07_easy.calculoDoInss(3134.40));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioQuartaFaixa(){        
        String valorEsperado = "438,82";
        String valorAtual = df.format(exercicio07_easy.calculoDoInss(3134.41));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioQuartaFaixaSegundaCondicao(){        
        String valorEsperado = "854,15";
        String valorAtual = df.format(exercicio07_easy.calculoDoInss(6101.06));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
    
    @Test
    public void testeSalarioQuintaFaixa(){        
        String valorEsperado = "854,15";
        String valorAtual = df.format(exercicio07_easy.calculoDoInss(6101.07));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
