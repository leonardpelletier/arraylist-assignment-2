import java.util.ArrayList;

class Question1 {
    
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
    
    public static void main (String[] args) {
        ArrayList<Integer> primesUnder100 = primesUnder(100);
        System.out.println(primesUnder100);
    }
}
