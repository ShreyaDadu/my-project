import java.util.*;
import java.io.*;
// GrandFather class with a parameterized constructor and grandFatherName attribute
class GrandFather {
    static String grandFatherName;
    // Parameterized constructor for GrandFather class
    public GrandFather(String grandFatherName) {
        GrandFather.grandFatherName = grandFatherName;
    }
}
// Father class that inherits from GrandFather
class Father extends GrandFather {
    static String fatherName;
    // Parameterized constructor for Father class
    public Father(String grandFatherName, String fatherName) {
        super(grandFatherName);  // Call GrandFather constructor
        Father.fatherName = fatherName;
    }
}
// Son class that inherits from Father
class Son extends Father {
    static String sonName;
    // Parameterized constructor for Son class
    public Son(String grandFatherName, String fatherName, String sonName) {
        super(grandFatherName, fatherName);  // Call Father constructor
        Son.sonName = sonName;
    }
    // Method to print the names in the desired format
    public void printName() {
        System.out.println("sonname: " + sonName);
        System.out.println("fathername: " + fatherName);
        System.out.println("grandfather: " + grandFatherName);
    }
}
public class Solutions {
    public static void main(String args[]) {
        // Create an object of Son and pass the required values
        Son son = new Son("Suresh", "Ramesh", "Saurabh");
        // Call the printName method to display the output
        son.printName();
    }
}
