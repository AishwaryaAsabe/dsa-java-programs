import java.util.Arrays;

public class anagram {
    public static boolean isAnagram(String str1, String str2){
       char []arr1=str1.toCharArray();
       char []arr2=str2.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);
       if(Arrays.equals(arr1, arr2)){
        return true;
       }
       return false;

    }
    public static void main(String[] args) {
        if(isAnagram("listen", "sient")){
            System.out.println("anagram");
        }else{
            System.out.println("not");
        }
    }
}
