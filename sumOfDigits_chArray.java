public class sumOfDigits_chArray {
    static long calc_sum(char[] a){
        long sum = 0;
        for(char m : a){
            sum = sum + ((int)m - (int)'0');
        }
        return sum;
    }
    public static void main(String[] args) {
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println("sum of digits from 0 to 9 is " + calc_sum(num));
        
    }
}
