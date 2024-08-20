import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int maiorDeIdadeCount = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = s.nextInt();

            if (idade >= 18) {
                maiorDeIdadeCount++;
            }
        }

        System.out.println("Número de pessoas maiores de idade: " + maiorDeIdadeCount);
    }
}


