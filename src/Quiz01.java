import java.util.ArrayList;
import java.util.Arrays;

public class Quiz01 {
	// arr의 각 element 중 divisor로 나누어 떨어지는 값들의 배열을 반환하는 함수
	// divisor로 나누어 쩔어지는 element가 하나도 없는 경우 배열에 -1을 담아 반환
	public static void main(String[] args) {
		int[] answer = {};
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				arrayList.add(arr[i]);
			}
		}
		
		if(arrayList.isEmpty()) {
			arrayList.add(-1);
		}
		
		System.out.println("arrayList : " + arrayList);
		
		answer = new int[arrayList.size()];
		
		for(int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		
		Arrays.sort(answer);
		Arrays.toString(answer);
	}

}
