
public class Quiz02 {
	// 정수 제곱근
	// answer은 정수 n이 정수의 제곱수인지 판별하여, 제곱수라면 (제곱근 + 1)의 제곱수를 반환
	public static void main(String[] args) {
		int n = 3;
		long answer = 0;
		
		for(long i = 1; i <= n; i++) {
			if(i * i == n) {
				answer = (i + 1) * (i + 1);
				break;
			} else {
				answer = -1;
			}
		}
		System.out.println("answer : " + answer);
	}

}
