import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {

        if (list == null) {
            return new java.util.ArrayList<>();
        }

        List<Integer> res = new java.util.ArrayList<>(list);
        java.util.Comparator<Integer> c = java.util.Comparator.naturalOrder();
        res.sort(c);

        return res;
    }

    public static List<Integer> sortReverse(List<Integer> list) {

        if (list == null) {
            return new java.util.ArrayList<>();
        }

        List<Integer> res = new java.util.ArrayList<>(list);
        java.util.Comparator<Integer> c = java.util.Comparator.reverseOrder();
        res.sort(c);

        return res;
    }

    public static void main(String[] args) {
        System.out.println(SortList.sort(null).toString());
        System.out.println(SortList.sortReverse(List.of(15, 1, 14, 18, 14, 98, 54, -1, 12)).toString());
    }
}

// interfaces (normal, fonctionnelle , marqueure)
