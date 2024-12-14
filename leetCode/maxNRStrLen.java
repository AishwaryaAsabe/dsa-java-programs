import java.util.HashMap;

public class maxNRStrLen {
    
  public int gettheleng(String s){
    HashMap<Character , Integer> charIndexMap=new HashMap<>();
  int maxLength=0;
  int start=0;

  for(int end =0;end<s.length();end++){
     char currentChar=s.charAt(end);

     //Now if the character is already there in the map
     if(charIndexMap.containsKey(currentChar)){
        start=Math.max(start,charIndexMap.get(currentChar)+1);
     }

     charIndexMap.put(currentChar, end);
     maxLength=Math.max(maxLength, end-start+1);
  }

  return maxLength;
  }
public static void main(String[] args) {
    maxNRStrLen mc=new maxNRStrLen();
     String s="abbscs";
    int result =mc.gettheleng(s);
    System.out.println("It Is " +result);
}
    
}
