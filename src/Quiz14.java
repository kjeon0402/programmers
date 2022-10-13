
public class Quiz14 {
	// 특정 문자 제거하기
	// my_string에서 letter을 제거한 문자열을 출력
	public static void main(String[] args) {
		String my_string = "abcdef";
		String letter = "f";
		
		String answer = "";
		
		String[] strArr = my_string.split("");
		
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals(letter)) {
				strArr[i] = "";
			}
		}
		answer = String.join("", strArr);
		
		System.out.println("answer : " + answer);
	}

}
