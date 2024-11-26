public class nprime {
    public static void prime(int n) {
        for (int i = 2; i <= n; i++) { // Start from 2 because 1 is not a prime number
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) { // Check divisors up to √i
                if (i % j == 0) { // If divisible, it's not a prime
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " "); // Print the prime number
            }
        }
    }

    public static void main(String[] args) {
        prime(10); // Find and print prime numbers up to 10
    }
}


