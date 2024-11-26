public class vowelcount {
    public static void main(String[] args) {
        String str="Hello World";

        int count =0;

        for(char ch:str.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
