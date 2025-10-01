
import java.util.Scanner;
public class Questao14 {
    public static void main (String[] args){
        Scanner triangulo = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado: ");
        double ladoA = triangulo.nextDouble();
        System.out.println("Digite o valor do segundo lado: ");
        double ladoB = triangulo.nextDouble();
        System.out.println("Digite o valor do terceiro lado: ");
        double ladoC = triangulo.nextDouble();

        if( ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB){
            System.out.println("As medidas formam um triângulo");}

                if (ladoA == ladoB && ladoB == ladoC){
                System.out.println("Equilátero");
                }
                else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("Isósceles");}
                else{
                System.out.println("Escaleno");
                }




    }

}
