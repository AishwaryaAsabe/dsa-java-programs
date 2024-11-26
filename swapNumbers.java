public class swapNumbers {
    public static void swapNum(int a , int b){
    System.out.println("a = " + a + " , b ="+ b);

    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a =  " + a + ",b ="+b);
    }
    public static void main(String[] args) {
        int a=4;
        int b=7;
        swapNum(a, b);
    }
}
