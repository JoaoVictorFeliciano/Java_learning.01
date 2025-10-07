import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);

        int numero;
        int soma = 0;
        System.out.println("Digite números inteiros (0 para parar);");
        numero = nums.nextInt();
        while (numero != 0) {
            soma += numero;
            numero = nums.nextInt();

        }
        System.out.println("A soma dos números é: " +soma);


    }
}
