public class FileSearch {
    public static String searchFile(String fileName) {
        java.io.File obj = new java.io.File("documents");
        obj = findFile(obj, fileName);
        return obj == null ? null : obj.getPath();
    }

    static java.io.File findFile(java.io.File currentEntry, String searchedFile) {

        if (currentEntry.isDirectory()) {
            for (java.io.File e : currentEntry.listFiles()) {
                String name = e == null ? null : e.getName();
                if (name.equals(searchedFile)) {
                    return e;
                }else {
                    java.io.File f = findFile(e, searchedFile);
                    if (f != null && f.getName().equals(searchedFile)) {
                        return f;
                    }
                }
                System.out.println(name);
            }
        }
        return currentEntry ;
    }
}