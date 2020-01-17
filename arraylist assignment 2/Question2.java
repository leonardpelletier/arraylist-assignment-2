import java.util.ArrayList;

class Question2 {
    
    public static ArrayList<Integer> primesUnder(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        //fill list with 2,3,4,...n
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }
        
        //remove the multiples!
        for (int i = 0; i < primes.size(); i++) {
            int p = primes.get(i);
            for (int j = i+1; j < primes.size(); j++ ) {
                if (primes.get(j) % p == 0) {
                    primes.remove(j);
                    j--;
                }
            }
        }
        return primes;
    }
    
    public static void goldbachSum(int n) {
        ArrayList<Integer> primes = primesUnder(n);
        for (int i = 0; i < primes.size(); i++) {
            int firstPrime  = primes.get(i);
            int secondPrime = n - firstPrime;
            if (primes.contains(secondPrime)) {
                System.out.println(firstPrime +  " + " + secondPrime + " = " + n);
                return;
            }
        }
    }
    
    public static void main (String[] args) {
        for (int i = 4; i <= 100; i += 2) {
            goldbachSum(i);
        }
    }
}
