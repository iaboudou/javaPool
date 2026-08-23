public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        StringBuffer str = new StringBuffer(s);
        str = str.reverse();
        return (str.toString().toLowerCase()).equals(s.toLowerCase());
    }
}