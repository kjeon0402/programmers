import java.util.Arrays;

public class Quiz37 {
	// 진료순서 정하기
	// 환자의 응급도를 숫자로 표현된 배열을 보고 응급도가 높은 순서대로 진료 순서를 정한 배열을 반환
	// ex. 응급도 = {3, 75, 36} -> 진료순서 = {3, 1, 2}
	public static void main(String[] args) {
		int[] emergency = {3, 75, 36};
		int[] answer = new int[emergency.length];
		
		int rank = 1;										// 순서를 1로 선언
		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if(emergency[i] < emergency[j]) {			// 각 요소들을 비교하여 비교대상이 작으면
					rank++;									// rank를 더해주는 방식
				}
			}
			answer[i] = rank;
			rank = 1;										// for문 하나가 끝날 때 rank는 1로 다시 초기화해준다
		}
		System.out.println(Arrays.toString(answer));
	}

}
