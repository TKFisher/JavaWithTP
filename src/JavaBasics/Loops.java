package JavaBasics;

public class Loops {

    public static void main (String[] args){

        int counter= 0;

        for(int i = 0; i < 10; i = i + 1){
            System.out.println(i);

            for(int j= 0; j < 10; j++)
            {
                System.out.println(j);
                System.out.println(counter +=1);
            }

        }
    }

}
