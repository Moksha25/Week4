package Regex.Extraction_Problems.Extract_Dates_In_ddmmyyyy_Format;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = scanner.nextLine();

        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> dates = new ArrayList<>();

        while (matcher.find()) {
            dates.add(matcher.group());
        }

        System.out.println("Extracted Dates: " + String.join(", ", dates));

        scanner.close();
    }
}
