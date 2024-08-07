//Write a regex that would match the following words: Dark, bark, Lark
//1. For extra challenge, could you additionally make it match: stark

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {

    public static boolean returnWords(String input) {
        String regex = "[DbL]|(st)ark";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(returnWords("Dark"));
        System.out.println(returnWords("bark"));
        System.out.println(returnWords("Lark"));
        System.out.println(returnWords("stark"));
        System.out.println(returnWords("sark"));
        System.out.println(returnWords("tark"));
        System.out.println(returnWords("dorrk"));
    }
}
