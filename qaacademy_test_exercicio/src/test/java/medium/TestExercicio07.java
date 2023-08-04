package medium;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio07_medium;

public class TestExercicio07 {

    static Exercicio07_medium exercicio07_medium;
    static String [] vetorMesesEsperado;
    @BeforeClass
    public static void before(){
        exercicio07_medium = new Exercicio07_medium();
        vetorMesesEsperado = new String[12];
        vetorMesesEsperado[0] = "Janeiro";        
        vetorMesesEsperado[1] = "Fevereiro";
        vetorMesesEsperado[2] = "Março";
        vetorMesesEsperado[3] = "Abril";
        vetorMesesEsperado[4] = "Maio";
        vetorMesesEsperado[5] = "Junho";
        vetorMesesEsperado[6] = "Julho";
        vetorMesesEsperado[7] = "Agosto";
        vetorMesesEsperado[8] = "Setembro";
        vetorMesesEsperado[9] = "Outubro";
        vetorMesesEsperado[10] = "Novembro";
        vetorMesesEsperado[11] = "Dezembro";

    }

    @Test
    public void criaVetorMeses(){
        
        Assert.assertArrayEquals(vetorMesesEsperado, exercicio07_medium.criaVetorMeses());
    }

    @Test
    public void exibirVetor(){
        
        exercicio07_medium.imprimeValoresVetor(vetorMesesEsperado);

    }
}
