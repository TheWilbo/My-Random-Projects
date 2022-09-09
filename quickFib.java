public class quickFib {
    public static long fib(long I){
        long firstFib = 1;
        long secondFib = 0;
        long thirdFib = 0;
        for (long loopCount = 0; loopCount < I; ++loopCount){ //4660046610375530310L
          thirdFib=firstFib+secondFib;
          firstFib=secondFib;
          secondFib=thirdFib;
          //System.out.println(num+":"+t);
        }
        return thirdFib;
    }
}
