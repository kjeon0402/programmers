import java.util.Arrays;

public class Quiz17 {
	// 문자열 정렬하기
	// 문자열 my_string을 받아서 전부 소문자로 바꾸고 알파벳 순으로 정렬하기
	public static void main(String[] args) {
		String my_string = "Bcad";
		String answer = "";
		
		char[] chArr = my_string.toCharArray();				// toLowerCase로 String을 char의 배열로 한글자씩 저장
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = Character.toLowerCase(chArr[i]);		// 먼저 소문자로 바꿔주고
		}
		Arrays.sort(chArr);									// sort로 정렬(char 자료형은 아스키코드 값이 있기 때문에 sort로 정렬이 가능)
		
		answer = new String(chArr);							// answer에 chArr을 String으로 이어서 저장
		
		System.out.println("answer : " + answer);
	}

}
