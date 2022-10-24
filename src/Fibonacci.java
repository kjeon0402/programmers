
public class Fibonacci {
	// Fibonacci, 피보나치 수열
	// F(0) = 0, F(1) = 1일 때, F(n) = F(n - 2) + F(n - 1)이 성립되는 수열
	// int n = 2 이상일 때 F(n)을 1234567로 나눈 나머지를 구하는 함수
	public static void main(String[] args) {
		int n = 5;
		int[] answer = new int[n + 1];						// F(0)부터 시작하므로 n + 1
															// answer배열은 피보나치 수열값을 1234567로 나눈 나머지의 배열
		for(int i = 0; i <= n; i++) {
			if(i == 0) {
				answer[i] = 0;								// F(0) = 0, answer[0] = 0
			} else if(i == 1) {
				answer[i] = 1;								// F(1) = 1, answer[1] = 1
			} else {
				int sum = answer[i - 1] + answer[i - 2];	// n >= 2, F(n) = F(n - 1) + F(n - 2)
				answer[i] = sum % 1234567;					// answer[i] = F(n) % 1234567
			}
		}
		System.out.println("answer[n] : " + answer[n]);
	}

}
