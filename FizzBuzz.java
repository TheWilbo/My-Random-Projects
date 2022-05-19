public class FizzBuzz{
    public static void main(String args[]){
        String out;
        for(long i=1; i<999999; ++i){
            if (i%3==0 && i%5==0){
                out = "fizzbuzz";
            }else if (i%5==0){
                out = "buzz";
            }else if (i%3==0){
                out = "fizz";
            } else{
                out = "";
            }
            System.out.println(i+":"+out);
        }
    }
}