package JavaBasics;


import java.util.HashSet;
import java.util.Set;

public class HashSetExample {


    public static void main(String[] args) {


        System.out.println("\n" + "exmaple using a Integer: ");

        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(9);
        mySet.add(8);
        mySet.add(3);
        mySet.add(5);
        mySet.add(4);
        mySet.add(1);
        mySet.add(7);
        mySet.add(3);
        mySet.add(2);

        for (Integer myHashSetVar : mySet) {
            System.out.println("You should not see duplicates: " + myHashSetVar);
        }

        // Returns true if the "add" is possible and false if it's not.
        System.out.println(mySet.add(6));
        System.out.println(mySet.add(2));

        System.out.println("\n" + "exmaple using a String: ");

        Set<String> myStringSet = new HashSet<String>();
        myStringSet.add("two");
        myStringSet.add("three");
        myStringSet.add("three");

        // the only way to accdss the values is via an interator:
        for (String myStringHashsSet : myStringSet) {
            System.out.println(myStringHashsSet);
        }

        // returns a boolean true or false as to whether it could perform the insert. 
        System.out.println(myStringSet.add("one"));
        System.out.println(myStringSet.add("three"));

    }

}



