package qaacademy_test_exercicio.Medio;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {

        Exercicio09_medium exercicio09_medium = new Exercicio09_medium();
        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento que deseja calcular"));
        int [] vetorFibonacci = exercicio09_medium.calculoFibonacci(elemento);
        exercicio09_medium.imprimeVetor(vetorFibonacci);
    
    }
}
