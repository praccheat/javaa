public class rev_string {
    public static void main(String args[])
    {
        String a = "I love Java";
        String r = "";
        
        for (int i = 0; i < a.length(); i++) {
          r = a.charAt(i) + r;
        }
        System.out.println("original string: "+ a);
        System.out.println("Reversed string: "+ r);
                
    }
}