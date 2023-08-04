package qaacademy_test_exercicio.Medio;

public class Exercicio09_medium {
    public long [] calculoFibonacci(int elemento) {
        
       
        long vet [] = new long [elemento];
        int cont = 2;

        vet[0] = 0;
        vet[1] = 1;

        while(cont < elemento){
            vet[cont] = vet[cont - 1] + vet[cont - 2];
            cont++;
        }

        return vet;
    }

    public void imprimeVetor(long[] vetor){
        int i = 0;
        while (i < vetor.length){
            System.out.println(vetor[i]);
            i++;
        }
    }
}
