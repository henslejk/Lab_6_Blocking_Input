import java.util.Scanner;

public class FuelCost {

    void main() {

        Scanner in = new Scanner(System.in);
        double mpg = 0;
        double tank = 0;
        double costPerGallon = 0;
        boolean done = false;
        String trash = "";
        double miles = 0;
        double total = 0;


        do {
            IO.print("Enter the fuel efficiency mpg ");

            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();// Clear the new line from the buffer
                done = true;

            } else {

                trash = in.nextLine();

                IO.print("Please enter a correct mpg not " + trash);
            }
        } while (!done);

        done = false;

        do {
            IO.print("Enter the tank compacity in gallons  ");

            if (in.hasNextDouble()) {
                tank = in.nextDouble();
                in.nextLine();// Clear the new line from the buffer

                done = true;
            } else {
                trash = in.nextLine();

                IO.print("Please enter a correct tank storage not " + trash);
            }
        } while (!done);

        done = false;

        do {
            IO.print("Enter the cost per gallon  ");

            if (in.hasNextDouble()) {
                costPerGallon = in.nextDouble();
                in.nextLine();// Clear the new line from the buffer

                miles = 100 / mpg * costPerGallon;
                total = tank * mpg;
                IO.println(" The cost to drive a 100 miles is " + miles);
                IO.println(" The car can go " + total + " on a full tank");

                done = true;
            } else {
                trash = in.nextLine();

                IO.print("Pleas enter the correct cost per gallon " + trash);
            }
        } while (!done);


    }


}
