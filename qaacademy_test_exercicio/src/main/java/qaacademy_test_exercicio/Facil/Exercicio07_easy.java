package qaacademy_test_exercicio.Facil;

public class Exercicio07_easy {

    public static double calculoInss = 0.0;


    public double calculoDoInss (double salario){

        
        if(salario <= 1045.00){
            calculoInss = (salario * 7.5) / 100;
        }
        if(salario >= 1045.01 && salario <= 2089.60){
            calculoInss = (salario * 9) / 100;
        }
        if(salario >= 2089.61 && salario <= 3134.40){
            calculoInss = (salario * 12) / 100;
        }
        if(salario >= 3134.41 && salario <= 6101.06){
            calculoInss = (salario * 14) / 100;
        }
        if(salario > 6101.06){
            calculoInss = 854.15;
        }
        return calculoInss;
    }

}
