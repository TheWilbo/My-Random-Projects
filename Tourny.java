class Tourny{
   public static void main(String args[]){
       long i =0L;
       for (long peopleLeft = 0xbeef; peopleLeft > 1; peopleLeft = (peopleLeft/2)+peopleLeft%2){
           ++i;
           System.out.println(i+":"+peopleLeft);
       }
   } 
}
//7900000000L