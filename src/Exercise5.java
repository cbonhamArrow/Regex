//Write a regex that tests whether a String is an email address.
//1. Note: Doing this in regex is actually notoriously difficult to comply with ALL the ways an
//email address can be written. However, you can just do the simplest form of email
//address you can think of, such as: first.last@domain.com

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise5 {

    public static boolean isEmail(String input) {

        String regex = "(?<first>\\w*+)\\.(?<last>\\w*+)@(?<domain>\\w*+)\\.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isEmail("first.last@domain.com"));
    }
}
