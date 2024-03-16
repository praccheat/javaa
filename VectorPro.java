import java.util.Vector;

public class VectorPro {
    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();
        
        v.add("one");
        v.add("two");
        v.add("three");

        String v_e_2 = v.get(2);
        System.out.println("Element at index 2: " + v_e_2);

        System.out.print("Vector: ");
        for (String element : v) {
            System.out.print(element + ",");
        }
        System.out.println();

        v.remove(1);
        System.out.println("Vector after removing element at index 1: " + v);
    }
}
