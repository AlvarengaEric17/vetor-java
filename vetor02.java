import java.util.Scanner;

public class vetor02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = input.nextInt();

        }

        System.out.print("Números digitados em ordem normal: ");

        for (int i = 0; i < 3; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.print("Números digitados em ordem inversa: ");

        for (int i = 2; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

    }
}