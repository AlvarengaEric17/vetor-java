import java.util.Scanner;

public class vetor04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdNumeros;

        double soma;

        System.out.print("Digite a quantidade de númeos que você deseja somar: ");
        qtdNumeros = input.nextInt();
        double numeros[] = new double[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {

            System.out.print("Digite o " + (i + 1) + " ° número:");
            numeros[i] = input.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < qtdNumeros; i++) {
            soma += numeros[i];
        }

        System.out.print("A soma de todos os valores é: " + soma);
    }
}
