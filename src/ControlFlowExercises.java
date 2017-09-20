import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        //first do while
//        int counter = 0;
//        do{
//            System.out.println(counter);
//            counter +=2;
//        }while(counter <= 100);
//        //second do while
//
//        int subtract = 100;
//        do {
//            System.out.println(subtract);
//            subtract -=5;
//        }while(subtract >= -10);
//
////        Third do while
//
//        long squared = 2;
//        do{
//            System.out.println(squared);
//            squared *= squared;
//        }while(squared <= 1000000);
//
////        Fizz Buzz Exercise
//        for (int l = 1; l <= 100; l++) {
//            if (l % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (l % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (l % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(l));
//            }
//        }
        //     Display Table Exercise

        while(true){
        System.out.println("What number would you like to go up to ? ");
        int number =input.nextInt();
        input.nextLine();
        System.out.println("number | squared | cubed\n" +
                "------ | ------- | -----");
        for(int j =1; j <= number; j++){
            System.out.printf("%-7s| ",j);
            System.out.printf("%-8s|",(j*j));
            System.out.printf("%-5s",(j*j*j));
            System.out.println();
        }
        System.out.println("Do you want to continue y/n?");
        String option = input.nextLine();

        if(!option.equalsIgnoreCase("y")){
            System.out.println("Ok");
            break;
        }}
        //Converting Grades into letter grades
        System.out.println("Give me a grade");
        int grade = input.nextInt();
        input.nextLine();

        if(grade <+ 100 && grade >= 88){
            System.out.println("A");
        }else if(grade <+ 87 && grade >= 80){
            System.out.println("B");
        }else if (grade <= 79 && grade >= 67){
            System.out.println("C");
        }else if(grade <= 66 && grade >= 60){
            System.out.println("D");
        }else if(grade <= 59){
            System.out.println("F");
        }

    }}


