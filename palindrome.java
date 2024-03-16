import java.util.Scanner;
public class palindrome {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      //int num = 101010101;
      System.out.print("Enter a Number : ");
      int num = scanner.nextInt();
      String a = Integer.toString(num);
      String r_a = "";
      
      for (int i = 0; i < a.length(); i++) {
          r_a = a.charAt(i) + r_a;
      }

      int r_num = Integer.parseInt(r_a);
      if (num == r_num) {
        System.out.println(num + " is a palindrome number!!");
      }else{
        System.out.println(num + " is not a palindrome number");
      }

      scanner.close();

   } 
}
