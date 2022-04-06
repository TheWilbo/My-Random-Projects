public class Fib{
    public static void main(String[] args) {
        long f = 1;
        long s = 0;
        long t=0;
        long num = 0;
        while (t<4660046610375530310L){
        ++num;
        t=f+s;
        f=s;
        s=t;
        System.out.println(num+":"+t);
        }
        }
}