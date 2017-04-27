package JavaBasics;


import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        System.out.println("\n" + "This is the main method." + "\n");

        String firstName;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your first name here. ");
        firstName = userInput.next();

        for (int i = 0; i < 5; i = i + 1) {
            loginWithParams(firstName);

        }
    }


    private static void login() {

        System.out.println("This is the login method.");
    }

    private static void loginWithParams(String username) {

        System.out.println("This is the login method that passes the username: " + username);

    }

    private static boolean isNameValid(String name) {

        if(name == "Jessy"){
         return true;
        }
        System.out.println("The name is not valid. Please enter another name.");
        return false;
    }

}
