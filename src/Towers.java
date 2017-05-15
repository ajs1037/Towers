/*
* 
* Solves Towers of Hanoi puzzle
*
*/

class Towers {
   static int nDisks = 3;

   public static void main(String[] args) {
      solveTowers(nDisks, 'A', 'B', 'C');
   }
   public static void solveTowers(int topN, char src, char inter, char dest) {
      if(topN==1) {
         System.out.println("Disk 1 from " + src + " to "+ dest);
      }
      else {
         solveTowers(topN-1, src, dest, inter); 
         System.out.println("Disk " + topN + " from " + src + " to "+ dest);
         solveTowers(topN-1, inter, src, dest);
      }
   }
}