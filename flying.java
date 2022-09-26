import java.util.Scanner;
class flying{ //This was to test Github Copilot
    public static void main(String[] args){
        System.out.println("Fibonacci number? ");
        Scanner sc= new Scanner(System.in);
        long i = sc.nextInt();
        //Fib myObj = new Fib();
        System.out.println(Fib.fib(i));
        sc.close();
    }
}