
public class Quiz10 {
	// 최솟값 최댓값 구하기
	// 숫자들이 문자열로 저장, 최솟값과 최댓값을 추출하여 문자열로 반환하기
	// ex) String n = "1 2 3 4 " => String answer = "1 4"
	// 숫자 사이에는 공백으로 구분
	public static void main(String[] args) {
		String s = "1 -2 -3 -4";
		String answer = "";
		
		String[] strArr = {};							// 문자열을 쪼개서 저장할 배열 선언
		strArr = s.split(" ");							// 문자열 공백 기준으로 쪼개기
		
		int[] intArr = new int[strArr.length];			// 문자열 배열의 길이만큼의 int형 배열 선언
		for(int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);	// 숫자 비교를 위해 문자열 배열의 요소들을 int로 자료변환하여 int 배열에 저장
		}
		
		int min = intArr[0];
		int max = intArr[0];
		int[] minMax = new int[2];						// 최댓값과 최솟값이 저장될 배열 선언
		for(int i = 0; i < intArr.length; i++) {		
			if(intArr[i] < min) {						// int배열에서 최솟값 찾기
				min = intArr[i];
			} else if(intArr[i] > max) {				// int배열에서 최댓값 찾기
				max = intArr[i];
			}
		}
		minMax[0] = min;								// 최댓값 최솟값 배열에 순서대로 저장
		minMax[1] = max;
		
		String[] maxMin = new String[minMax.length];	// 최댓값 최솟값을 저장할 문자열 배열 선언
		for(int i = 0; i < minMax.length; i++) {
			maxMin[i] = Integer.toString(minMax[i]);	// 문자열로 합치기 위해 최댓값 최솟값 int 배열을 String으로 자료변환하여  String 배열에 저장
		}
		
		answer = String.join(" ", maxMin);				// join을 활용하여 공백을 두고 answer에 저장
		System.out.println("answer : " + answer);
	}

}
