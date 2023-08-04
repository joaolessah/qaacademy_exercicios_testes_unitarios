package medium;

import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Medio.Exercicio01_medium;

public class TestExercicio01 {
    static Exercicio01_medium exercicio01_medium;

    @BeforeClass
    public static void before(){
        exercicio01_medium = new Exercicio01_medium();
    }

    @Test
    public void parImpar(){
        exercicio01_medium.exibeParOuImpar();
    }


}
