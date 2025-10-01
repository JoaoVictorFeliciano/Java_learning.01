import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeros = num.nextInt();
        int quadrado = numeros*numeros;
        System.out.println("O quadrado do número é" +quadrado);


    }
}
