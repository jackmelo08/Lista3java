import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = s.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos números é: " + soma);


    }
}


