import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz24 {
	// 같은 숫자는 싫어
	// 주어진 배열에서 중복을 제거하고 배열로 반환
	// ex. arr = [1, 1, 3, 3, 0, 0, 1, 1] -> answer = [1, 3, 0, 1]
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 0, 1, 1};
		int[] answer = {};
		
		List<Integer> list = new ArrayList<Integer>();
		int num = -1;										// 영향을 받지 않는 숫자를 하나 선정
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != num) {								// 배열 요소가 num과 다르면 
				list.add(arr[i]);							// list에 추가
				num = arr[i];								// 넣은 숫자는 num에 저장
			}
		}
		// arr[i] = 1인 경우 num에 1이 저장되어 그 뒤로 다시 1이 나오면 list에 저장되지 않게 됨
		
		answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
