import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            return;
        }
        java.io.FileInputStream in = new java.io.FileInputStream(args[0]);
        java.io.FileOutputStream out = new java.io.FileOutputStream(args[1]);
        int r = 0;
        byte[] d = new byte[1024];
        char previousChar = ' ';

        while( (r = in.read(d) ) != -1) {
            String cap = capitalizeString(new String(d, 0, r), previousChar);
            previousChar = (char) d[r-1];
            out.write(cap.getBytes());
        }

        in.close();
        out.close();
    }

    static String capitalizeString(String input, char prevChar) {
        String res = "";
        for (int i=0; i<input.length(); i++) {

            boolean isUpperCase = String.format("%s", input.charAt(i)).matches("[A-Z]");
            boolean isLowerCase = String.format("%s", input.charAt(i)).matches("[a-z]");
            boolean previousCharisWhiteSpace = i == 0 ? Character.isWhitespace(prevChar) : Character.isWhitespace(input.charAt(i-1));

            if ( (i == 0 && isLowerCase) || (i > 0 &&  previousCharisWhiteSpace && isLowerCase)  ) {
                res += (char)(input.charAt(i) + 'A' - 'a');
            }else if (i > 0 && !previousCharisWhiteSpace && isUpperCase) {
                    res += (char)(input.charAt(i) + 'a' - 'A' );
            }else {
                res += input.charAt(i);
            }
        }
        return res;
    }
}
