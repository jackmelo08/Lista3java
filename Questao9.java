import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa:");
            String nome = s.nextLine();

            System.out.print("Digite a idade da pessoa: ");
            int idade = Integer.parseInt(s.nextLine());

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo + "com" + idadeMaisNova + " anos. ");
    }
}







