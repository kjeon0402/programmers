import java.util.Arrays;

public class Quiz08 {
	// 가운데 글자를 반환하는 함수
	// ex) String s = "abcde" => answer = "c"
	// 길이가 짝수인 경우 가운데 두 글자를 반환 "qwer" => "we"
	public static void main(String[] args) {
		String s = "강지언";
		String answer = "";
		String[] arr = new String[s.length()];							// 주어진 문자열 길이의 배열 선언
		
		arr = s.split("");												// 배열에 문자열을 한 글자씩 쪼개서 넣기
		System.out.println(Arrays.toString(arr));
		
		if(arr.length % 2 != 0) {										// 배열의 길이(문자열의 길이)가 홀수이면
			answer = arr[arr.length / 2];								// answer에 중간값을 넣고
		} else if(arr.length % 2 == 0) {								// 배열의 길이(문자열의 길이)가 짝수이면
			answer = arr[arr.length / 2 - 1] + arr[arr.length / 2];		// answer에 중간값 2개를 넣는다
		}
		
		System.out.println("answer : " + answer);
	}

}
