import java.util.Scanner;
public class oddeven {
    public static boolean isOdd(int num){
    
      if(num%2==0){
        return false;
      }
      return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter number i");
        int num=sc.nextInt();
        if(isOdd(num)){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");
        }
        sc.close();
    }
}
