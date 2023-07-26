import org.junit.Assert;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio04_easy;

public class TestExercicio04_easy {
    @Test
    public void retornaDobro(){
        
        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        int dobro = exercicio04_easy.dobroNumero(4);

        Assert.assertEquals(8, dobro);
    }
}
