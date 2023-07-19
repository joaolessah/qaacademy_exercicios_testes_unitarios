package qaacademy_test_exercicio.Medio;

public class Exercicio06_medium {
    public static int calculaFatotial(int fatorial) {

        int i;
        i = fatorial;

        while(i > 1){
            fatorial = fatorial * (i - 1);
            i--;
        }

       return fatorial;
    }
}
