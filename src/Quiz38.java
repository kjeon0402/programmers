import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz38 {
	// 2차원 만들기
	// 1차 배열을 숫자 k만큼 쪼개어 2차 배열로 만들기
	// ex. {1, 2, 3, 4, 5, 6, 7, 8}, k = 2 -> {{1, 2}, {3, 4}, {5, 6}, {7, 8}}
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int k = 2;
		int[][] answer = {};
		
		List<Integer> nums = new ArrayList<Integer>();				// 배열을 리스트로 선언
		for(int i = 0; i < num_list.length; i++) {
			nums.add(num_list[i]);									// 배열을 리스트에 저장
		}
		
		List<List<Integer>> list =  new ArrayList<List<Integer>>();	// 이중 배열 선언(최종 결과를 넣을 리스트)
		while(nums.size() + 1 > k) {								// 리스트 nums의 사이즈 + 1이 k보다 큰 동안에 반복
			List<Integer> temp = new ArrayList<Integer>();			// while문 안에서 쓸 임시 배열 선언
			for(int i = 0; i < k; i++ ) {							// 0부터 임의의 숫자 k의 길이만큼
				temp.add(nums.get(i));								// 임시 배열에 저하고
			}
			nums.subList(0, k).clear();								// 0부터 k만큼 nums에서 삭제
																	// ex. {1, 2, 3, 4}, k = 2 -> {3, 4} 
			list.add(temp);											// 최종 이중 배열에 임시 배열을 저장
		}
		
		answer = new int[list.size()][k];							// 최종 결과를 낼 이중 배열의 사이즈를 지정하고
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < k; j++) {
				answer[i][j] = list.get(i).get(j);					// 이중 for문으로 list의 요소 하나씩 배열에 저장
			}
		}
		System.out.println("answer : " + Arrays.toString(answer));
	}
}
