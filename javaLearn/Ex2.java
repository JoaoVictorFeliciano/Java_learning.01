import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String entrada = sc.nextLine();
        entrada = entrada.trim() .toLowerCase();
        String maisucula = entrada.toUpperCase();
        String resultado = "";
        for (int i = 0; i < entrada.length(); i ++){
            if (i % 2 == 0){
                resultado += maisucula.charAt(i);
            }else{
                resultado += entrada.charAt(i);

            }


        }
        System.out.println("Resultado: " + resultado);

    }



}
