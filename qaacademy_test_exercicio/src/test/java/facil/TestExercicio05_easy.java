package facil;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio05_easy;

public class TestExercicio05_easy {

    static Exercicio05_easy exercicio05_easy;

    @BeforeClass
    public static void before(){
        exercicio05_easy = new Exercicio05_easy();

    }

    @Test
    public void soma(){
        Assert.assertEquals(6, exercicio05_easy.soma(2, 2, 2));
    }

    @Test
    public void subtracao(){
        Assert.assertEquals(-2, exercicio05_easy.subtracao(2, 2, 2));
    }

    @Test
    public void multiplicacao(){
        Assert.assertEquals(8, exercicio05_easy.multiplicacao(2, 2, 2));
    }

    @Test
    public void media(){
        Assert.assertEquals(2, exercicio05_easy.media(2, 2, 2));
    }

}
