import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort01 {
	// K번째 수 - 정렬
	// 배열 array를 i번째부터 j번째까지 자르고 정렬한 뒤 k번째 수를 구해서 배열로 반환하는 함수
	// ex. [6, 8, 1, 2, 4, 7], [[1, 3, 2], [2, 5, 4]] = answer = [6, 8]
	// [6, 8, 1] -> [1, 6, 8] k = 2 -> answer[0] = 6
	// [8, 1, 2, 4] -> [1, 2, 4, 8] k = 4 -> answer[1] = 8
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = {};
		
		List<Integer> anList = new ArrayList<Integer>();
		for(int i = 0; i < command.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for(int j = command[i][0] - 1; j <= command[i][1] - 1; j++) {	// 각각의 commands배열의 요소들을 찍어서 범위 지정
				list.add(array[j]);
			}
			Collections.sort(list);											// 저장된 리스트 정렬하기
			anList.add(list.get(command[i][2] - 1));						// 정렬된 리스트에서 해당 k번째 숫자 추출하여 다른 리스트에 저장
		}
		
		answer = new int[anList.size()];									// 정답 리스트를 배열로 옮기는 과정
		for(int i = 0; i < answer.length; i++) {
			answer[i] = anList.get(i);
		}
		
		System.out.println("answer : " + Arrays.toString(answer));
	}

}
