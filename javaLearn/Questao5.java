import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = num.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = num.nextInt();
        System.out.println("Digite outro número: ");
        int num3 = num.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: "+ num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é:"+ num2);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println("O maior número é:"+ num3);
        }



    }
}