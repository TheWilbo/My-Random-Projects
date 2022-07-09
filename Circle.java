public class Circle{
    public static double circle(double x, double y, double k, double h){
        double r = Math.sqrt((Math.pow(x-h,2))+(Math.pow(y-k,2)));
        return r;
    }
}