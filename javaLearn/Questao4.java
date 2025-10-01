import java.util.Scanner;

public class Questao4 {
    public static void main (String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        int conversao = temp.nextInt();
        int farenheit = (int) (conversao * 1.8) + 32;
        System.out.println("Temperatura em farenheit: " + farenheit);


    }
}
