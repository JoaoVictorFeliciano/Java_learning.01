import java.util.Scanner;
public class Questao3 {
    public static void main (String[] args){
        Scanner calculo = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = calculo.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = calculo.nextInt();

        int soma = num+num2;
        int subtracao = num-num2;
        int multi = num * num2;
        int divisao = num/num2;

        System.out.println("Soma" + soma);
        System.out.println("Subtração" + subtracao);
        System.out.println("Multiplicação" + multi);
        System.out.println("Divisão" + divisao);
    }
}
