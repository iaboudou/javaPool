public class CatInFile {
    public static void cat(String[] args) throws java.io.IOException {
        
        java.io.InputStream in = System.in;
        java.io.FileOutputStream out = new java.io.FileOutputStream(args[0]);

        byte[] d = new byte[1024];
        int r;

        while ( (r = in.read(d)) != -1) {
            out.write(d, 0 , r);
        }

        in.close();
    }
}