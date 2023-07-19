package qaacademy_test_exercicio.Facil;


import javax.swing.*;

public class Exercicio05_easy {

    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
    int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

    public void soma(int n1, int n2, int n3) {
        System.out.println("A soma dos três números digitados é: " + (n1 + n2 + n3));
    }

    public void subtracao(int n1, int n2, int n3) {
        System.out.println("A subtracao dos três números digitados é: " + (n1 - n2 - n3));
    }

    public void multiplicacao(int n1, int n2, int n3) {
        System.out.println("A multiplicacao dos três números digitados é: " + (n1 * n2 * n3));
    }

    public void media(int n1, int n2, int n3) {
        System.out.println("A media dos três números digitados é: " + ((n1 + n2 + n3) / 3));
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
