import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        int[][] matriz = {
                {2, 4, 6},
                {1, 3, 5},
                {9, 10, 12}
        };
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j] + i + j) % 3 == 0)
                    soma += matriz[i][j];
            }

        }
        System.out.println("Resultado: " + soma);
    }

}
