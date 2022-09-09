public class NewQuadratic {
    public static double quad(double a, double b, double c, boolean ran){
        double x = 0; //To init variable.
        if (ran){
            x = (-1*b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        }
        if (!ran){
            x = (-1*b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        }
        
        return x; //Without "= 0" in line 3, this line complains.
    }
    
}
