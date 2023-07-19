
package qaacademy_test_exercicio.Medio;

import javax.swing.*;

public class Exercicio08_medium {
    public void nomeNumeroAlunos(){

        String nomes [] = new String [5];
        int numeracaoAluno [] = new int [5];

        for(int i = 0; i < 5; i++){
            nomes [i] = recebeAluno();
            numeracaoAluno [i] = recebeNumeroAluno();
        }
        
        imprimeNome(nomes, numeracaoAluno);
    }


    private void imprimeNome(String [] vetorNomes, int [] vetorNumeros){
        for(int i = 0; i < 5; i++){
            System.out.println(vetorNumeros[i] + "- " + vetorNomes[i]);
        }
    }
    private int recebeNumeroAluno(){
        return Integer.parseInt(JOptionPane.showInputDialog("Digite o número do aluno: "));
    }

    public String recebeAluno (){
        return JOptionPane.showInputDialog("Digite o nome do aluno: ");
    }
}
