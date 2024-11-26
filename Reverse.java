// import java.util.Arrays;
// public class Reverse {

//     int numbers[]={1,3,2,4,6,5,8,7};

//     void reverseArray(){
//         int len = numbers.length;

// //         for(int i=0;i<len/2;i++){
    
// //             int temp=numbers[i];
// //             numbers[i]=numbers[len-i-1];
// //             numbers[len-i-1]=temp;
// //         }

// //     }

// //     void printarray(){
// //         System.out.println(Arrays.toString(numbers));

// //     }

   


//     public static void main(String[] args) {
//         Reverse rv=new Reverse();
//         rv.reverseArray();
//         rv.printarray();
//     }
    
// }


import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
Scanner sc=new Scanner(System.in);
  
 int arrays[];


 public void reverseArray(){
System.out.println("Enter n");
 int n=sc.nextInt();
 arrays=new int[n];
 System.out.println("Enter" +n+"elements");

 for(int i=0;i<n;i++){
    arrays[i]=sc.nextInt();
 }


 int length=arrays.length;
 for(int i=0;i<length/2;i++){
    int temp=arrays[i];
    arrays[i]=arrays[length-i-1];
    arrays[length-i-1]=temp;
 }
}

 void printAll(){
    System.out.println(Arrays.toString(arrays));
 }

 public static void main(String[] args) {
    Reverse rv=new Reverse();
    rv.reverseArray();
    rv.printAll();
 }
}