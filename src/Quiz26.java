import java.util.ArrayList;
import java.util.List;

public class Quiz26 {
	// k의 개수
	// 범위 사이(i ~ j)에서 숫자 k의 갯수
	// ex. int i = 1, int j = 13, int k = 1;
	// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13] -> 1을 포함하는 숫자 1, 10, 11, 12, 13
	// answer = 6 (1의 갯수)
	public static void main(String[] args) {
		int a = 1;
		int b = 100;
		int c = 1;
		int answer = 0;
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i = a; i <= b; i++) {
			list1.add(i);								// a ~ b까지 정수를 넣은 List 생성
		}
		
		int[] arr = new int[list1.size()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = list1.get(i);						// List를 배열로 변환
		}
		
		String[] strArr = new String[arr.length];
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = String.valueOf(arr[i]);			// 변환한 int 배열을 String 배열로 변환
		}

		List<String> list2 = new ArrayList<String>();	// 각각 자릿수 숫자 비교를 위해 각 자릿수를 모두 쪼갠 값을 저장할 List 선언
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].length() >= 2) {				// 배열의 요소의 길이가 2 이상이면(2자릿수 이상이면)
				for(int j = 0; j < strArr[i].length(); j++) {
					list2.add(strArr[i].split("")[j]);	// 해당 요소를 잘라서 요소의 길이만큼 List에 추가
				}
			} else {
				list2.add(strArr[i]);					// 그 외에는 그냥 List에 추가
			}
		}
		
		String[] anArr = new String[list2.size()];
		for(int i = 0; i < anArr.length; i++) {
			anArr[i] = list2.get(i);					// List를 다시 배열로 변환
		}
		
		for(int i = 0; i < anArr.length; i++) {			// 최초에 주어진 c 값을 각각 비교해서
			if(anArr[i].equals(String.valueOf(c))) {	// 일치하는 값이 나올 때마다
				answer++;								// answer++
			}
		}
		System.out.println("answer : " + answer);
	}

}
