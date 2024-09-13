import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the co-ordinates of first point : ");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the co-ordinates of second point: ");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();


        double distance = DistanceCalculator.calculateDistance(x1,y1,x2,y2);
        System.out.println("The shortest distance is "+ distance);
        scanner.close();

    }
}