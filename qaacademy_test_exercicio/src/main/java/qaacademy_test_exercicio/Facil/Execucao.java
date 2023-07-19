package qaacademy_test_exercicio.Facil;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        
    /* Exercicio10_easy exercicio10_easy = new Exercicio10_easy();
    double valorTotal, valorInvestimento, valorJuros;
    valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de investimento: "));
    valorJuros = exercicio10_easy.calcularValorJuros(valorInvestimento);
    valorTotal = valorJuros + valorInvestimento;


    
    System.out.println("Valor investido: " + valorInvestimento);

    System.out.println("Valor juros: " + valorJuros);
    
    System.out.println("Valor total: " + valorTotal);
 */
        

    int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

    Exercicio11_easy exercicio11_easy = new Exercicio11_easy();

    System.out.println(exercicio11_easy.somaDois(numeroDigitado));


    }
}



