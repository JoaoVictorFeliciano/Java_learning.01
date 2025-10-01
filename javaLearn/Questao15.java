import java.util.Scanner;
public class Questao15 {
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = nums.nextInt();
        boolean primo = true;

        if (num <=1){
            primo = false;

        }else{

            for (int i = 2; i < num; i++ ){
                if (num % i == 0){
                    primo = false;
                    break;

                }
            }

        }
        if (primo){
            System.out.println("O número e primo");
        }else{
            System.out.println("Não e primo");
        }




    }
}
