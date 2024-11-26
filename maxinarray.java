public class maxinarray {
    public static void main(String[] args) {
        int[] array={1 ,3, 2,9,5};

        int max=0;
        for(int i=0;i<=array.length-1;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
