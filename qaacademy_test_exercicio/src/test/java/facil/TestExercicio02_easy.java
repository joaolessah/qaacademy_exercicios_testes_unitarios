package facil;
import org.junit.Test;

import org.junit.Assert;
import qaacademy_test_exercicio.Facil.Exercicio02_easy;

public class TestExercicio02_easy {

    @Test
    public void testRetornaPalavra(){
        
        Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        
        Assert.assertEquals("test",  exercicio02_easy.retornaPalavra("test"));

    }
    
}
