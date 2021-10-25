import java.util.ArrayList;

public class ex70 {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<Integer>();
        ArrayList<Integer> List2 = new ArrayList<Integer>();

        List1.add(4);
        List1.add(3);

        List2.add(5);
        List2.add(10);
        List2.add(7);

        combine(List1, List2);

        System.out.println(List1); // prints [4, 3, 5, 10, 7]

        System.out.println(List2); // prints [5, 10, 7] (value is found by index)

    }

    private static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    }
}