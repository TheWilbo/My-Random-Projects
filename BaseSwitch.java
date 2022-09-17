import java.util.Scanner;

// Java program to convert one base to other
public class BaseSwitch {
    public static String baseConversion(String number, int sBase, int dBase){
        // Parse the number with source radix
        // and return in specified radix(base)
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }
    public static void main(String[] args){
        
        Scanner test= new Scanner(System.in);
        while (true){
        System.out.println("Number to parse? "); 
        String number =test.next();
        System.out.println("Source base? ");
        //Scanner test0= new Scanner(System.in); 
        int sBase =test.nextInt();
        System.out.println("Destination base? ");
        //Scanner test1= new Scanner(System.in); 
        int dBase =test.nextInt();
        //test.close();
        //test0.close();
        //test1.close();
        //int sBase = 8; // Source Base Octal
        //int dBase = 10; // Destination Base Decimal
        System.out.println("Source base to Destination base: "+ baseConversion(number, sBase, dBase));
        //dBase = 16; // Destination Base Hexadecimal
        //System.out.println("Source base to Hex: "+ baseConversion(number, sBase, dBase));
        //Scanner test= new Scanner(System.in); 
        System.out.println("Exit? y/n ");
        String exit =test.next();
        String yes = "y";
        if (exit.equals(yes)){
            test.close();
            break;
        }
        
        }
    }
}