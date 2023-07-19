package qaacademy_test_exercicio.Medio;

import javax.swing.*;

public class Exercicio07_medium {
    public String[] criaVetorMeses() {


        String meses [] = new String[12];

        for (int i = 0 ; i < 12; i++){
            meses [i] = JOptionPane.showInputDialog("Digite o nome do mês");
        }

        return meses;
    }

    public void imprimeValoresVetor(String[] meses){
        for (int i = 0; i < 12; i++){
            System.out.println(meses[i]);
        }
    }
}
