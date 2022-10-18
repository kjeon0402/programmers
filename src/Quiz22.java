import java.util.Arrays;

public class Quiz22 {
	// 배열 회전시키기
	// ex. arr = [1, 2, 3]
	// String dir = left / arr = [2, 3, 1]
	// String dir = right / arr = [3, 1, 2]
	public static void main(String[] args) {
		String dir = "right";
		int[] arr = {1, 2, 3};
		int[] answer = new int[arr.length];				// 정답 배열의 길이는 주어진 배열의 길이와 동일
		
		for(int i = 0; i < answer.length - 1; i++) {	// left, right에 따라 맨 앞이나 맨 뒤로 가는 숫자는 
														// 따로 값을 지정해줄 것이므로 for문에서 제외된다, 그래서 answer.length - 1
			if(dir.equals("left")) {					// 주어진 방향이 left일 때
				answer[answer.length - 1] = arr[0];		// answer배열의 가장 마지막 요소는 arr의 가장 첫번째 요소
				answer[i] = arr[i + 1];					// arr배열의 요소 하나씩 왼쪽으로 밀어서 answer배열에 저장
			} else if(dir.equals("right")) {			// 주어진 방향이 right일 때
				answer[0] = arr[answer.length - 1];		// answer배열의 가장 첫번째 요소는 arr의 가장 마지막 요소
				answer[i + 1] = arr[i];					// arr배열의 요소 하나씩 오른쪽으로 밀어서 answer에 저장
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}
