import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String aluno = s.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(aluno);
        }
    }
}
