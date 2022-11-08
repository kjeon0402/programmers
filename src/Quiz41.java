import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz41 {
	// 소인수 분해
	// 임의의 숫자가 주어졌을 때, 소인수분해한 값들이 저장된 배열 반환하기
	// ex. int n = 12 -> 12 = 2 * 2 * 3 -> answer = {2, 3}
	public static void main(String[] args) {
		int n = 420;
		int[] answer = {};
		
		List<Integer> list1 = new ArrayList<Integer>();
		// 소인수분해
		int k = 2;
		while(n >= k) {
			if(n % k == 0) {
				list1.add(k);
				n /= k;
			} else {
				k++;
			}
		}
		// 중복된 숫자를 빼고 다른 리스트에 저장
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < list1.size(); i++) {
			if(!list2.contains(list1.get(i))) {
				list2.add(list1.get(i));
			}
		}
		
		answer = new int[list2.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list2.get(i);
		}
		
		System.out.println("answer : " + Arrays.toString(answer));
	}

}
