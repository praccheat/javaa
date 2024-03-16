import Package.Calculator;

public class UserDefindPkg {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 5);
        System.out.println("Result of addition: " + result);
    }
}
