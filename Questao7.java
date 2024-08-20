import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int media = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = s.nextInt();
            media += idade;
        }
        System.out.println("A media das idade é: " + media);


    }
}


