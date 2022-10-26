
public class Factorial {
	// 팩토리얼
	// ex. 5! = 5 * 4 * 3 * 2 * 1 = 120
	// 정수 n이 주어질 때 최대 팩토리얼 구하기
	// ex. n = 130 => answer = 5
	public static void main(String[] args) {
		int n = 7;
		int answer = 0;
		
		int max = 0;
		for(int i = 1; i <= 10; i++) {				// n의 최고값은 10!이므로 범위는 1~10
			if(fac(i) <= n) {						// 팩토리얼 결과가 n보다 작으면
				max = i;							// max에 넣기
			}										
		}
		// for문에서 반복해서 넣으면 1~10까지의 수 중 조건을 충족하는 가장 큰 수(가장 마지막 수)가 max에 저장됨
		
		answer = max;
		System.out.println("answer : " + answer);
	}
	
	public static int fac(int num) {				// 팩토리얼 함수
		int facto = 1;								// facto 1에
		while(num != 0) {							// 매개변수 num이 0이 될 때까지
			facto *= num;							// facto에 num을 곱한다
			num--;									// num은 1씩 줄어든다
		}
		return facto;
	}

}
