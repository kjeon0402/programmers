import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz39 {
	// 문자열 잘라서 배열로 저장하기
	// 문자열과 임의의 숫자가 주어지는데, 문자열을 숫자만큼 잘라서 배열로 저장하여 반환
	// ex. string = "helloeveryone", int k = 4 -> answer = {"hell", "oeve", "ryon", "e"}
	public static void main(String[] args) {
		String s = "abc1Addfggg4556b";
		int n = 6;
		String[] answer = {};
		
		String[] arr = s.split("");					// 문자열을 배열로 쪼갠다
		List<String> list = new ArrayList<String>();// 문자열의 요소를 저장할 리스트 선언
		int count = 0;								// count : 주어진 숫자의 배수마다 넣을 요소에 활용
		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);						// list에 배열의 요소들을 저장하면서
			count++;								// count++
			if(count % n == 0) {					// count가 n의 배수가 될 때
				list.add("-");						// list에 "-"(특정 문자열)를 추가
			}
		}
		
		String[] arr2 = new String[list.size()];	// list 사이즈의 다른 배열을 선언하고
		for(int i = 0; i < arr2.length; i++) {		// list의 요소를 그대로 저장
			arr2[i] = list.get(i);
		}
		
		String string = String.join("", arr2);		// String으로 합친 다음
		answer = string.split("-");					// "-"를 기준으로 split
		System.out.println("answer : " + Arrays.toString(answer));
		
		// 런타임 에러 발생한 풀이
		// 문자열의 길이에 따라 주어진 임의의 숫자로 길이가 나누어 떨어지느냐 아니냐로 나눠서 접근함
		// substring을 통해 answer에 들어갈 문자열을 판별했으며, for문 안에서 replace를 활용해 이미 answer에 요소로 들어간 문자열은 삭제했음
//		int length = s.length();
//		while(length != 0) {									// 문자열의 길이가 0이 아닌 동안 반복해라
//			String string = "";									// for문 안에서 활용할 문자열
//			if(length % n == 0) {								// 문자열의 길이가 임의의 숫자로 나누어 떨어지면
//				answer = new String[length / n];				// answer의 길이는 length / n
//				for(int i = 0; i < answer.length; i++) {		// answer의 길이만큼
//					string = s.substring(0, n);					// string은 문자열에서 임의의 숫자 길이만큼 자른다
//					answer[i] = string;							// answer에 저장
//					s = s.replace(string, "");					// 저장한 후의 문자열은 공백으로 대체
//				}
//				break;
				// break를 해주지 않으면 최종 남은 길이가 결국 n으로 나누어 떨어지기 때문에 break로 while를 빠져나와준다
//			} 
//			if(length % n != 0) {								// 문자열의 길이가 임의의 숫자로 나누어 떨어지지 않으면
//				answer = new String[length / n + 1];			// answer의 길이는 length / n + 1
//				for(int i = 0; i < answer.length - 1; i++) {	// 위의 풀이와 같음(-1까지인 이유는 마지막 요소는 따로 넣어줄거라 그런거임)
//					string = s.substring(0, n);
//					answer[i] = string;
//					s = s.replace(string, "");
//				}
//				answer[length / n] = s.substring(0, length % n);// answer의 마지막 요소는 마지막까지 잘린 문자열에서 0부터 length에서 n을 나눈 나머지까지의 길이
//				break;
//			}
//			length /= n;
//		}
//		System.out.println("answer : " + Arrays.toString(answer));
	}

}
