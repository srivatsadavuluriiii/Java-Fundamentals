//Java program to get the maximum element from a vector using methods.
// Thu 27 June, 2024

import java.util.Collections;
import java.util.Vector;

public class MaxElementInVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(22);
        vector.add(21);
        vector.add(43);
        vector.add(44);
        vector.add(88);
        System.out.println("Original Vector: " + vector);
        int maxElement = Collections.max(vector);
        System.out.println("Maximum element in the Vector: " + maxElement);
    }
}





