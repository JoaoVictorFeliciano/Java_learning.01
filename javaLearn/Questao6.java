import java.util.Scanner;
public class Questao6 {
    public static void main (String[] args){
        Scanner imposto = new Scanner(System.in);
        System.out.println("Digite seu sálario: ");
        int salario = imposto.nextInt();
        int desconto = (int) (salario*0.15);
        System.out.println("O desconto no salário foi de: "+ desconto);

    }
}
