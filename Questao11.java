import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            int numero = s.nextInt();
            if (numero > 8) {
                count++;
            }
        }

        System.out.println("Quantidade de números maiores que 8: " + count);


    }
}




