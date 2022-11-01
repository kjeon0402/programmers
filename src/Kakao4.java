import java.util.ArrayList;
import java.util.List;

public class Kakao4 {
	// 숫자 문자열과 영단어
	// 숫자와 문자열이 섞인 문자열
	// ex. String str = "one4seveneight" -> answer = 1478
	public static void main(String[] args) {
		String s = "1zerotwozero3";
		int answer = 0;
		
		String[] str = s.split("");						// 문자열을 문자열 배열로 쪼갬
		
		List<Integer> list = new ArrayList<Integer>();	// 문자열의 요소들을 숫자로 바꿔서 저장할 리스트 선언				
		String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		int[] intArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		String string = "";								// 문자열 판별을 위해 활용할 빈 문자열 선언
		for(int i = 0; i < str.length; i++) {			// 문자열 배열의 길이만큼
			string += str[i];							// 빈 문자열에 문자를 하나씩 넣다가
			for(int j = 0; j < strArr.length; j++) {	// 판별할 문자열의 배열이나 판별할 숫자 배열의 요소와 같아지면
				if(string.equals(strArr[j]) || string.equals(String.valueOf(intArr[j]))) {
					list.add(intArr[j]);				// 리스트에 해당 숫자를 저장하고
					string = "";						// 빈 문자열로 초기화
				}
			}
		}
		for(int i = 0; i < list.size(); i++) {
			string += String.valueOf(list.get(i));		// 빈 문자열에 리스트의 숫자들을 string으로 변환하여 문자열로 저장하고
		}
		answer = Integer.parseInt(string);				// 다시 answer의 자료형에 맞게 int로 자료형 변환
		System.out.println("answer : " + answer);
	}

}
