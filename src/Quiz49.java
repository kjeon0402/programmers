import java.util.Arrays;

public class Quiz49 {
	// 예산
	// 부서별로 신청한 금액의 배열 d, 예산 budget이 있을 때, 주어진 예산으로 최대 몇 개의 부서를 지원해줄 수 있는지 반환
	// budget을 초과할 순 없음
	// ex. d = {1, 3, 2, 5, 4}, budget = 9 -> 최대 1 + 3 + 5 = 9 이므로 answer = 3
	public static void main(String[] args) {
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		int answer = 0;
		
		// 작은 수부터 더하는 것이 가장 최대의 값을 낼 수 있을 것이다 -> 오름차순으로 정렬
		Arrays.sort(d);
		int sum = 0;
		for(int i = 0; i < d.length; i++) {
			sum += d[i];			// sum에 d의 요소들을 더하다가
			if(sum > budget) {		// sum이 budget보다 커지면
				answer = i;			// answer에 i를 저장하고(i - 1번째 까지 더한 것이 최댓값이므로 인덱스번호 특성상 i를 넣어줌)
				break;				// for문을 빠져나옴
			}
		}
		if(sum <= budget) {			// sum에 다 더했는데 budget보다 작거나 같은 경우
			answer = d.length;		// 배열의 길이 자체가 answer
		}
		System.out.println("answer : " + answer);
	}

}
