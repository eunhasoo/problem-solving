import java.util.Arrays;

class Solution {
	public int solution(int n) {
		int answer = 0;
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for (int i = 2; (i * i) <= n; i++) {
			if (prime[i])
				for (int j = i * 2; j <= n; j += i) {
					prime[j] = false;
				}
		}
		for (boolean isPrime : prime)
			if (isPrime) 
				++answer;
		return answer;
	}
}