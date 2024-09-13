public class DistanceCalculator {

    public static double calculateDistance(double x1, double y1,
                                           double x2, double y2){
        double delX = x2 - x1;
        double delY = y2 - y1;

        return Math.sqrt(delX * delX + delY * delY);
    }


}
