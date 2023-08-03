package qaacademy_test_exercicio.Facil;


public class Exercicio08_easy {

    public double calculoIR (double salarioBruto){
        
        double IR = 0;
        
        if(salarioBruto <= 1903.98){
            IR = 0.0;
        }
        if(salarioBruto >= 1903.99 && salarioBruto <= 2826.65){
            IR = (salarioBruto * 0.075) - 142.8;
            if(IR  <= 0){
                IR = 0.0;
            }
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
        return IR;
    }

    public double calculoSalarioLiquido (double salarioBruto, double IR){
        return salarioBruto - IR;
    }


}
