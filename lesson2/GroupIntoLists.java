// This exercise requires grouping input into three lists.
// List 1 - entries beginning with 'a' (or 'A')
// List 2 - entries beginning with 'b' (or 'B')
// List 3 - everything else

import java.util.LinkedList;

class GroupIntoLists
{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("GroupIntoLists usage:");
            System.out.println("\tEnter a list of strings separated by commas - no spaces.");
            System.out.println("\t\te.g. abc,bcd,bbb,ace,snb,aaaa");
            System.out.println("\n\tProgram will sort them into three lists");
            System.out.println("\t\t(i)   those beginning with 'a' or 'A'");
            System.out.println("\t\t(ii)  those beginning with 'b' or 'B'");
            System.out.println("\t\t(iii) those beginning with 'c' or 'C'");

            return;
        }
        
        // Split the string on the commas and insert into relevant lists
        String[] words = args[0].split(",");
        LinkedList<String> group0 = new LinkedList<String>();
        LinkedList<String> group1 = new LinkedList<String>();
        LinkedList<String> group2 = new LinkedList<String>();
        for (int i=0; i<words.length; i++){
            String word = words[i].toLowerCase();
            if (word.startsWith("a")) {
                group0.add(words[i]);
            } else if (word.startsWith("b")) {
                group1.add(words[i]);
            } else {
                group2.add(words[i]);
            }
        }

        System.out.print("Words beginning with 'a' or 'A': ");
        System.out.println(group0);
        System.out.print("Words beginning with 'b' or 'B': ");
        System.out.println(group1);
        System.out.print("Words beginning with anything else: ");
        System.out.println(group2);
    }
}
