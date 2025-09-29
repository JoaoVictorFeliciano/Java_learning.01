import java.sql.SQLOutput;
import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = num.nextInt();

        System.out.println("Digite um número: ");
        int num2 = num.nextInt();

        System.out.println("Digite a operação desejada (+, -, *, /): ");
        char operador = num.next().charAt(0);

        int IntResultado;
        double doubleresultado;

        switch (operador){

            case '+':
                IntResultado = num1 + num2;
                System.out.println("Resultado:"+ IntResultado);
                break;

            case '-':
                IntResultado = num1 - num2;
                System.out.println("Resultado:"+ IntResultado);
                break;

            case '*':
                IntResultado = num1 * num2;
                System.out.println("Resultado:"+ IntResultado);
                break;

            case '/':
                if (num2 != 0) {
                    doubleresultado = (double) num1 / num2;
                    System.out.println("Resultado:" + doubleresultado);

                }else{
                    System.out.println("Divisão por Zero não e permitido:");
                }
                break;
            default:
                System.out.println("Operador Inválido");
                break;

        }
        num.close();


    }
}
