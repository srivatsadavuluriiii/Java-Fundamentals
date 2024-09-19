import java.util.*;
import java.util.stream.Collectors;

public class duplicate_elements_in_ArrayList {
    public static void main(String[] args) {
        //Method 1 : using LinkedHashSet
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,3,4,2,4,5,3,2,1,3));
        LinkedHashSet<Integer> listUpdated = new LinkedHashSet<>(list1);
        ArrayList<Integer> listFinal = new ArrayList<>(listUpdated);
        System.out.println(listFinal);

        System.out.println("---------------------");

        //Method 2 : using Java 8 Stream API
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,3,4,2,4,5,3,2,1,3));
        List<Integer> list3 = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(list3);
    }
}
