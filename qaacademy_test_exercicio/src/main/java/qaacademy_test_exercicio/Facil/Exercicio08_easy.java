package qaacademy_test_exercicio.Facil;


import javax.swing.*;

public class Exercicio08_easy {


    public static double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
    public static double IR = 0.0;
    public static double salarioLiquido = 0.0;

    

    public static void calculoLiquido (){
        System.out.println("O salário líquido é: " +( salarioBruto - IR));
    }

    public static void salarioBruto (){
        System.out.println("O salário bruto é: " + salarioBruto);
    }
    public static void calculoIR (){
        if(salarioBruto <= 1903.98){
            IR = 0.0;
        }
        if(salarioBruto >= 1903.99 && salarioBruto <= 2826.65){
            IR = (salarioBruto * 0.075) - 142.8;
        }
        if(salarioBruto >= 2826.66 && salarioBruto <= 3751.05){
            IR = (salarioBruto * 0.15) - 354.8;
        }
        if(salarioBruto >= 3751.06 && salarioBruto <= 4664.68){
            IR = (salarioBruto * 0.225) - 636.13;
        }
        if(salarioBruto > 4664.68){
            IR = (salarioBruto * 0.275) - 869.36;
        }
        System.out.println("O IR é: " + IR);
    }

}
