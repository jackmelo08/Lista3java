import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite números para somar (digite um número negativo para encerrar):");
        while (true) {
            int numero = s.nextInt();
            if (numero < 0) {
                break;
            }
            soma += numero;
        }
        System.out.println("A soma dos números digitados é: " + soma);



    }
}


