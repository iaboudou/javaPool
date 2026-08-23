public class Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuffer str = new StringBuffer(s);
        str = str.reverse();
        return (str.toString().toLowerCase()).equals(s.toLowerCase());
    }
}