import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            int numero = s.nextInt();
            if (numero >= 0 && numero <= 100 ) {
                count++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " +  count);

    }
}


