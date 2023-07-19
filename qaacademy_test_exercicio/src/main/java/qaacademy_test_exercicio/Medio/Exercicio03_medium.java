package qaacademy_test_exercicio.Medio;

public class Exercicio03_medium {
    public static void somaNumerosAcumulados(){
        
        int i =0, soma = 0;
        while (i <= 1000){
            soma += i;
            System.out.println(soma);
            i++;
            if(soma >= 1500){
                break;
            }
        }
    }
}
