import org.junit.Assert;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio06_easy;

public class TestExercicio06_easy {
    @Test
    public void aprovacao (){
        Exercicio06_easy exercicio06_easy = new Exercicio06_easy();
        String aprovado = exercicio06_easy.aprovacao(8, 10);
        String reprovado = exercicio06_easy.aprovacao(2, 3);
        String exame = exercicio06_easy.aprovacao(5, 5);

        Assert.assertEquals("Aprovado", aprovado);
        Assert.assertEquals("Reprovado", reprovado);
        Assert.assertEquals("Exame", exame);

    }
}
