import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = notas.nextDouble();
            soma += nota;
        }

        double media = soma / 3;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        notas.close();
    }
}



