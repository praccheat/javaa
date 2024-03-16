import java.util.Arrays;

public class SmallLarge_Array {
    public static void main(String[] args) {
        int[] num = {11,42,45,23,1,87,2,78};
        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Maximum:" + max);
        System.out.println("Minimum:" + min);
    

        Arrays.sort(num);
    }
}
