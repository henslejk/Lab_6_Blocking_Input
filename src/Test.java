import java.util.Scanner;

    public class Test {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            double height = 0;
            double width = 0;
            double area = 0;
            double perimeter = 0;
            double hypotenuse = 0;

            boolean done = false;
            String trash = "";

            // Get Height
            do {
                IO.print("Enter the Height: ");

                if (in.hasNextDouble()) {
                    height = in.nextDouble();
                    done = true;
                } else {
                    trash = in.nextLine();
                    IO.println("You must enter a correct Height, not: " + trash);
                    IO.println("Try again.");
                }

            } while (!done);

            IO.println("You said the Height is: " + height);

            // Reset done
            done = false;

            // Get Width
            do {
                IO.print("Enter the Width: ");

                if (in.hasNextDouble()) {
                    width = in.nextDouble();
                    done = true;
                } else {
                    trash = in.nextLine();
                    IO.println("You must enter a correct Width, not: " + trash);
                    IO.println("Try again.");
                }

            } while (!done);

            IO.println("You said the Width is: " + width);

            // Calculate area
            area = height * width;

            // Calculate perimeter
            perimeter = 2 * (height + width);

            // Calculate hypotenuse
            hypotenuse = Math.sqrt((height * height) + (width * width));

            // Display results
            IO.println("Height: " + height);
            IO.println("Width: " + width);
            IO.println("Area: " + area);
            IO.println("Perimeter: " + perimeter);
            IO.println("Hypotenuse: " + hypotenuse);

            in.close();
        }
    }


