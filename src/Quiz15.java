
public class Quiz15 {
	// 문자열을 받아서 대문자는 소문자로, 소문자는 대문자로
	public static void main(String[] args) {
		String my_string = "aBcDeFgHiJkLmN";
		String answer = "";
		
		char[] chArr = my_string.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			if(Character.isLowerCase(chArr[i])) {
				answer += Character.toUpperCase(chArr[i]);
			} else {
				answer += Character.toLowerCase(chArr[i]);
			}
		}
		
		System.out.println("answer : " + answer);
	}

}
