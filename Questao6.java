import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = s.nextInt();
            soma += idade;
        }
        System.out.println("A soma das idades é: " + soma);


    }
}



