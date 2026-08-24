public class FileManager {
    public static void createFile(String fileName, String content) throws java.io.IOException {
        
        java.io.File obj = new java.io.File(fileName);
        if (obj.createNewFile()) {
            System.out.println("created");
        }
        java.io.FileOutputStream out = new java.io.FileOutputStream(fileName);
        out.write(content.getBytes());
    }

    public static String getContentFile(String fileName) throws java.io.IOException {
        java.io.FileInputStream in = new java.io.FileInputStream(fileName);


        int r;
        byte[] b = new byte[1024];
        String res = "";
        while( (r=in.read(b)) != -1 ) {
            res += new String(b, 0, r);
        }
        return res;
    }

    public static void deleteFile(String fileName) {
        java.io.File obj = new java.io.File(fileName);
        obj.delete();
    }
}
