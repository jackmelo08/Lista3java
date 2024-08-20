import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
                int numero = s.nextInt();
        System.out.println("Tabuada do " + numero + ":");
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }



            }
        }






