// Implementation of Fibionacci using recursion

class Fibionacci
{
    static public int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }

    static public void main(String[] argv) {
        if (argv.length < 1) {
            System.out.println("Enter ith element for which to compute fibonacci value: ");
            return;
        }
        int n = Integer.parseInt(argv[0]);
        System.out.println("The " + argv[0] + "th of fibonacci sequence is : " + fib(n));
    }
}
