package JavaBasics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructureArrayList {

    public static void main(String[] args) {

        arrayMethod();

/*
        List<String> newArrayList = new ArrayList();

        newArrayList.add("H");
        newArrayList.add("e");
        newArrayList.add("l");
        newArrayList.add("l");
        newArrayList.add("o");
        newArrayList.add("!");

        for (String s : newArrayList){
            System.out.print(s);
        }


        newArrayList.remove(5);

        System.out.println("\n");

        for (String s : newArrayList){
            System.out.print(s);

        }
        */
    }

    public static void arrayMethod() {

        char [] newChar = new char [5];

        newChar[0]= 'H';
        newChar[1]= 'e';
        newChar[2]= 'l';
        newChar[3]= 'l';
        newChar[4]= '0';


        Arrays.sort(newChar);


        for (char c : newChar){
            System.out.println(c);
        }


    }
}
