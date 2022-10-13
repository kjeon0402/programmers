import java.util.ArrayList;
import java.util.List;

public class Quiz18 {
	// 문자 반복 출력하기
	// ex. String my_string = bye / int n = 3 -> String answer = bbbyyyeee 
	public static void main(String[] args) {
		String my_string = "bye";
		int n = 3;
		String answer = "";
		
		List<Character> list = new ArrayList<Character>();
		
		for(int i = 0; i < my_string.length(); i++) {		// my_string의 길이만큼 반복
			for(int j = 0; j < n; j++) {					// 0부터 n의 숫자까지의 갯수만큼 
				list.add(my_string.charAt(i));				// list에 my_string의 문자 하나(charAt(i))를 추가한다
			}												// 이미 배열에는 list : bbbyyyeee 상태
		}

		char[] chArr = new char[list.size()];				// list의 길이만큼 저장이 가능한 배열을 선언
		for(int i = 0; i < chArr.length; i++) {				// 배열의 길이만큼
			chArr[i] = list.get(i);							// list의 값들을 배열에 저장
		}
		
		answer = new String(chArr);
		System.out.println("answer : " + answer);
	}

}
