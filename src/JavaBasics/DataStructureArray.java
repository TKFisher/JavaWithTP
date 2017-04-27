package JavaBasics;

/*
* Array:
*   - you need a size that is defined.
*   - you cannot change the size.
* */

public class DataStructureArray {

    public static void main (String[] args){

        char [] newChar = new char [5];

        newChar[0]= 'H';
        newChar[1]= 'e';
        newChar[2]= 'l';
        newChar[3]= 'l';
        newChar[4]= '0';

//        System.out.println(newChar[0]);
//        System.out.println("**** \n");

        // For loop
        for(int i = 0; i < newChar.length; i= i +1){
            System.out.println(newChar[i]);
        }

        System.out.println("**** \n");

        // For each loop
        for (char c : newChar){

            // prints out on one line
            System.out.print(c);

        }

    }
}
