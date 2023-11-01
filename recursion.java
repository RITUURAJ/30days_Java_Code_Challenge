public class recursion {
    public static void main(String[] args) {
        int n = 10; // Change this to the number for which you want to calculate the factorial
        long factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive case: n! = n * (n-1)!
        }
    }
}
