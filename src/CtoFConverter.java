import java.util.Scanner;

public class CtoFConverter {

    void main() {
        Scanner in = new Scanner(System.in);
        double fVal = 0;
        double cVal = 0;
        boolean done = false;
        String trash = "";


    do {
            IO.print("Enter the C value to convert to F ");

            if (in.hasNextDouble()) {
                cVal = in.nextDouble();
                in.nextLine();// Clear the new line from the buffer

                fVal = cVal * 9.0 / 5 + 32;
                IO.println("The Celsius value is " + cVal + " The Farenheit is " + fVal + " F");

                done = true;
            } else{
            trash = in.nextLine();

            IO.print("Please enter a correct Celsius value not " + trash);
        }
    }while (!done) ;
    }
}
       // °F = °C × 9/5 + 32 input C and provide F//





