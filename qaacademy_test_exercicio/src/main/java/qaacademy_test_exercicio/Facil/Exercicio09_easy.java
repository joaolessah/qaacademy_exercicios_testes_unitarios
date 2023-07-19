package qaacademy_test_exercicio.Facil;


import javax.swing.*;

public class Exercicio09_easy {

    public static int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 10"));

    public static void tabuada (int numero){
        int i = 1;
        int resultado;

         while(i <= 10){
            resultado = numero * i;
            System.out.println( numero + "x" + i + " = " + resultado);
            i++;
        }

    }
}
