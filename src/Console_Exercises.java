import java.util.Scanner;

public class Console_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your favorite color?");
        String color = scan.nextLine();

        System.out.println("What's your favorite shape?");
        String shape = scan.nextLine();

        System.out.println("Whats your favorite animal?");
        String animal = scan.nextLine();

//        System.out.println("Tell me about your best friend.");
//        String friend = scan.next();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("Type out a few words");
        String sentance = scan.nextLine();

        System.out.println("Enter the length of the room");
        double length = scan.nextInt();

        System.out.println("Enter the width of the room");
        double width = scan.nextInt();

        double area = length * width;
        System.out.println("Area is: " + area);





    }
}