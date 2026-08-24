public class SortArgs {
    public static void sort(String[] args) {
        
        for (int i=1; i < args.length; i++) {
            int j = i-1;
            while (j>= 0 &&  Integer.parseInt(args[j]) > Integer.parseInt(args[j+1]) ) {
                String temp = args[j];
                args[j] = args[j+1];
                args[j+1] = temp;
                j -= 1;
            }
        }

        for (int i=0; i<args.length; i++) {
            if (i < args.length - 1) {
                System.out.print(args[i] + " ");
            }else {
                System.out.println(args[i]);
            }
        }
    }
}
