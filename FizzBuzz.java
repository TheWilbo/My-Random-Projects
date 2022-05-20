public class FizzBuzz{
    public static void main(String args[]){
        String out;
        for(long i=1; i<=9223372036854775807L; ++i){
            out = "";
            if (i%3==0){
                out = "fizz";
            }
            if (i%5==0){
                out = out+"buzz";
            } 
            if (out == ""){
                System.out.println(i);
                continue;
            }
            System.out.println(out);
        }
    }
}