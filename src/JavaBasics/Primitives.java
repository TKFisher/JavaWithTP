package JavaBasics;

public class Primitives {

    // instance variables
    static int i;
    static Integer bigI = 1;
    static double d;
    static Double bigD;
    static char myChar;
    static Character bigChar;
    static boolean myBool;
    static Boolean bigBool;
    static float fl;
    static Float bigFloat;

    // String is not a Primitive.
    static String st = "1";

    public static void main (String[] args){

        // Local variables
        // int i;
        // myChar;

        System.out.println(i);
        System.out.println(bigI);

        System.out.println("This is a String now: " +  bigI.toString());

        // converting an int to a
        myOutput(bigI.toString());

        // converting int to a String.
        myIntOutput(Integer.parseInt(st));

//        System.out.println(d);
//        System.out.println(bigI);
//        System.out.println(myChar);
//        System.out.println(bigChar);
//        System.out.println(myBool);
//        System.out.println(bigBool);
//        System.out.println(fl);
//        System.out.println(bigFloat);
    }


    public static void myOutput (String output){
        System.out.println("This method outputs a String.  " + output);
    }

    public static void myIntOutput(int output){

        System.out.println("This method outputs an int. " + output);

    }

}
