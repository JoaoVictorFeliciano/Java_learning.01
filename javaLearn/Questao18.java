import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = valor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = valor.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int c = valor.nextInt();

        int menor, meio, maior;

        if (a <= b && a <= c){
            menor = a;
            if (b <= c){
                meio = b;
                maior = c;
            }else{
                meio = c;
                maior = b;
            }
        }else if (b <=a && b <= c){
            menor = b;
            if (a <= c){
                meio = a;
                maior = c;
            }else{
                meio = c;
                maior = a;
            }
        }else{
            menor = c;
            if (a <= b){
                meio = a;
                maior = b;
            }else{
                meio = b;
                maior = a;
            }
        }
        
    }
}
