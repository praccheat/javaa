public class LetterSpaceNum {
    public static void main(String[] args) {

        int letter = 0;
        int space = 0;
        int number = 0;
        int other_char = 0;
        
        String s = "sentence with 1234 and @#!?? and word";
        
        char[] char_s = s.toCharArray();

        for (char ch : char_s) 
        {
            if (Character.isLetter(ch)) {
                letter++;
            } else if (Character.isDigit(ch)) {
                number++;
            } else if (Character.isSpaceChar(ch)) {
                space++;
            } else {
                other_char++;
            }
        }

        
        System.out.println("The input string is: " + s);
        System.out.println("Letter count: " + letter);
        System.out.println("Space count: " + space);
        System.out.println("Number count: " + number);
        System.out.println("Other character count: " + other_char);
        
    }    
}


