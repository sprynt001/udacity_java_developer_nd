/*
 * Answers to exercises in section 4
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Section4
{
    public static void main(String[] argv) {

        if (argv.length < 1) {
            System.out.println("You need to pass a string to be validated by the regular expression in Question 2 of 2");
            return;
        }

        System.out.println("Console output for question 1 of 2");
        question_1();

        System.out.println("Console output for question 2 of 2");
        question_2(argv[0]);

        System.out.println("Console output for coding exercise:");
        System.out.println("\tInput was: " + argv[0]);
        System.out.println("\tVowels in input are: " + vowelOnly(argv[0]));
    }

    private static void question_1() {
        StringBuilder sb = new StringBuilder("Good Morning");
        sb.insert(1, "Friend ");
        System.out.println(sb.toString());
    }

    private static void question_2(String str) {
        String regex = "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(str);
        if (matcher.matches()) {
            System.out.println(str + " matches the pattern");
        } else {
            System.out.println(str + " does not match the pattern");
        }
    }

    private static String vowelOnly(String input) {
        // A method to extract vowels from input

        String regex = "([aeiouAEIOU]*)";
        //String regex = "[A-Za-z]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        String output = "";
        while (m.find())
            output += m.group();
        return output;
    }
}
