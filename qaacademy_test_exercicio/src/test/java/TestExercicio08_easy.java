import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio08_easy;

public class TestExercicio08_easy {
    
    static Exercicio08_easy exercicio08_easy;
    static DecimalFormat df;

    @Before
    public void before(){
        exercicio08_easy = new Exercicio08_easy();
        df = new DecimalFormat("#,###.00");
    }

    @Test
    public void testeSalarioPrimeiraFaixaIR(){        
        String valorEsperado = "0.0";
        Double valorAtual = exercicio08_easy.calculoIR(1903.98);
        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }

    @Test
    public void testeSalarioSegundaFaixaIR(){        
        String valorEsperado = "0.0";
         Double valorAtual = exercicio08_easy.calculoIR(1903.99);
   Assert.assertEquals(valorEsperado, valorAtual.toString());    }

    @Test
    public void testeSalarioSegundaFaixaIRSegundaCondicao(){        
        String valorEsperado = "69,20";
        String valorAtual = df.format(exercicio08_easy.calculoIR(2826.65));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioTerceiraFaixaIR(){        
        String valorEsperado = "69,20";
        String valorAtual = df.format(exercicio08_easy.calculoIR(2826.66));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioTerceiraFaixaIRSegundaCondicao(){        
        String valorEsperado = "207,86";
        String valorAtual = df.format(exercicio08_easy.calculoIR(3751.05));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioQuartaFaixaIR(){        
        String valorEsperado = "207,86";
        String valorAtual = df.format(exercicio08_easy.calculoIR(3751.06));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioQuartaFaixaIRSegundaCondicao(){        
        String valorEsperado = "413,42";
        String valorAtual = df.format(exercicio08_easy.calculoIR(4664.68));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
    
    @Test
    public void testeSalarioQuintaFaixaIR(){        
        String valorEsperado = "413,43";
        String valorAtual = df.format(exercicio08_easy.calculoIR(4664.69));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void salarioLiquido(){
        String valorEsperado = "1.992,80";
        String valorAtual = df.format(exercicio08_easy.calculoSalarioLiquido(2000.00, exercicio08_easy.calculoIR(2000.00)));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

}