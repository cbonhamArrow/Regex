//Use capture groups to write a regex that could match: Abracadabra or Agracadagra

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {

    public static boolean returnWords(String input) {
        String regex = "A[bg]racada[bg]ra";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(returnWords("Abracadabra"));
        System.out.println(returnWords("Agracadagra"));
    }
}
