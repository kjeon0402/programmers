import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quiz27 {
	// 한 번만 등장한 문자
	// 문자열에서 한 번만 등장한 문자만 문자열로 반환하는 함수
	// ex. String s = "aabbccd" => String answer = "d"
	// answer은 알파벳 순으로
	public static void main(String[] args) {
		String s = "hello";
		
		String[] arr = s.split("");											// 문자열을 잘라서 배열에 저장
		
		List<String> list = new ArrayList<String>();						// 한 번만 등장한 문자만 저장할 리스트 선언
		
		for(int i = 0; i < arr.length; i++) {
			if(Collections.frequency(Arrays.asList(arr), arr[i]) == 1) {	// 배열에 해당 요소가 한 번만 나오면
				list.add(arr[i]);											// list에 추가, list에는 한 번만 나온 요소만 저장된
			}
		}
		
		String[] anArr = new String[list.size()];
		for(int i = 0; i < anArr.length; i++) {
			anArr[i] = list.get(i);											// 저장된 리스트를 배열로 옮기고
		}
		
		Arrays.sort(anArr);													// 정렬하고
		String answer = String.join("", anArr);								// 문자열로 합치기
		System.out.println("answer : " + answer);
	}

}
