import java.util.ArrayList;
import java.util.List;

public class wordcount {

    public List<String> wordsubset(String []words1,String []words2){
      int []maxFreq=new int[26];

      for(String word:words2){
          int []freq=countFrequency(word);
          for(int i=0;i<26;i++){
            maxFreq[i]=Math.max(maxFreq[i], freq[i]);
          }

      }


      List<String> result=new ArrayList<>();

      for(String word:words1){
        int []freq=countFrequency(word);
         boolean isUniversal=true;
        for(int i=0;i<26;i++){
            if(maxFreq[i]>freq[i]){
                isUniversal=false;
            }
        }
        if(isUniversal){
         result.add(word);
        }
        
      }

      return result;
    }

    private  int[] countFrequency(String word){
      int []freq=new int[26];
      for(char c:word.toCharArray()){
          freq[c-'a']++;

      }

      return freq;
    }

    public static void main(String args[]){
        String[] words1={"gopgle" ,"amazon" ,"leetcde" ,"facebook"};
        String[] words2={"e" ,"o"};
    
        wordcount wd=new wordcount();
        System.out.println(wd.wordsubset(words1, words2));
    }
}


