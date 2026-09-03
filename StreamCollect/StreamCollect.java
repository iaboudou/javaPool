import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Optional;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {

       Map<Character, List<String>> a = s.collect( Collectors.toMap(
                str1 -> str1.toLowerCase().charAt(0),
                str2 -> new java.util.ArrayList<>(List.of(str2)),
                (oldValue, newValue) -> {
                    newValue.addAll(oldValue);
                    return newValue;
                }
            )
        );
        return a;
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {

        Map<Integer, Optional<Integer>> a = s.collect(Collectors.toMap(
            k -> k%4,
            k -> Optional.of(k),
            (oldV, newV) -> Optional.of(Math.max(oldV.get(), newV.get()))
        ));

        return a;
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        s = s.sorted();
        return s.collect(Collectors.joining(" # "));
    }

    public static void main(String[] args) {

        System.out.println(StreamCollect.mapByFirstLetter(Stream.of("Bonjour", "le", "monde !", "bonsoir")));
        System.out.println(StreamCollect.getMaxByModulo4(Stream.of(5, 12, 32, 4, 9, 17, 98, 424, 97, 5843, 48354)));
        System.out.println(StreamCollect.orderAndConcatWithSharp(Stream.of("Hello", "how are you ?", "where do you live ?", "Bordeaux")));
        
        
        // ------------------
        // int a = s.collect(Collectors.reducing(
        //     0, 
        //     (x, y) -> x+y
        // ));


        //-----------------
        // List<String> list = l.collect( Collectors.filtering(
        //     e -> e.toLowerCase().charAt(0) == 'b', 
        //     Collectors.toList()
        // ));


        //-----------------
        // Set<String> s = l.collect( Collectors.toSet());


        //----------------
        // Map<Character, Set<String>> c = l.collect(Collectors.groupingBy(
        //     e -> e.toLowerCase().charAt(0),
        //     Collectors.toSet()
        // ));


        // -------------
        // Map<Character, List<String>> c = l.collect(Collectors.groupingBy(
        //     e -> e.toLowerCase().charAt(0),
        //     Collectors.toList()
        // ));

    }
}