package qaacademy_test_exercicio.Medio;

public class Exercicio04_medium {
    
    public void multiplicacaoNumerosAteMil() {
        int i = 1, resultadoMulti = 1;

        while(i <= 1000){
            resultadoMulti = resultadoMulti * i;
            System.out.println("O resultado da multi é: " + resultadoMulti);
            if(resultadoMulti >= 1000){
                resultadoMulti = 1;
            }
            i++;
        }
    }
}
