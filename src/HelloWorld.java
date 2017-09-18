public class HelloWorld {
    //pvsm
    //Entry point
    public static void main(String[] args) {
        //sout

        //general syntax: type identifier;

        //declaring and assigning

        //3 types of integers
        //in js it would be
        //var byteNumber;
        //var shortNumber;



        //these are the basic types for java
        //everything that starts with an uppercase is an object

        byte byteNumber = 2;
        short shortNumber = 0;
        int intNumber = 1;
        long longNumber = 10;
        // floating point numbers
        float floatNumber = 2.0f;
        // Decimals will always be a double
        double doubleNumber = 10.5;

        char singleCharacter = 'l';

        boolean booleanValue = true;
        //This is a wrapper
        //Boolean booleanValue = true

        String name = "redwood";//always use double quotes


        // const My_Constant = 4
        final int My_Constant = 4;

        System.out.println(3 + 4);
        System.out.println(3 * 4);
        float division = 3 / 4.0f;
        System.out.println(3 - 4);
        System.out.println(3 / 4);
        System.out.println(3 % 4.0);
        int x = 5;
        System.out.println(x++);//5
        System.out.println(++x);//7
        System.out.println(x--);//7
        System.out.println(--x);//5

        //Casting
        // It is only valid if the value on the right is smaller than the type on the left
        double aDoubleNumber = 10;
        System.out.println(aDoubleNumber);// from int to double

        //explicit type casting
        //type variable = (type) aBiggerTypeVariable
        //when the thing on the right is bigger you need to convert it
        int aIntergerNumber =(int) aDoubleNumber;



        System.out.print("hello redwood!");

        System.out.println("hello world!");
    }
}
