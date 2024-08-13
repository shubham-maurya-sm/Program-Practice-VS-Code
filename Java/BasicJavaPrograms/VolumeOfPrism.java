import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press '1' for Volume of prism ");
        System.out.println("Press '2' for Volume of triangular prism ");
        System.out.println("Press '3' for Volume of rectangular prism ");
        System.out.println("Press '4' for Volume of pentagonal prism ");
        System.out.println("Press '5' for Volume of hexagonal prism ");
        System.out.println();
        System.out.print("Enter your option : ");
        int option = sc.nextInt();
        double volume, height, apLength, bsLength;

        if (option <= 6) {
            switch (option) {
                case 1:
                    System.out.println("Selected Volume of a prism :");

                    System.out.print("Enter the Base Area of the prism : ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the length of the prism : ");
                    double length = sc.nextDouble();

                    volume = Volumeprism(base, length);

                    System.out.println("Volume of the prism with base area = " + base + " cm^2 and length = " + length
                            + " cm = " + volume + " cm^3");

                    break;
                case 2:
                    System.out.println("Selected Volume of a triangular prism :");

                    System.out.print("Enter the Apothem length of a triangular prism : ");
                    apLength = sc.nextDouble();
                    System.out.print("Enter the Base length of a triangular prism : ");
                    bsLength = sc.nextDouble();
                    System.out.print("Enter the  height of a triangular prism : ");
                    height = sc.nextDouble();

                    volume = triangularVolumePrism(apLength, bsLength, height);

                    System.out.println(
                            "Volume of the triangular prism with Apothem length = " + apLength + " cm, base length = "
                                    + bsLength + " cm and height = " + height + " cm = " + volume + " cm^3");

                    break;
                case 3:
                    System.out.println("Selected Volume of a rectangular prism :");

                    System.out.print("Enter the base width of a rectangular prism : ");
                    double bseWidth = sc.nextDouble();
                    System.out.print("Enter the Base length of a rectangular prism : ");
                    double bseLength = sc.nextDouble();
                    System.out.print("Enter the  height of a rectangular prism : ");
                    height = sc.nextDouble();

                    volume = rectangularVolumePrism(bseWidth, bseLength, height);

                    System.out.println(
                            "Volume of the rectangular prism with Base Width = " + bseWidth + " cm, base length = "
                                    + bseLength + " cm and height = " + height + " cm = " + volume + " cm^3");

                    break;
                case 4:
                    System.out.println("Selected Volume of a pentagonal prism :");

                    System.out.print("Enter the Apothem length of a pentagonal prism : ");
                    apLength = sc.nextDouble();
                    System.out.print("Enter the Base length of a pentagonal prism : ");
                    bsLength = sc.nextDouble();
                    System.out.print("Enter the  height of a pentagonal prism : ");
                    height = sc.nextDouble();

                    volume = pentagonalVolumePrism(apLength, bsLength, height);

                    System.out.println(
                            "Volume of the pentagonal prism with Apothem length = " + apLength + " cm, base length = "
                                    + bsLength + " cm and height = " + height + " cm = " + volume + " cm^3");

                    break;
                case 5:
                    System.out.println("Selected Volume of a hexagonal prism :");

                    System.out.print("Enter the Apothem length of a hexagonal prism : ");
                    apLength = sc.nextDouble();
                    System.out.print("Enter the Base length of a hexagonal prism : ");
                    bsLength = sc.nextDouble();
                    System.out.print("Enter the  height of a hexagonal prism : ");
                    height = sc.nextDouble();

                    volume = hexagonalVolumePrism(apLength, bsLength, height);

                    System.out.println(
                            "Volume of the hexagonal prism with Apothem length = " + apLength + " cm, base length = "
                                    + bsLength + " cm and height = " + height + " cm = " + volume + " cm^3");

                    break;

                default:
                    System.out.println("Please ! Enter correct option");
                    break;
            }

        } else
            System.out.println("Try again with right option");

    }

    public static double Volumeprism(double bse, double len) {
        double volume = bse * len;

        return volume;

    }

    public static double triangularVolumePrism(double len, double bse, double hgt) {
        double volume = (len * bse * hgt) / 2;

        return volume;

    }

    public static double rectangularVolumePrism(double width, double length, double height) {
        double volume = (width * length * height);

        return volume;

    }

    public static double pentagonalVolumePrism(double len, double bse, double hgt) {
        double volume = (len * bse * hgt) * 5 / 2;

        return volume;

    }

    public static double hexagonalVolumePrism(double len, double bse, double hgt) {
        double volume = 3 * (len * bse * hgt);

        return volume;

    }
}
