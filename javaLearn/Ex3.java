public class Ex3 {
    public static void main(String[] args){
        int[] nums = {3, 6, 9, 12};
        int resultado = 1;
        for (int i = 0; i<nums.length; i ++) {
            resultado *= (nums[i] % 2 == 0) ? nums[i] / 2 : nums[i];
        }
        System.out.println("Resultado Final: " + resultado);
    }
}
