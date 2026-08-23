public class CleanExtract {
    public static String extract(String s) {
        String[] l = s.split("\\|");
        String res = "";
        for (String el : l) {
            String str;
            int firstIndex = el.indexOf(".");
            int lastIndex = el.lastIndexOf(".");
            if (firstIndex < 0) {
                firstIndex = 0;
            }
            if (lastIndex < 0) {
                lastIndex = 0;
            }

            if (firstIndex <= 0 && lastIndex <= 0) {
                str = el;
            }else if ( firstIndex == lastIndex) {
                str = el.substring(firstIndex);
            }else if (firstIndex < lastIndex) {
                str = el.substring(firstIndex, lastIndex);
            }else {
                str = el;
            }

            str = str.trim();
            str = str.replaceAll("^\\.", "");
            if (res.length() != 0) {
                res += " ";
            }
            str = str.trim();
            res += str;
            // System.out.printf("(%s) (%s) (%d : %d)%n",el, str, firstIndex, lastIndex);
        }

        res = res.replaceAll("\\s+", " ");
        return res;
    }
}