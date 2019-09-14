/* Implementing a recursive function to give all possible permutations */

import java.util.ArrayList;

class PermuteAll
{
    static public void main(String[] argv) {
        // Accept input and store in a Character array
        // Pass the array to recursive function to print all permutations
        // of the input Characters
        if (argv.length < 1) {
            System.out.println("Enter a word or number to permutate");
            return;
        }
        
        int nChars = argv[0].length();
        ArrayList<Character> input = new ArrayList<Character>();
        for (int i=0; i<nChars; i++) {
            input.add(argv[0].charAt(i));
        }
        //System.out.println(input);
        ArrayList<String> permuted = permute(input);
        System.out.println(permuted);
    }

    static private ArrayList<String> permute(ArrayList<Character> toPermute) {
        // Make Anchor the first Character then permute all others and 
        // add each permutation to anchor
        // e.g. permute(['a','b','c'], 1):
        //     b is the anchor and returns bac, bca
        
        ArrayList<String> permuted = new ArrayList<String>();
        
        // If just one Character return it
        if (toPermute.size() == 0) {
            permuted.add("");
            return permuted;
        }
        if (toPermute.size() == 1) {
            permuted.add(""+toPermute.get(0));
            return permuted;
        }
        
        // If two Characters

        if (toPermute.size() == 2) {
            permuted.add(""+toPermute.get(0)+toPermute.get(1));
            permuted.add(""+toPermute.get(1)+toPermute.get(0));
            return permuted;
        }

        // Otherwise extract non anchor Characters, permute and add to 
        // anchor. The permute involves a recursive call
        ArrayList<Character> charsToPermute = new ArrayList<Character>();
        ArrayList<String> permutedChars = new ArrayList<String>();
        for (int i=0; i < toPermute.size(); i++) {
            char anchor = toPermute.get(i);
            for (int j=0; j < toPermute.size(); j++) {
                if (j != i) {
                    charsToPermute.add(toPermute.get(j));
                }
            }
            permutedChars = permute(charsToPermute);
            for (int k=0; k < permutedChars.size(); k++) {
                permuted.add(anchor + permutedChars.get(k));
            }
            charsToPermute.clear();
        }
        return permuted;
    }
}
