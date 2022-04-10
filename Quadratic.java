import java.util.*;
class Quadratic{
    public static void main(String[] args){
        System.out.println("Alpha 1.1.2");
        System.out.println("1,9,18,3,4,1,2,3,4,5,6,7");
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
        System.out.print("Enter a side of a right triangle ");  
        double first= sf.nextInt();
        //double first = 3;
        Scanner sg= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter another side of a right triangle ");  
        double second= sg.nextInt();
        //double second = 4;
        Scanner sh= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter u of the sum/difference of cubes eqt.");  
        double u= sh.nextInt();
        //double u = 1;
        Scanner si= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter v of the sum/difference of cubes eqt.");  
        double v= si.nextInt();
        //double v = 2;
        Scanner sj= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter x of the circle");  
        double x= sj.nextInt();
        //double x = 3;
        Scanner sk= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter y of the circle");  
        double y= sk.nextInt();
        //double y = 4;
        Scanner sl= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter k of the circle");  
        double k= sl.nextInt();
        //double k = 5;
        Scanner sm= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter h of the circle");  
        double h= sm.nextInt();
        //double h = 6;
        Scanner sn= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter a number of the Fibonacci sequence ");  
        long I= sn.nextInt();
        System.out.println();
        System.out.println("Quadratic: "+calc(a,b,c,true));
        System.out.println("Quadratic: "+calc(a,b,c,false));
        System.out.println("Hypotnuse: "+pythag(first,second,true));
        System.out.println("Side B: "+pythag(first,second,false));
        System.out.println("Sum of cubes:("+u+"^3)+("+v+"^3)=("+u+"+"+v+")(("+u+"^2)-"+u+"*"+v+"+("+v+"^2))");
        System.out.println("Difference of cubes:("+u+"^3)-("+v+"^3)=("+u+"-"+v+")(("+u+"^2)+"+u+"*"+v+"+("+v+"^2))");
        System.out.println("Radius of the circle: "+circle(x,y,k,h));
        System.out.println("Fibonacci: "+fib(I));
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
    public static double pythag(double first, double second, boolean solveForHypotnuse){
      double returnStatement;
      if (solveForHypotnuse){
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
    public static long fib(long I){
        long f = 1;
        long s = 0;
        long t = 0;
        long num = 0;
        while (num < I){ //4660046610375530310L
          ++num;
          t=f+s;
          f=s;
          s=t;
          //System.out.println(num+":"+t);
        }
        return t;
    }
}