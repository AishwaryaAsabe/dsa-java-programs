// public class ArmStrong {
//     public static boolean isArmS(int num){
//         int temp=num;
//         int sum=0;

//         while(temp!=0){
//             int digit =temp%10;
//             sum +=Math.pow(digit, 3);
//             temp /=10;
//         }

//         if(sum==num){
//             return true;
//         }

//         else{
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         int num=153;
//         if(isArmS(num)){
//             System.out.println("is armsrong");
//         }else{
//             System.out.println("not artstrogn");
//         }
//     }
// }




// public class ArmStrong {
//     // Function to calculate if a number is an Armstrong number
//     public static boolean isArmS(int num) {
//         int digits = 0;
//         int temp = num;
//         int sum = 0;
//         int originalNum = num;

//         // First loop to count the number of digits
//         while (temp != 0) {
//             temp /= 10;
//             digits++;
//         }

//         temp = num;  // Reset temp to the original number
        
//         // Second loop to calculate Armstrong sum
//         while (temp != 0) {
//             int digit = temp % 10;
//             sum += Math.pow(digit, digits);  // Use the optimized power function
//             temp /= 10;
//         }

//         return sum == originalNum;  // Compare the sum with the original number
//     }

//     // Optimized function to calculate power (digit^digits) without using Math.pow()
//     // public static int power(int base, int exp) {
//     //     int result = 1;
//     //     while (exp > 0) {
//     //         result *= base;
//     //         exp--;
//     //     }
//     //     return result;
//     // }

//     public static void main(String[] args) {
//         int num = 9474;  // Example of a four-digit Armstrong number
//         if (isArmS(num)) {
//             System.out.println(num + " is an Armstrong number");
//         } else {
//             System.out.println(num + " is not an Armstrong number");
//         }
//     }
// }


public class ArmStrong{
    public static boolean isArmS(int num){
        int temp=num;
        int digits=0;
        int sum=0;

        while(temp!=0){
            temp/=10;
            digits++;
        }

        temp=num;

        while(temp!=0){
            int digit=temp%10;
            sum+=Math.pow(digit,digits);
            temp/=10;

        }


        return sum==num;
    }

    public static void main(String[] args) {
        int num=1634;
        if(isArmS(num)){
         System.out.println("ArmStrong");
        }else{
            System.out.println("NOTArmStrong");

        }
    }
}