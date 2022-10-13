
public class Quiz11 {
	// 약수의 개수와 덧셈
	// int left, int right 두 정수 사이의 모든 정수들 중
	// 약수의 개수가 짝수인 것은 더하고 홀수인 것은 뺀다
	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		
		int[] arr = new int[right - left + 1];		// left부터 right까지 배열로 담기 위해 선언
		for(int i = 0; i < arr.length; i++) {		// left부터 right까지 값들을 저장
			arr[i] = left++;
		}
		
		int[] count = new int[arr.length];			// 약수의 갯수를 담기 위한 배열
		for(int i = 0; i < count.length; i++) {
			count[i] = 0;							// 초기값으로 모두 0을 저장
		}
		
		for(int i = 0; i < arr.length; i++) {		// left부터 right까지 담긴 배열에서 
			for(int j = 1; j <= arr[i]; j++) {		// 각 arr[i]의 범위 안에
				if(arr[i] % j == 0) {				// arr[i]에서 나누어 떨어지는 숫자 j가(약수가) 하나 발견될 때마다
					count[i]++;						// count를 증가시켜라
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < count.length; i++) {		// count(약수의 갯수)가 저장된 배열에서
			if(count[i] % 2 == 0) {					// 약수의 갯수가 짝수이면
				answer += arr[i];					// answer에 약수의 갯수가 짝수인 정수를 더하고
			} else if(count[i] % 2 == 1) {			// 약수의 갯수가 홀수이면
				answer -= arr[i];					// answer에 약수의 갯수가 홀수인 정수를 빼라
			}
		}
		System.out.println("answer : " + answer);
	}

}
