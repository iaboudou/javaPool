import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        return list == null ? null : list.lastIndexOf(value);
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        return list == null ? null : list.indexOf(value);
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {

        List<Integer> indxs = new java.util.ArrayList<>();
        if (list == null) {
            return indxs;
        }

        for (int i=0; i< list.size(); i++) {
            if (list.get(i).equals(value)) {
                indxs.add(i);
            }
        }
        return indxs;
    }

    public static void main(String[] args) {
        System.out.println(ListSearchIndex.findLastIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89));
        System.out.println(ListSearchIndex.findFirstIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89));
        System.out.println(ListSearchIndex.findAllIndexes(List.of(43784, 327, 1903, 3847, 327, 327, 3289), 43784).toString());
        System.out.println(ListSearchIndex.findLastIndex(null, 5));
        System.out.println(ListSearchIndex.findAllIndexes(null, 89).toString());
    }
}