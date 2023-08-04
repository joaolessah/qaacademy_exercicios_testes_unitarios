package medium;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio09_medium;

public class TestExercicio09 {

    static Exercicio09_medium exercicio09_medium;
    static long [] vetorFibonacciEsperado;


    @BeforeClass
    public static void before(){
        exercicio09_medium = new Exercicio09_medium();
        vetorFibonacciEsperado = new long[10];
        vetorFibonacciEsperado[0] = 0;       
        vetorFibonacciEsperado[1] = 1;
        vetorFibonacciEsperado[2] = 1;
        vetorFibonacciEsperado[3] = 2;
        vetorFibonacciEsperado[4] = 3;
        vetorFibonacciEsperado[5] = 5;
        vetorFibonacciEsperado[6] = 8;
        vetorFibonacciEsperado[7] = 13;
        vetorFibonacciEsperado[8] = 21;
        vetorFibonacciEsperado[9] = 34;

    }

    @Test
    public void testeVetorFibonacci(){
    
        Assert.assertArrayEquals(vetorFibonacciEsperado, exercicio09_medium.calculoFibonacci(10));

    }

    @Test
    public void exibirFibo(){

        exercicio09_medium.imprimeVetor(vetorFibonacciEsperado);
    }

}

