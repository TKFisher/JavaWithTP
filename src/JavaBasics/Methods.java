package JavaBasics;


import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        String a = "sue";
        String b = "sue";

        if (a.equals(b)){
            System.out.println("testing string values are equal");
        }

        if (a==b){
            System.out.println("testing ");
        }

        // http://stackoverflow.com/questions/658953/if-statement-with-string-comparison-fails

        String firstName;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your first name here. ");

        firstName = userInput.next();

         // Ing's unit test
        boolean x = (isNameValid(firstName));
        System.out.println(x);

        if (isNameValid(firstName)) {

            System.out.println("The name is super valid. Print Jessy 5 times.");

            for (int i = 0; i < 5; i = i + 1) {
                loginWithParams(firstName);
            }
        } else {

            System.out.println("This name is shit. It ain't no Jessy.");
        }
    }

    private static void loginWithParams(String username) {
        System.out.println("This is the login method that passes the username: " + username);

    }

    private static boolean isNameValid(String name) {

        if (name.equals("Jessy")) {
            return true;
        } else {
            return false;
        }
    }

    private static void login() {

        System.out.println("This is the login method.");
    }


}
