import java.util.ArrayList;
import java.util.List;

public class Quiz42 {
	// 이상한 문장 만들기
	// 문자열에서 단어를 단위로 대문자 소문자가 번갈아 가면서 만든 문자열 반환하기
	// ex. python java -> PyThOn JaVa
	public static void main(String[] args) {
		String s = "try hello world";
		String answer = "";
		
		String[] str = s.split("");				// 문자열을 각 문자마다 쪼개어 배열로 저장
		
		int idx = 0;							// 공백을 판별할 idx 선언(띄어쓰기마다 idx가 0이 되므로 단어 판별이 가능)
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(" ")) {			// 새로운 단어를 만나면 idx = 0
				idx = 0;
			} else if(idx % 2 == 0) {			// 짝수번째 인덱스는
				str[i] = str[i].toUpperCase();	// 대문자로
				idx++;							// idx는 ++
			} else if(idx % 2 != 0) {			// 홀수번째 인덱스는
				str[i] = str[i].toLowerCase();	// 소문자로
				idx++;
			}
			list.add(str[i]);
		}
		answer = String.join("", list.toArray(new String[list.size()]));
		System.out.println("answer : " + answer);
		
		// 에러 발생한 풀이
		// Test Case는 통과
		// 공백을 기준으로 단어들을 나누고, 단어들을 다시 나눠 인덱스 번호가 짝수이면 대문자, 홀수이면 소문자로 바꾸는 방식으로 접근
//		String s1 = s.trim();							// 양끝 공백을 제거
//		String[] strArr = s1.split(" ");				// 공백을 기준으로 나눔
//		
//		List<String> list1 = new ArrayList<String>();
//		for(int i = 0; i < strArr.length; i++) {
//			if(!strArr[i].equals("")) {
//				list1.add(strArr[i]);					// 나눠진 배열에서 공백이 아닌 요소만 list1에 저장
//			}
//		}
//
//		List<String> list2 = new ArrayList<String>();
//		for(int i = 0; i < list1.size(); i++) {
//			String string = list1.get(i);
//			char[] chArr = string.toCharArray(); 		// list1의 요소들을 char배열로 다시 나눠서
//			for(int j = 0; j < chArr.length; j++) {
//				if(j % 2 == 0) {						// 문제의 조건에 맞게 대소문자 변환
//					chArr[j] = Character.toUpperCase(chArr[j]);
//				} else {
//					chArr[j] = Character.toLowerCase(chArr[j]);
//				}
//			}
//			String str = new String(chArr);				// 변화된 char배열을 다시 string으로 묶고
//			list2.add(str);								// list2에 추가
//		}
//		
//		String[] arr = new String[list2.size()];
//		for(int i = 0; i < arr.length; i++) {			// list2의 요소들을 배열에 다시 저장
//			arr[i] = list2.get(i);
//		}
//		answer = String.join(" ", arr);					// 저장된 string 배열을 문자열로 반환
//		System.out.println("answer : " + answer);
	}

}
