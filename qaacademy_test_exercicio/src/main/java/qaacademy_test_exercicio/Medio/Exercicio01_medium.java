package qaacademy_test_exercicio.Medio;

public class Exercicio01_medium {
    public void exibeParOuImpar(){

        int cont = 1;

        while (cont <= 100){
            if (cont % 2 == 0){
                System.out.println("O número: " + cont + " é par.");
            }
            else{
                System.out.println("O número: " + cont + " é impar.");

            }
            cont++;
        }
    }
}
