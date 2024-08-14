import java.util.*;

public class VolumeOfPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Press '1' for Volume of pyramid ");
        System.out.println("Press '2' for Volume of triangular pyramid ");
        System.out.println("Press '3' for Volume of rectangular pyramid ");
        System.out.println("Press '4' for Volume of square pyramid ");
        System.out.println("Press '5' for Volume of hexagonal pyramid ");
        System.out.println();
        System.out.print("Enter your option : ");
        int option = sc.nextInt();
        double volume, height, bsLength;

        if (option <= 6) {
            switch (option) {
                case 1:
                    System.out.println("Selected Volume of a pyramid :");

                    System.out.print("Enter the Area of the Base of the pyramid : ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the height of the pyramid : ");
                    height = sc.nextDouble();

                    volume = VolumePyramid(base, height);

                    System.out.println("Volume of the pyramid with area of base = " + base + " cm^2 and height = "
                            + height + " cm = " + volume + " cm^3");

                    break;
                case 2:
                    System.out.println("Selected Volume of a triangular pyramid :");

                    System.out.print("Enter the triangular base  of triangular pyramid : ");
                    double triBse = sc.nextDouble();
                    System.out
                            .print("Enter the triangular height (ie, cross sectional height)of triangular pyramid : ");
                    double triHgt = sc.nextDouble();
                    System.out.print("Enter the  height of a triangular pyramid : ");
                    height = sc.nextDouble();

                    volume = triangularVolumePyramid(triBse, triHgt, height);

                    System.out.println(
                            "Volume of the triangular pyramid with Area of triangular (base*height/2)i.e.,  triangular base = "
                                    + triBse + " cm, triangular height" + triHgt + " cm and height of the pyramid = "
                                    + height + " cm = " + volume
                                    + " cm^3");

                    break;
                case 3:
                    System.out.println("Selected Volume of a rectangular pyramid :");

                    System.out.print("Enter the base length of a rectangular pyramid : ");
                    double bseLength = sc.nextDouble();
                    System.out.print("Enter the base width of a rectangular pyramid : ");
                    double bseWidth = sc.nextDouble();
                    System.out.print("Enter the  height of a rectangular pyramid : ");
                    height = sc.nextDouble();

                    volume = rectangularVolumePyramid(bseLength, bseWidth, height);

                    System.out.println(
                            "Volume of the rectangular pyramid with Base length = " + bseLength + " cm, base width = "
                                    + bseWidth + " cm and height = " + height + " cm = " + volume + " cm^3");

                    break;
                case 4:
                    System.out.println("Selected Volume of a square pyramid :");

                    System.out.print("Enter the length of the side of the square pyramid : ");
                    double side = sc.nextDouble();

                    System.out.print("Enter the  height of a square pyramid : ");
                    height = sc.nextDouble();

                    volume = squareVolumePyramid(side, height);

                    System.out.println(
                            "Volume of the square pyramid with length of the side of the square = " + side
                                    + " cm, and height = " + height + " cm = " + volume + " cm^3");

                    break;
                case 5:
                    System.out.println("Selected Volume of a hexagonal pyramid :");

                    System.out.print("Enter the  side length of the hexagon base of hexagonal pyramid : ");
                    bsLength = sc.nextDouble();
                    System.out.print("Enter the  height of a hexagonal pyramid : ");
                    height = sc.nextDouble();

                    volume = hexagonalVolumePyramid(bsLength, height);

                    System.out.println("Volume of the hexagonal pyramid with  side length of the hexagon base = "
                            + bsLength + " cm and height = " + height + " cm = " + volume + " cm^3");

                    break;

                default:
                    System.out.println("Please ! Enter correct option");
                    break;
            }

        } else
            System.out.println("Try again with right option");

    }

    public static double VolumePyramid(double bse, double hgt) {
        double volume = (bse * hgt) / 3;

        return volume;

    }

    public static double triangularVolumePyramid(double tBase,double tHeight, double hgt) {
        double volume = (tBase*tHeight * hgt) / 6;

        return volume;

    }

    public static double rectangularVolumePyramid(double length, double width, double height) {
        double volume = (length * width * height) / 3;

        return volume;

    }

    public static double squareVolumePyramid(double side, double height) {
        double volume = (side * side * height) / 3;

        return volume;

    }

    public static double hexagonalVolumePyramid(double len, double hgt) {
        double volume = (Math.sqrt(3) / 2) * len * len * hgt;

        return volume;

    }
}
