import java.util.Scanner;

public class vetor03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdProvas;

        double media, soma;

        System.out.print("Digite a quantidade de provas: ");
        qtdProvas = input.nextInt();
        double notas[] = new double[qtdProvas];

        for (int i = 0; i < qtdProvas; i++) {

            System.out.print("Digite a nota da " + (i + 1) + " ° Prova:");
            notas[i] = input.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < qtdProvas; i++) {
            soma += notas[i];
        }
        media = soma / qtdProvas;
        System.out.print("A média do aluno é: " + media);

        if (media <= 5){
            System.out.print(" O aluno está REPROVADO");
            
        }else if(media >=6 && media <=7){
            System.out.print(" O aluno está de RECUPERÇÃO");
        }else if(media >=8){
            System.out.print(" O aluno está APROVADO");
        }else{
            System.out.print(" ERRO");
        }

    }
}
