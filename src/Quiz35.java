import java.util.Arrays;
import java.util.Collections;

public class Quiz35 {
	// A로 B만들기
	// 두 문자열이 주어졌을 때 A를 재배치하여 B를 만들 수 있는가? 참이면 1, 거짓이면 2 반환
	// ex. String before = "olleh", String after = "hello" -> answer = 1
	public static void main(String[] args) {
		String before = "array";
		String after = "yarra";
		int answer = 0;
		
		int count = 0;
		String[] arr1 = before.split("");
		String[] arr2 = after.split("");
		
		// 두 문자열을 재조합해서 같이 만들려면 문자열에 포함된 각 글자들의 갯수가 서로 같으면 됨
		for(int i = 0; i < arr1.length; i++) {
			if(Collections.frequency(Arrays.asList(arr1), arr1[i])				// arr1의 요소가 arr1에 들어있는 횟수 
					== Collections.frequency(Arrays.asList(arr2), arr1[i])) {	// arr1의 요소가 arr2에 들어있는 횟수
				count++;
			}
		}
		if(count == arr1.length) {
			answer = 1;				// 다섯 글자 모두 갯수가 같으면 1
		} else {
			answer = 0;
		}
		
		System.out.println("answer : " + answer);
	}

}
