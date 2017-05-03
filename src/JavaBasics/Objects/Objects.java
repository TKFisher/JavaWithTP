package JavaBasics.Objects;


import com.apple.eawt.AppEvent;

public class Objects {


    // The main method is part of the blue prints for the Objects class.
    public static void main(String[] args) {


        User newUser = new User();

        newUser.setUsername("tfisher");
        newUser.setPassword("hello");

        System.out.println(newUser.getUsername());
        System.out.println(newUser.getPassword());

        // examples where the security level variable belongs to the class and not the instance of the class
        // because of the static keyword.
        if (User.securityLevel > 1)
            System.out.println("Give them access.");
        else
            System.out.println("Don't give them access.");

        if (SuperUser.securityLevel > 1)
            System.out.println("Give them access.");
        else
            System.out.println("Don't give them access.");

        // This demonstrats that you can't access a non-static object from a static one.
        // doSomething();

    }

    public void doSomething() {
        System.out.println("Do something. ");
    }


}
