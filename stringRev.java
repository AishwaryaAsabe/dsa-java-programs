public class stringRev {
   public static void strRiv(String str) {
     String reveredString=new StringBuilder(str).reverse().toString();
     System.out.println(reveredString);
   }

   public static void main(String[] args) {
    strRiv("Mindtree");
   }
}
