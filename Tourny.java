class Tourney{
   public static void main(String args[]){
       long i =0L;
       for (long peopleLeft = 7900000000L; peopleLeft > 1; peopleLeft /= 2){
           ++i;
           System.out.println(i+":"+peopleLeft);
       }
   } 
}