import java.util.*;
class Quadratic{
    public static void main(String[] args){
      System.out.println("You would like to do a test run. true/false");
      double a,b,c,first,second,u,v,x,y,k,h;
      long I;
      Scanner test= new Scanner(System.in); 
      boolean doTest=test.nextBoolean();
      if (!doTest){
      System.out.println("1,9,18,3,4,1,2,3,4,5,6,7"); 
        System.out.print("Enter A in the quadratic ");  
        a= scanner(false); 
        System.out.print("Enter B in the quadratic ");  
        b= scanner(false);  
        System.out.print("Enter C in the quadratic ");  
        c= scanner(false); 
        System.out.print("Enter a side of a right triangle ");  
        first= scanner(false); 
        System.out.print("Enter another side of a right triangle ");  
        second= scanner(false); 
        System.out.print("Enter u of the sum/difference of cubes eqt.");  
        u= scanner(false);  
        System.out.print("Enter v of the sum/difference of cubes eqt.");  
        v= scanner(false);  
        System.out.print("Enter x of the circle");  
        x= scanner(false);  
        System.out.print("Enter y of the circle");  
        y= scanner(false); 
        System.out.print("Enter k of the circle");  
        k= scanner(false); 
        System.out.print("Enter h of the circle");  
        h= scanner(false);
        System.out.print("Enter a number of the Fibonacci sequence ");  
        I= (long) scanner(true);
      }else{
        test.close();
        a=1;
        b=9;
        c=18;
        first=3;
        second=4;
        u=1;
        v=2;
        x=3;
        y=4;
        k=5;
        h=6;
        I=7;
      }
      System.out.println();
      System.out.println("Quadratic: "+NewQuadratic.quad(a,b,c,false));
      System.out.println("Quadratic: "+NewQuadratic.quad(a,b,c,true));
      //System.out.println("Hypotenuse: "+pythag(first,second,true));
      System.out.println("Hypotenuse: " +Pythag.pythag(first,second,true));
      //System.out.println("Side B: "+pythag(first,second,false));
      System.out.println("Side B: " +Pythag.pythag(first,second,false));
      System.out.println("Sum of cubes:("+u+"^3)+("+v+"^3)=("+u+"+"+v+")(("+u+"^2)-"+u+"*"+v+"+("+v+"^2))");
      System.out.println("Difference of cubes:("+u+"^3)-("+v+"^3)=("+u+"-"+v+")(("+u+"^2)+"+u+"*"+v+"+("+v+"^2))");
      System.out.println("Radius of the circle: "+Circle.circle(x,y,k,h));
      System.out.println("Fibonacci: "+QuickFib.fib(I));
    }
    /*public static double calc(double a, double b, double c,boolean runPositive){ //split methods into different files went you learn more about java
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
    }*/
    /*public static double pythag(double first, double second, boolean solveForHypotenuse){
      double returnStatement;
      if (solveForHypotenuse){
        returnStatement = Math.sqrt(Math.pow(first,2) + Math.pow(second,2));
      } else {
        returnStatement = Math.sqrt(Math.pow(first,2) - Math.pow(second,2));
      }
      return returnStatement;
    }*/
    /*public static double circle(double x, double y, double k, double h){
      double r = Math.sqrt((Math.pow(x-h,2))+(Math.pow(y-k,2)));
      return r;
    }*/
    /*public static long fib(long I){
        long firstFib = 1, secondFib = 0, thirdFib = 0;
        //long secondFib = 0;
        //long thirdFib = 0;
        for (long loopCount = 0; loopCount < I; ++loopCount){ //4660046610375530310L
          thirdFib=firstFib+secondFib;
          firstFib=secondFib;
          secondFib=thirdFib;
          //System.out.println(num+":"+t);
        }
        return thirdFib;
    }*/
    public static double scanner(Boolean close){
      Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 
      double temp = sc.nextInt(); 
      if (close == true) { //To check if we are done with the scanner.
        sc.close();
        temp = (long) sc.nextInt(); //To hopefully prevent floating point inaccuracies.
      }
      return temp;
    }
}