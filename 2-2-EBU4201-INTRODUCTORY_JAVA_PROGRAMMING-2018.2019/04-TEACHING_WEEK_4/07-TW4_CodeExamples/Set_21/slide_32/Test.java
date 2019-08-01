public class Test { 
   public static void main(String[] args) {
     int i;
     int sum=0;
     for (i=0; i<=10; i++) {
       sum = sum + i;
     } 
     assert (i == 10) : "i is " + i;
   }
 }