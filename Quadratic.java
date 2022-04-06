import java.util.*;
class Quadratic{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter A in the quadratic ");  
        double a= sc.nextInt();
        //double a = 1;
        Scanner sd= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter B in the quadratic ");  
        double b= sd.nextInt();
        //double b = 9;
        Scanner se= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter C in the quadratic ");  
        double c= se.nextInt();
        //double c = 18;
        Scanner sf= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter A side of a right triangle ");  
        double first= sf.nextInt();
        //double first = 3;
        Scanner sg= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter B in the quadratic ");  
        double second= sg.nextInt();
        //double second = 4;
        double u = 1;
        double v = 2;
        double x = 3;
        double y = 4;
        double k = 5;
        double h = 6;
        System.out.println();
        System.out.println("Quadratic: "+calc(a,b,c,true));
        System.out.println("Quadratic: "+calc(a,b,c,false));
        System.out.println("Pythag: "+pythag(first,second,true));
        System.out.println(pythag(first,second,false));
        System.out.println("Sum of cubes:("+u+"^3)+("+v+"^3)=("+u+"+"+v+")(("+u+"^2)-"+u+"*"+v+"+("+v+"^2))");
        System.out.println("Difference of cubes:("+u+"^3)-("+v+"^3)=("+u+"-"+v+")(("+u+"^2)+"+u+"*"+v+"+("+v+"^2))");
        System.out.println("Radius of the circle: "+circle(x,y,k,h));
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
    public static double circle(double x, double y, double k, double h){
      double r = Math.sqrt((Math.pow(x-h,2))+(Math.pow(y-k,2)));
      return r;
    }
}