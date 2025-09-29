import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int desconto = valor.nextInt();

        if (desconto > 200){
            double v = desconto * 0.10;
            System.out.println("O valor recebeu 10% de desconto, logo ficou:"+ v);
        }
        else{
            System.out.println("O valor não recebeu descontos, logo ficou:"+ desconto);
        }

        }

    }

