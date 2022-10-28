import java.util.ArrayList;
import java.util.List;

public class Quiz32 {
	// 영어를 숫자로 바꾸기
	// ex. String s = "onetwothree" -> long answer = 123
	public static void main(String[] args) {
		String s = "eighttwozeroonefive";
		long answer = 0;
		
		String[] numbers = s.split("");					// 각각의 알파벳으로 자름
		
		List<String> list = new ArrayList<String>();
		String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		long[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		String string = "";
		for(int i = 0; i < numbers.length; i++) {
			string += numbers[i];						// 빈 문자열에 각각의 알파벳을 순서대로 넣으면서
			for(int j = 0; j < str.length; j++) {		// str배열과 비교해서
				if(string.equals(str[j])) {				// string과 str배열의 요소중 일치하는 것이 있을 때
					list.add(Long.toString(num[j]));	// list에 일치하는 해당 str배열의 요소의 인덱스 번호의 num배열의 요소를 저장하고
					string = "";						// string을 비운다
				}
			}
		}
		
		for(int i = 0; i < list.size(); i++) {			// string list의 길이만큼
			string += list.get(i);						// 빈 문자열 string에 list의 요소들을 순서대로 추가
		}
		
		answer = Long.parseLong(string);
		
		System.out.println("answer : " + answer);
		
//		String num = s.replace("one", "1");
//		num = num.replace("two", "2");
//		num = num.replace("three", "3");
//		num = num.replace("four", "4");
//		num = num.replace("five", "5");
//		num = num.replace("six", "6");
//		num = num.replace("seven", "7");
//		num = num.replace("eight", "8");
//		num = num.replace("nine", "9");
//		num = num.replace("zero", "0");
//		
//		answer = Long.parseLong(num);
//		
//		System.out.println("num : " + num);
//		System.out.println("answer : " + answer);
	}

}
