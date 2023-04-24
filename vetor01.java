import java.util.Scanner;

public class vetor01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = input.nextInt();

        }

        System.out.print("Números digitados: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}