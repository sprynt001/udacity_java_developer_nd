// Implementing a calculator for basic operations '+' '-' '*' on non
// negative integers

class Calculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Calculator usage:");
            System.out.println("\tEnter a string to compute.");
            System.out.println("\tShould contain non-negative integers");
            System.out.println("\twith the operations '+','-' and/or '*' (no spaces).");
            System.out.println("\t\te.g. 1+2*5 will give 11");

            return;
        }

        // Strategy - extract subexpression.
        // Evaluate
        // From new string with sub expression evaluated

        String expr = args[0];
        // First do multiplications
        int startIndex = 0;
        int index = 0;
        bool firstComputation = true;
        while (index >= 0) {
            index = expr.indexOf("*", index);
            if (index < expr.length - 1) {
                int lvalue = getvalue(expr, index, "left");
                int rvalue = getvalue(expr, index, "right");
                if (firstComputation) {
                    answer = lvalue;
                }
            }
        }

    }
}
