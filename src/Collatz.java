
public class Collatz {
	// 콜라츠 추측
	// 특정 숫자 num을 짝수이면 2로 나누고, 홀수이면 3을 곱하고 1을 더한다.
	// 이 과정을 계속해서 반복하면 모든 숫자는 1이 된다.
	// answer : 이 과정을 거치는 횟수
	// 횟수가 500을 넘어가면 -1 반환
	public static void main(String[] args) {
		long num = 626331;
		int answer = 0;
		
		while(num != 1) {						// num이 1이 아닌 동안
			if(num % 2 == 0) {					// num이 2로 나누어 떨어지면
				num /= 2;						// num을 2로 나눈 값을 넣어라
			} else {							// 그 외의 경우
				num = num * 3 + 1;				// num에 3을 곱하고 1을 더한 값을 넣어라
			}
			answer++;							// 한 번 if연산을 할 때마다 answer을 증가시켜라
			if(answer == 500) {					// 증가되던 answer이 500이 되면 
				answer = -1;					// answer 값을 -1으로 반환하고
				break;							// while문을 빠져나와라
			}
		}
		
		
		System.out.println("answer : " + answer);
	}

}
