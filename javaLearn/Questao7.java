import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args){
        Scanner maior = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int ano = maior.nextInt();

        if (ano >= 2008){
            System.out.println("Menor de idade");
        }
        else{
            System.out.println("Maior de idade");
        }

    }
}
