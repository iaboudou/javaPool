public class StringReplace {
    public static String replace(String s, char target, char replacement) {
        try {
            return s.replace(target, replacement);
        }catch (NullPointerException e) {
            return s;
        }
    }

    public static String replace(String s, String target, String replacement) {

        try {
            return s.replace(target, replacement);
        }catch (NullPointerException e) {
            return s;
        }
    }
}