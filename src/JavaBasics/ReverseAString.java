package JavaBasics;



public class ReverseAString {


    public static void main (String [] args) {

        // Using StringBuffer
        String input = "Hello World";
        String reverse = new StringBuffer(input).reverse().toString();
        System.out.println(reverse);

    }

}
