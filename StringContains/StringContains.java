public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        try {
            return s.contains(subString);
        }catch(NullPointerException e) {
            return false;
        }
    }
}