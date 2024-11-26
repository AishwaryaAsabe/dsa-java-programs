public class secondlargest {
    public static void main(String[] args) {
        int [] array={2 ,4,9,3,1,8};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int num:array){
            if(num>largest){
                secondlargest=largest;
                largest=num;
            }
            else if(num>secondlargest && num !=largest){
                secondlargest=num;
            }
        }
        System.out.println(secondlargest);
    }

}
