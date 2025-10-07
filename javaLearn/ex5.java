import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.println("1- Calcular nota dos alunos: ");
        System.out.println("2- Encerrar");
        System.out.println("Opção:");
        int opcao = notas.nextInt();

        int media = 0;
        if (opcao == 1) {
            System.out.println("Digite a primeira nota: ");
            int n1 = notas.nextInt();
            System.out.println("Digite a segunda nota: ");
            int n2 = notas.nextInt();
            media = (n1 + n2) / 2;
            System.out.println("Média: " + media);
            if (media >= 60) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
                }
        else if(opcao == 2){
            System.out.println("Encerrado");
        }else{
            System.out.println("Opcão invalida");
        }

    }
}
