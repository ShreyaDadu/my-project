//OOPS
/*Problem statement - A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
Implement the Complex numbers class that contains following functions -
1. constructor - You need to create the appropriate constructor.
2. plus - This function adds two given complex numbers and updates the first complex number.
e.g.- if C1 = 4 + i5 and C2 = 3 +i1
C1.plus(C2) results in: 
C1 = 7 + i6 and C2 = 3 + i1
3. multiply - This function multiplies two given complex numbers and updates the first complex number.
e.g.- if C1 = 4 + i5 and C2 = 1 + i2
C1.multiply(C2) results in: 
C1 = -6 + i13 and C2 = 1 + i2
4. print - This function prints the given complex number in the following format :
a + ib
Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.*/

import java.util.Scanner;

public class ComplexNumbers {
    // Data Members
    int real;
    int imaginary;

    // Constructor to initialize the complex number with real and imaginary parts
    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers and update the first one
    public void plus(ComplexNumbers other) {
        this.real += other.real;         // Add real parts
        this.imaginary += other.imaginary; // Add imaginary parts
    }

    // Method to multiply two complex numbers and update the first one
    public void multiply(ComplexNumbers other) {
        int realPart = this.real * other.real - this.imaginary * other.imaginary;
        int imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;

        this.real = realPart;           // Update real part after multiplication
        this.imaginary = imaginaryPart; // Update imaginary part after multiplication
    }

    // Method to print the complex number in the format: a + ib
    public void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }

    // Main method (provided for testing)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Reading input for the two complex numbers
        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();
        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        // Creating two complex number objects
        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        // Reading choice (1 for addition, 2 for multiplication)
        int choice = s.nextInt();

        // Performing operations based on user input
        if (choice == 1) {
            // Add the two complex numbers
            c1.plus(c2);
            c1.print(); // Print the result
        } else if (choice == 2) {
            // Multiply the two complex numbers
            c1.multiply(c2);
            c1.print(); // Print the result
        } else {
            return; // Exit if choice is invalid
        }

        s.close(); // Closing the scanner
    }
}
