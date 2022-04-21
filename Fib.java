import java.util.*;
public class Fib{
    public static void main(String[] args) {
        System.out.print("Fibonacci number? ");  
        Scanner sc= new Scanner(System.in);
        long i = sc.nextInt();
        long number = fib(i);
        System.out.println(number);
        }
    public static long fib(long num){
        if (num==0){
            return 0;
        } else if (num==1){
            return 1;
        } else {
            return fib(num-1)+fib(num-2);
        }
    }
}