import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(add(1,1));
        System.out.println(sub(5,5));
        System.out.println(multiply(5,5));
        System.out.println(divide(5,5));
        System.out.print("Enter a number between 1 and 10:");

    }


    public static int add(int x, int y){
        return x + y;
    }
    public static int sub(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static int divide(int x, int y){
        return x / y;
    }

    public static int counter (int min, int max) {
        System.out.println("Enter a Number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput < 1 || userInput > 10) {
            userInput = counter(min, max);
        } else {
            return userInput;
        }

        return userInput;
    }

//    public static int factor (int min, int max) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10:");
//        int number = input.nextInt();
//        input.nextLine();
//
////        for( i =1; i <= number,i++)
//
//    }}





    }







