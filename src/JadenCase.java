
public class JadenCase {
	// JadenCase : 문장에서 모든 단어의 첫 글자만 대문자, 나머지는 소문자
	public static void main(String[] args) {
		String s = "for the last week";
		String answer = "";
		
		String[] arr = {};
		arr = s.split("");							// 문자열 배열에 문자열을 쪼개서 저장
		
		for(int i = 1; i < arr.length; i++) {		// int i = 0인 경우
			if(arr[i - 1].equals(" ")) {			// arr[i - 1]에서 인바운드 에러 발생 / arr[-1]은 존재하지 않기 때문
				arr[i] = arr[i].toUpperCase();		// arr[i]의 바로 앞 문자가 공백이면 대문자로
			} else {
				arr[i] = arr[i].toLowerCase();		// 나머지는 소문자로
			}
		}
		arr[0] = arr[0].toUpperCase();				// arr[0] 문자열의 제일 첫 글자는 별도로 대문자로
		
		answer = String.join("", arr);
		System.out.println("answer : " + answer);
		
	}

}
