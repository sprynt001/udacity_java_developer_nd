/* Implementing a recursive function to give all possible permutations */

class PermuteAll
{
    static public void main(String[] argv) {
        // Accept input and store in a character array
        // Pass the array to recursive function to print all permutations
        // of the input characters
        if (argv.length < 1) {
            System.out.println("Enter a word or number to permutate");
            return;
        }
        
        int nChars = argv[0].length();
        char input[] = new char[nChars];
        for (int i=0; i<nChars; i++) {
            input[i] = argv[0].charAt(i);
        }
        //System.out.println(input);
        permute(input, 0);
        System.out.println("");
    }

    static private void permute(char[] toPermute, int i) {
        // permute characters starting from i [zero indexed]
        int nToPermute = toPermute.length - i;
        if (nToPermute < 1) {
            return;
        } else if (nToPermute == 1) {
            System.out.print(toPermute[i]);
        } else if (nToPermute == 2) {
            System.out.print(toPermute[i]+""+toPermute[i+1]);
            System.out.print(" ");
            System.out.print(toPermute[i+1]+""+toPermute[i]);
            return;
        } else {
            permute(toPermute, i+1);
        }
    }
}
