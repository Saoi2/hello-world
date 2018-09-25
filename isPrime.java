public class isPrime {
	public static boolean[] primes;

	public static void generatePrimes(int n) {
		primes = new boolean[n + 1];	
		for (int i = 1; i <= n; i++) {
			primes[i] = true;
		}
		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i <= n; i++) {
			if (primes[i]) {
				for (int j = 2 * i; j <= n; j += i) {
					primes[j] = false;
				}
			}
		}
	}

	public static boolean isPrime (int i) {
		if(primes[i])
			return true;
		else
			return false;
	}

        public static void main(String[] args) {
		//generate primes less than N
		int N = Integer.parseInt(args[0]);
		generatePrimes(N);
		if (isPrime(N)) {
			System.out.println(N + " is prime");
		} else {
			System.out.println(N + " is not prime");
		}
	}
}
