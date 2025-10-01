import java.util.Scanner;

public class Questao17{
    public static void main(String[] args){
        Scanner impostos = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        int salario = impostos.nextInt();

        int inss = (int) (salario * 0.08);
        int irpf = (int) (salario * 0.15);
        int salario_final = (int) (salario - inss - irpf);

        System.out.println("O salário final é: " + salario_final);














    }

}
