
public class Quiz28 {
	// 등차수열 등비수열
	// 등차수열인지 등비수열인지 판별하여 그 다음 올 요소 반환하기
	// ex. {1, 2, 3, 4} -> answer = 5 / {2, 4, 6} -> answer = 8
	public static void main(String[] args) {
		int[] arr = {2, 4, 6};
		
		int answer = 0;
		int len = arr.length;			// 배열의 길이
		
		for(int i = 0; i < len - 2; i++) {		// 배열의 길이 - 2만큼(그냥 길이만 두면 등차수열 등비수열 판별 과정에서 InboundException 발생)
			if(arr[i] - arr[i + 1] == arr[i + 1] - arr[i + 2]) {			// 등차수열 조건
				answer = arr[len - 1] + (arr[1] - arr[0]);					// 가장 마지막 요소에 요소들끼리의 차를 더함
			} else if(arr[i + 1] / arr[i] == arr[i + 2] / arr[i + 1]) {		// 등비수열 조건
				answer = arr[len - 1] * (arr[1] / arr[0]);					// 가장 마지막 요소에 요소들끼리 나눈 결과를 더함
			}
		}
		System.out.println("answer : " + answer);
	}

}
