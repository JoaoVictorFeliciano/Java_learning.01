import java.util.Scanner;
public class Questao13 {
    public static void main (String[] args){
        Scanner multiplo = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = multiplo.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Multiplo de 3 e 5");
        }
        else if (num % 3 == 0){
            System.out.println("Multiplo de 3");
        }
        else if (num % 5 == 0){
            System.out.println("Multiplo de 5");
        }



    }
}
