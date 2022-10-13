import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz05 {
	// 배열에서 가장 작은 수를 찾아 제거하기
	// 반환하려는 배열이 공백인 경우 {-1} 반환
	public static void main(String[] args) {
		int[] arr = {10, 500, 11, 13, 15};
		int[] answer = {};
		
		int temp = arr[0];									// 첫 값을 기준값으로 삼는다
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < temp) {								// 배열 arr의 각 요소들을 비교하여 기준값보다 작으면
				temp = arr[i];								// temp에 넣는다 / temp는 최솟값이 저장됨
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();		// list를 하나 초기화하고
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != temp) {							// 배열에 저장된 값을 중 최솟값을 제외하고
				list.add(arr[i]);							// list에서 추가한다 / list에는 최초의 arr 배열에서 최솟값이 빠진 상태로 저장
			}
		}
		if(list.size() == 0) {								// 혹시 list의 길이가 0이면 / list에 저장된 값이 없으면
			list.add(-1);									// list에 -1을 저장한다
		}
		answer = new int[list.size()];						// 리턴할 배열의 사이즈는 최종 list의 길이로 지정하고
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);						// answer 배열에 list의 값들을 저장한다
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
