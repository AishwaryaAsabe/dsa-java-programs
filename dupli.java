import java.util.HashSet;

public class dupli {
    public static void main(String[] args) {
        int[] array={1 ,1,2,4,3,5,5};
        HashSet<Integer> set=new HashSet<>();

        for(int num :array){
            set.add(num);
        }
        System.out.println(set);
    }
}
