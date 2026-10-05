import java.util.Scanner;


public class RectangleInfo {


    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean done = false;
        String trash = "";

        do {
            IO.print(" Enter the Height: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                IO.print(" You must a correct Height not :" + trash);
                IO.print(" Try again ");
            }
        }    while (!done) ;


            done = false;


        do {
                IO.print(" Enter the Width: ");

                if (in.hasNextDouble()) {
                    width = in.nextDouble();
                    done = true;
                } else {
                    trash = in.nextLine();
                    IO.print(" You must a correct Width not :" + trash);
                    IO.print(" Try again ");
                }
        }        while (!done) ;


                    area=height * width;
                    diagonal = Math.sqrt((width * width) + (height * height));
                    perimeter = (height + width) * 2;

                    IO.println( " Area is Height " + height + " * Width " + width + " is Area " + area);
                    IO.println(" Perimeter is height " + height + " width " + width + " = " + perimeter );
                    IO.println("Diagonal is height " + height + " * 2 the width " + width + " * 2  = " + diagonal);


    }
}
