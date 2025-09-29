import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner imc = new Scanner(System.in);
        System.out.println("Digite seu Peso:");
        double peso = imc.nextDouble();

        System.out.println("Digite sua altura");
        double altura = imc.nextDouble();

        double imcl =  peso / (altura * altura);

        System.out.println("Seu IMC é: "+ imcl);

        if (imcl < 18.5){
            System.out.println("Abaixo do Peso");
        }
        else if (imcl <= 24.9){
            System.out.println("Peso normal");
        }
        else if (imcl <= 29.9){
            System.out.println("Acima do Peso");
        }
        else {
            System.out.println("Obesidade");
        }
    }
}
