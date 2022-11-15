import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz45 {
	// 최솟값 만들기
	// 두 자연수의 배열에서 각각 수를 뽑아 곱한 값을 누적하여 더한다
	// 더한 값이 최솟값이 나올 때 answer에 이 값을 반환할 것
	// ex. [1, 2], [3, 4] -> 2 * 3 + 1 * 4 = 10, answer = 10
	public static void main(String[] args) {
		int[] A = {1, 2, 3};
		int[] B = {3, 4, 5};
		int answer = 0;
		
		// A의 최솟값 * B의 최댓값을 했을 때 가장 작을 것이라고 예상
		// 배열 하나는 오름차순, 다른 하나는 내림차순으로 정렬하고 순서대로 곱하여 더하는 방법을 선택
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		for(int i = 0; i < A.length; i++) {
			a.add(A[i]);
		}
		for(int i = 0; i < B.length; i++) {
			b.add(B[i]);
		}
		
		Collections.sort(a);	// 오름차순
		Collections.sort(b);	// 오름차순
		Collections.reverse(b);	// 오름차순의 역순(내림차순)
		
		for(int i = 0; i < a.size(); i++) {
			answer += a.get(i) * b.get(i);
		}
		
		System.out.println("answer : " + answer);
	}

}
