public class Max1 {
    public static void giveMAx(int arr[]){
    
        int max=arr[0];

        for(int i=0 ;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[]={11,2,30003,4,5};
        giveMAx(arr);
    }
}
