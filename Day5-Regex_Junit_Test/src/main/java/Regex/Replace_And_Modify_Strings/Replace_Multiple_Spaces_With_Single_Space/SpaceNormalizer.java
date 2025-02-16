package Regex.Replace_And_Modify_Strings.Replace_Multiple_Spaces_With_Single_Space;

import java.util.Scanner;

public class SpaceNormalizer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence with multiple spaces:");
        String input = sc.nextLine();

        String normalizedText = input.replaceAll("\\s+", " ");

        System.out.println("Normalized text:");
        System.out.println(normalizedText);

        sc.close();
    }
}
