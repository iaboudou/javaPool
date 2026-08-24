public class DoOp {
    public static String operate(String[] args) {
        
        if (args.length < 3 || args == null || args[0] == null || args[1] == null || args[2] == null) {
            return "Error";
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        switch (args[1]) {
            case "+": 
                return Integer.toString(a+b);
            case "-": 
                return Integer.toString(a-b);
            case "*": 
                return Integer.toString(a*b);
            case "/":
                if (b == 0) {
                    return "Error";
                } else {
                    return Integer.toString(a/b);
                }
            case "%":
                if (b == 0) {
                    return "Error";
                } else {
                    return Integer.toString(a%b);
                }
        }
        return "Error";
    }
}