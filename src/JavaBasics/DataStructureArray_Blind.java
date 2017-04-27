package JavaBasics;


import java.util.*;

public class DataStructureArray_Blind {


    public static void main(String[] args) {

//
//        List<String> arraylist = new ArrayList<String>();
//
//        arraylist.add("H");
//        arraylist.add("E");
//        arraylist.add("L");
//        arraylist.add("L");
//        arraylist.add("O");
//        arraylist.add("!");
//
//        arraylist.remove(5);
//
//        for (String al : arraylist) {
//            System.out.print(al + "\n");
//        }
//

        myArray();
    }

    public static void myArray() {
        char[] charArray = new char[5];

        charArray[0] = 'H';
        charArray[1] = 'E';
        charArray[2] = 'L';
        charArray[3] = 'L';
        charArray[4] = 'O';

        Arrays.sort(charArray);


        for(int i = 0; i < 5; i = i+ 1) {

            System.out.println("My charArray says " + charArray[i]);
        }
    }



    public void myMap(){

        Map<String, List<String>> makeModel = new HashMap<>();

    }
}
