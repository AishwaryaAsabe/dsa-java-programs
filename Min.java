public class Min {
    public static void main(String[] args) {
        int numbers []=new int[5];
        numbers[0]=11;
        numbers[1]=4;
        numbers[2]=66;
        numbers[3]=10;

        numbers[4]=19;

        int len=numbers.length;
        int min=numbers[0];

        for(int i=1; i<len; i++){
            if(numbers[i]<min)
            min=numbers[i];
        }

        System.out.print(min);
    }
}
