public class pali {
    public static boolean IsPalindrome(String str){
     String reveredString=new StringBuilder(str).reverse().toString();
     if(str.equals(reveredString)){
        return true;
     }
     return false;
    }
 public static void main(String[] args) {
    if(IsPalindrome("TRT")){
        System.out.println("Palindrome");

    }else{
        System.out.println("Not");;
    }
 }

}
