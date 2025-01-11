public class palCount {
    
    public boolean pal(String s ,int k){



     if(k>s.length()){
        return false;
     }

     int []freq=new int[26];
     for (char c : s.toCharArray()) {
        freq[c - 'a']++; 
    }

    int oddCount=0;

    for(int count:freq){
        if(count%2==1){
            oddCount++;
        }
    }
    return oddCount<=k;

    }


    public static void main(String[] args) {
        String s="anle";
        int k=2;
        palCount pc=new palCount();
       System.out.println( pc.pal(s, k));
    }
}
