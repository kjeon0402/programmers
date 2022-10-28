
public class Quiz30 {
	// 문자열로 주어진 수식 계산하기
	// String equ = "3 + 5" -> int answer = 8
	// 수식은 길어질 수 있음
	public static void main(String[] args) {
		String equ = "3 + 5 - 7";
		int answer = 0;
		
		String[] arr = equ.split(" ");			// 수식을 배열로 저장
		answer = Integer.parseInt(arr[0]);		// answer에 첫 값을 저장
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 != 0) {					// 배열에서 홀수번째 요소는(홀수번째 요소가 + 또는 -)
				if(arr[i].equals("+")) {		// 해당 홀수번째 요소가 +이면
					answer += Integer.parseInt(arr[i + 1]);	// answer에서 그 해당 홀수번째 요소 다음 것을 더해준다
				} else {						// 해당 홀수번째 요소가 -이면
					answer -= Integer.parseInt(arr[i + 1]);	// answer에서 그 해당 홀수번째 요소 다음 것을 뺀다
				}
			}
		}
		System.out.println("answer : " + answer);
	}

}
