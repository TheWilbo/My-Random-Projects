class Tourny{
   public static void main(String args[]){
       long i =0L;
       for (double peopleLeft = 7900000000; peopleLeft > 1; peopleLeft /= 2){
           ++i;
           System.out.println(i+":"+peopleLeft);
       }
   } 
}