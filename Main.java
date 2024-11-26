class Palindrome{
    public String isPalindrome(int arr[]){
        int left=0;
        int right=arr.length-1;

        while (left<right) {
            if(arr[left]!=arr[right]){
                return "false";
            }
            left++;
            right--;
        }
        return "is is palindorm";

    }

   
}

class Main{
    public static void main(String[] args) {
        Palindrome pl=new Palindrome();
        int numbers[]={1,2,3,2,1};
    
        System.out.println(pl.isPalindrome(numbers));
    }
}
