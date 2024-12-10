
import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class hashmap_simpleImmutableEntry {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of(
            new AbstractMap.SimpleImmutableEntry<>("A", 100),
            new AbstractMap.SimpleImmutableEntry<>("B", 200)
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map1);
        map1.put("C", 300);
        System.out.println(map1);
    }
}

// import java.util.AbstractMap;
// import java.util.Map;
// import java.util.stream.Stream;
// import java.util.stream.Collectors;

// public class hashmap_simpleImmutableEntry {
//     public static void main(String[] args) {
//         Map<String, Integer> map1 = Stream.of(
//             new AbstractMap.SimpleImmutableEntry<>("A", 100),
//             new AbstractMap.SimpleImmutableEntry<>("B", 200) // Removed the comma here
//         ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

//         System.out.println(map1);
//     }
// }