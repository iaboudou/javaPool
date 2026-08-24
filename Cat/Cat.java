public class Cat {
    public static void cat(String[] args) throws java.io.IOException {

        if (args.length == 0) {
            return;
        }

        java.io.FileInputStream out = new java.io.FileInputStream(args[0]);
        
        int r;
        byte[] b = new byte[1024];
        
        while ( (r = out.read(b)) != -1) {
            System.out.write(b, 0, r);
        }
    }
}