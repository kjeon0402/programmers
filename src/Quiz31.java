import java.util.Arrays;

public class Quiz31 {
	// OX퀴즈
	// 수식이 담긴 배열의 결과가 맞으면 O, 틀리면 X를 넣은 배열을 반환
	// ex. {"4 + 3 = 7", "5 - 7 = 2"} => answer = {"O", "X"}
	public static void main(String[] args) {
		String[] quiz = {"4 + 3 = 7", "5 - 7 = 22", "8 + 6 = 14"};
		String[] answer = new String[quiz.length];
		
		for(int i = 0; i < quiz.length; i++) {				// 배열 quiz의 길이만큼
			String[] arr1 = quiz[i].split(" = ");			// arr1 : '='을 기준으로 나눈 배열(첫 요소는 수식, 그 다음 요소는 계산한 결과) 
															// ex. {"4 + 3", "7"}
			String[] arr2 = arr1[0].split(" ");				// arr2 : '='을 기준으로 나눈 배열에서 첫 요소(수식)을 다시 쪼개서 배열로 생성
															// ex. arr1[0] = "4 + 3" -> arr2 = {"4", "+", "3"}
			// 수식 계산하는 과정
			int sum = Integer.parseInt(arr2[0]);			// sum에 arr2의 첫번째 요소(수식의 첫 값) 저장(ex. 4)
			for(int j = 0; j < arr2.length; j++) {			// 배열 arr2의 길이만큼
				if(j % 2 != 0) {							// 배열의 인덱스가 홀수이면(홀수번째 요소는 +또는 -)
					if(arr2[j].equals("+")) {				// 해당 인덱스의 요소가 +이면
						sum += Integer.parseInt(arr2[j + 1]);	// sum에 그 다음 요소를 더하고
					} else {								// 해당 인덱스의 요소가 -이면
						sum -= Integer.parseInt(arr2[j + 1]);	// sum에 그 다음 요소를 뺀다
					}
				}
			}
			
			if(sum == Integer.parseInt(arr1[1])) {			// 계산한 값(sum)이 arr1[1]과 같으면
				answer[i] = "O";							// 해당 인덱스번째의 answer의 요소는 O
			} else {										// 계산한 값(sum)이 arr1[1]과 같지 않으면
				answer[i] = "X";							// 해단 인덱스번째의 answer의 요소는 X
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}
