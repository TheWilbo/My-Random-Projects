class Quadratic{
    public static void main(String[] args){
        double a = 1;
        double b = 9;
        double c = 18;
        double first = 3;
        double second = 4;
        System.out.println("Quadratic:"+calc(a,b,c,true));
        System.out.println("Quadratic:"+calc(a,b,c,false));
        System.out.println("Pythag:"+pythag(first,second,true));
        System.out.println(pythag(first,second,false));
        System.out.println("Sum of cubes:("+a+"^3)+("+b+"^3)=("+a+"+"+b+")("+a+"^2-"+a+b+"+"+b+"^2)");
        System.out.println("Difference of cubes:("+a+"^3)-("+b+"^3)=("+a+"-"+b+")("+a+"^2+"+a+b+"+"+b+"^2)");
    }
    public static double calc(double a, double b, double c,boolean runPositive){
        double returnStatement;
        double x;
        double backHalfOfQuadraticFormula = Math.sqrt(Math.pow(b,2)-4*a*c);
        if (runPositive){
          x = (-1*b+backHalfOfQuadraticFormula)/(2*a);
          returnStatement = x;
          } else{
        x = (-1*b-backHalfOfQuadraticFormula)/(2*a);
          returnStatement = x;
          }
      return returnStatement;
    }
    public static double pythag(double first, double second, boolean solveForHypotnose){
      double returnStatement;
      if (solveForHypotnose){
        returnStatement = Math.sqrt(Math.pow(first,2) + Math.pow(second,2));
      } else {
        returnStatement = Math.sqrt(Math.pow(first,2) - Math.pow(second,2));
      }
      return returnStatement;
    }
}