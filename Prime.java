public class Prime {
    public static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        for(int i=2 ; i<= Math.sqrt(num); i++){
        if(num %2==0){
            return false;
        }
        }
        return true;
        }
    

    public static void main(String[] args) {
        for(int num=0;num<30;num++){
            if(isPrime(num)){
                System.out.println(num + "  "+ "Is Prime");
            }
            else{
                System.out.println(num + "  "+ "not prime");
            }
        }
    }
}
