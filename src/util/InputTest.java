package util;
import java.util.Scanner;

//Problem 3
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String stringInput = input.getString("Enter Your name: ");
        System.out.println(stringInput);

        Boolean isYes = input.yesNo("Are you over 21 years old?");
        System.out.println(isYes);

        int chooseNumberRange = input.getInt();
        System.out.println(chooseNumberRange);

        int pickNumber = input.getInt();
        System.out.println(pickNumber);

        double chooseDoubleRange = input.getDouble();
        System.out.println(chooseDoubleRange);

        double pickDoubleNumber = input.getDouble();
        System.out.println(pickDoubleNumber);

    }
}