//Write a regex that tests whether a String is an address and allows you to extract the parts
//(your choice for address format).

import java.io.FilterOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {

    static String address = "12345 Big St., Alphabet City, CA 90210";

    public static void parseAddress(String address) {
        boolean isGoing = true;
        String regex = "(?<buildingNumber>\\d*+)\\s(?<street>\\w*+\\s\\w*+[.]?),\\s(?<city>\\w*+\\s\\w*+),\\s(?<state>\\w{2})\\s(?<postalCode>\\d{5})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);

        if (matcher.matches()) {
            while (isGoing) {
                String choice = System.console().readLine("There is a match, would you like to see the parts of the address? (Y/N)");
                if (choice.equals("n") || choice.equals("N")) {
                    System.out.println("Ight den");
                    isGoing = false;
                } else if (choice.equals("y") ||choice.equals("Y")) {
                    System.out.println("Building Number: " + matcher.group("buildingNumber"));
                    System.out.println("Street name: " + matcher.group("street"));
                    System.out.println("City: " + matcher.group("city"));
                    System.out.println("State: " + matcher.group("state"));
                    System.out.println("Postal Code: " + matcher.group("postalCode"));
                    isGoing = false;
                }
            }
        } else {
            System.out.println("You ain't filled out the address wrong cuz sorry.");
        }

    }

    public static void main(String[] args) {
        parseAddress(address);
    }
}
