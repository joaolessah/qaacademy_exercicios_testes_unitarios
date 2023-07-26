package qaacademy_test_exercicio.Facil;

public class Exercicio06_easy {

    public String aprovacao(double nota1, double nota2){

        double media = (nota1 + nota2)/2;
        
        if(media > 5){
            return "Aprovado";
        } else if (media < 5) {
            return "Reprovado";
        } else{
            return "Exame";
        }
    }

    /* public static void main(String[] args) {

        double nota1, nota2, media;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        media = (nota1 + nota2)/2;

        if(media > 5){
            System.out.println("Aprovado");
        } else if (media < 5) {
            System.out.println("Reprovado");
        } else{
            System.out.println("Exame");
        }

    } */
}
