import java.util.Scanner;

public class fibonacciRecurNon {
    static int fibo_recur(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibo_recur(n-1) + fibo_recur(n - 2);
    }
    static void fibo_non_recur(int k){
        int t1 = 1, t2 = 1 , t3 = 0;
        System.out.print("1,1");
        for (int i = 3; i <= k; i++ , t1 = t2 , t2 = t3) {
            t3 = t1 + t2;
            System.out.print("," + t3);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number : ");
        String s = sc.nextLine();

        for (int i = 1; i <= Integer.parseInt(s); i++) {
            System.out.print(fibo_recur(i) + " ");
        }

        System.out.print("\nenter the number : ");
        String s1 = sc.nextLine();

        fibo_non_recur(Integer.parseInt(s1));

        sc.close();
    }
}
