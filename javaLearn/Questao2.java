import java.util.Scanner;

public class Questao2 {
    public static void main (String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = dados.next();
        System.out.println("Digite sua idade: ");
        int idade = dados.nextInt();

        System.out.println("Nome:"+nome);
        System.out.println("Idade:"+idade);
    }
}
