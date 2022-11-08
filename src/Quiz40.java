
public class Quiz40 {
	// 숨어 있는 숫자의 덧셈
	// 알파벳 대문자, 소문자, 숫자가 섞여있는 문자열에서 숫자만 추출하여 더한 값 반환하기
	// 붙어있는 숫자는 한 덩어리로 본다
	// ex. String s = "aAb1B2cC34oOp" -> 1 + 2 + 34 answer = 37
	public static void main(String[] args) {
		String s = "Qkkem90dkfn1dnf9";
		int answer = 0;
		
		char[] arr = s.toCharArray();				// 문자열을 쪼개어 char 배열로 저장
		for(int i = 0; i < arr.length; i++) {
			// char 자료형은 아스키코드 10진수 또는 16진수로 나타낼 수 있음을 활용
			// 아스키 코드 65 -> 'A', 90 -> 'Z', 97 -> 'a', 122 -> 'z'
			if((arr[i] >= 65 && arr[i] <= 90) || (arr[i] >= 97 && arr[i] <= 122)) {
				arr[i] = '-';						// 해당 요소가 알파벳이면, '-'(식별 가능한 문자)을 저장
			}
		}
		
		String str = new String(arr);				// char 배열을 String 문자열로 변환
		String[] strArr = str.split("-");			// String을 '-'을 기준으로 쪼개어 배열로 저장('-'이 있던 자리는 공백이 된다)
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals("")) {				// 요소가 공백이면
				strArr[i] = "0";					// 0을 넣는다
			}
		}
		
		int[] intArr = new int[strArr.length];		// string 배열과 길이가 같은 int 배열 선언
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);// int배열에 string 배열에 담긴 숫자들을 int로 변환하며 대입
			answer += intArr[i];					// answer에 더함
		}
		System.out.println("answer : " + answer);
	}

}
