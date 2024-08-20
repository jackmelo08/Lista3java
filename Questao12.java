import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int countPares = 0;

        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            int numero = s.nextInt();
            if (numero % 2 ==0) {
                countPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + countPares);

    }
}
