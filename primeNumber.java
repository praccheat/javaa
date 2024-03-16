import java.util.Scanner;

public class primeNumber {

    static void prim_no(int n){
        System.out.print("2,3");
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    System.out.print(","+j);
                }
                if (i%j == 0) {
                    break;
                }
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number util which primes are to be generated: ");
        String s = sc.nextLine();
        prim_no(Integer.parseInt(s));
        sc.close();

    }
}
