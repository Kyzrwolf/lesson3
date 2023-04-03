public class AreaCalculation {

    public static double area (double sideOne, double sideTwo, double sideThree) {
        double semiPerimeter = (sideOne +  sideTwo +  sideThree) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter * sideTwo) * (semiPerimeter * sideThree));
        return area;

    }
    public static double area (int radius) {
        double area = Math.PI * Math.abs(radius);
        return area;
    }

    public static int area (int height, int width) {
        return height * width;
    }

}
