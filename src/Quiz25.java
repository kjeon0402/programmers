
public class Quiz25 {
	// 합성수 찾기
	// int n까지의 범위 중에서 약수의 갯수가 3개 이상인 수의 갯수 구하기
	// ex. int n = 10 -> 약수가 3개 이상인 것 : 4, 6, 8, 9, 10 -> answer = 5
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		
		int[] number = new int[n];					// 1부터 주어진 숫자까지의 배열
		int[] count = new int[n];					// 약수의 갯수를 저장할 배열
		
		for(int i = 0; i < number.length; i++) {
			number[i] = n - i;						// 배열에 1부터 주어진 숫자까지 저장
		}
//		Arrays.sort(number);
		
		for(int i = 0; i < number.length; i++) {
			for(int j = 1; j <= number[i]; j++) {
				if(number[i] % j == 0) {
					count[i]++;						// number배열의 약수의 갯수 구하기
				}
			}
		}
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] >= 3) {						// 약수의 갯수가 3보다 크면
				answer++;							// answer 증가
			}
		}
		System.out.println("answer : " + answer);
	}

}
