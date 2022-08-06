public class NewQuadratic {
    public static double quad(double a, double b, double c, boolean ran){
        double x = 999999999999999999999999999999999999999999999999999999999.9;
        if (ran){
            x = (-1*b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        }
        if (!ran){
            x = (-1*b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        }
        
        return x;
    }
    
}
