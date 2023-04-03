public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = 42;
        double d = 22;
        long e = 54;
        long f = 11;
        System.out.println(Methods.minNumber(a,b));
        System.out.println(Methods.minNumber(c,d));
        System.out.println(Methods.minNumber(e,f));

        System.out.println("Площадь треугольника равна: " + AreaCalculation.area(a,b,c));
        System.out.println("Площадь окружности равна: " + AreaCalculation.area(a));
        System.out.println("Площадь прямоугольника равна: " + AreaCalculation.area(a,b));

    }
}