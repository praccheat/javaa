import java.util.Scanner;

class MarksOutOfBoundsException extends RuntimeException {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

public class MarksException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the name of the student: ");
            String name = sc.nextLine();

            System.out.print("enter the marks of " + name + " (out of 100): ");
            int marks = sc.nextInt();

            sc.close();

            if (marks < 0 || marks > 100) {
                throw new MarksOutOfBoundsException("input valid marks between 0 and 100 and not " + marks);
            }
            
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
