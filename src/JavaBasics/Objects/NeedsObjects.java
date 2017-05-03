package JavaBasics.Objects;


public class NeedsObjects {


    public void createObject() {


        // Not correct way as it's referencing an instance of the Object method via the class.
        Objects anInstance = new Objects();
        anInstance.main(null);


        // Correct way as it's referencing the Object method via the class and not the instance of the class.
        Objects.main(null);


    }


}
