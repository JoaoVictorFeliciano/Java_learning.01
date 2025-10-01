import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args){
        Scanner verify = new Scanner(System.in);
        System.out.println("Digite um ano para verificar se ele e bissexto: ");
        int ano = verify.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("Esse ano é bissexto");
        }else{
            System.out.println("Esse ano não é bissexto");
        }
    }
}
