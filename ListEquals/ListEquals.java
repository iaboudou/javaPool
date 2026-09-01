import java.util.List;

public class ListEquals {
    public static boolean areListsEqual(List<String> list1, List<String> list2) {
        return list1 == null && list2 == null ? true
            : list1 == null || list2 == null ? false
            : list1.equals(list2);
    }

    public static void main(String[] args) {
        // System.out.println(null == null);
        System.out.println(ListEquals.areListsEqual(null, null));
        System.out.println(ListEquals.areListsEqual(List.of("Alice", "Bob", "Charly", "Emily"), List.of("Alice", "Bob", "Emily", "Charly")));
    }
}