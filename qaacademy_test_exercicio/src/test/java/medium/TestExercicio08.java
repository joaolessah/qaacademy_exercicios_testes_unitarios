package medium;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio08_medium;

public class TestExercicio08 {

    static Exercicio08_medium exercicio08_medium;
    static String [] vetorAlunosEsperado;
    static int [] vetorNumerosAlunosEsperado;

    @BeforeClass
    public static void before(){
        exercicio08_medium = new Exercicio08_medium();
        vetorAlunosEsperado = new String[12];
        vetorAlunosEsperado[0] = "Janeiro";        
        vetorAlunosEsperado[1] = "Fevereiro";
        vetorAlunosEsperado[2] = "Março";
        vetorAlunosEsperado[3] = "Abril";
        vetorAlunosEsperado[3] = "Abril";


        vetorNumerosAlunosEsperado = new int[5];
        vetorNumerosAlunosEsperado[0] = 1;
        vetorNumerosAlunosEsperado[1] = 2;
        vetorNumerosAlunosEsperado[2] = 3;
        vetorNumerosAlunosEsperado[3] = 4;
        vetorNumerosAlunosEsperado[4] = 5;

    }

    @Test
    public void criaVetorMeses(){
        
    }

    @Test
    public void exibirVetor(){
        

    }
}
