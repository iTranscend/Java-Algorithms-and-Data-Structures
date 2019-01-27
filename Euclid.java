// Implementing euclid's algorithm which calculates the greatest common divisor of two positive integers
// Input: Two non-negative integers m and n
// Output: Greatest Common Divisor(gcd) 
public class Euclid {
    // Method to compute the actual gcd
    public static int gruntWork(int m, int n) {
        if (n == 0) return m;           
        else {
            int remainder = m % n;
            if (remainder == 0) {
                return n;
            } else {
                while (remainder > 0) {
                m = n;
                n = remainder;
                remainder = m % n;
                }
                return n;
            }
        }
    }

    // This method reorders the integers supplied to ensure the greater one comes first
    public static int euclid(int m, int n) {
        if (m > n) {
            return gruntWork(m, n);
        } else {
            int f = 0;
            f = m;
            m = n;
            n = f;
            return gruntWork(m, n);
        }
    }

    public static void main(String[] args) {
        System.out.println("The GCD is: " + euclid(1052, 52));          // 4
        System.out.println("The GCD is: " + euclid(45, 105));           // 15
    }
}