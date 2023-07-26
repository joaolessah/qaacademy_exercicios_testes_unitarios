package qaacademy_test_exercicio.Facil;


import javax.swing.*;

public class Exercicio05_easy {

    public int soma(int n1, int n2, int n3) {
        int soma = n1 + n2 + n3;
        return soma;
    }

    public int subtracao(int n1, int n2, int n3) {
        int subtracao = n1 - n2 - n3;
        return subtracao;    
    }

    public int multiplicacao(int n1, int n2, int n3) {
        int multiplicacao = n1 * n2 * n3;
        return multiplicacao;  
   }

    public int media(int n1, int n2, int n3) {
        int media = (n1 + n2 + n3) / 3;
        return media;
    }

}

/*
 * public static void main(String[] args) {
 * 
 * int primeiroNumero, segundoNumero, terceiroNumero;
 * 
 * primeiroNumero =
 * Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
 * segundoNumero =
 * Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
 * terceiroNumero =
 * Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
 * 
 * System.out.println("A soma dos três números digitados é: " + (primeiroNumero
 * + segundoNumero + terceiroNumero));
 * System.out.println("A subtração dos três números digitados é: " +
 * (primeiroNumero - segundoNumero - terceiroNumero));
 * System.out.println("A multiplicação dos três números digitados é: " +
 * (primeiroNumero * segundoNumero * terceiroNumero));
 * System.out.println("A média dos três números digitados é: " +
 * ((primeiroNumero + segundoNumero + terceiroNumero)/3));
 * 
 * }
 */
