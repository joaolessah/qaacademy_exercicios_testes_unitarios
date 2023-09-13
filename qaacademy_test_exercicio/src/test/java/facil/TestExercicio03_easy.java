
import org.junit.Assert;
import org.junit.Test;

import qaacademy_test_exercicio.Facil.Exercicio03_easy;

public class TestExercicio03_easy {

    @Test
    public void retornaDoisvaloresTrocados (){
        
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();

        String mensagemEsperada = "Primeiro valor digitado: valor2 - Segundo valor digitado: valor1";
        String mensagemAtual = exercicio03_easy.retornaDoisvalores("valor1", "valor2");

        Assert.assertEquals(mensagemEsperada, mensagemAtual);

        


    }
}
