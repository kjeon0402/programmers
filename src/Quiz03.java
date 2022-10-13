import java.util.Arrays;

public class Quiz03 {
	// 정수 내림차순으로 배치하기
	// ex) n = 118372 / answer = 873211
	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;

		String num = Long.toString(n);					// 자릿수를 각각 비교해야 하므로 split으로 쪼개기 위해 Long to String
		String[] strArr = num.split("");				// strArr : 각 자릿수가 저장된 String 배열
		int[] intArr = new int[strArr.length];			// String 배열을 숫자로 비교하여 정렬하기 위해 intArr 선언
		
		for(int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);	// intArr 배열에 strArr 배열의 요소들을 int로 자료변환하여 add
		}
		
		Arrays.sort(intArr);							// 변환된 int 배열을 오름차순으로 정렬
		for(int i = 0; i < intArr.length / 2; i++) {	// 오름차순된 int 배열을 내림차순으로 정렬
			int temp = intArr[i];
			intArr[i] = intArr[intArr.length - i - 1];
			intArr[intArr.length - i - 1] = temp;
		}
		
		for(int i = 0; i < intArr.length; i++) {
			strArr[i] = Integer.toString(intArr[i]);	// String.join으로 배열을 합치기 위해 다시 int 배열을 String 배열로 변환
		}
		
		num = String.join("", strArr);					// 변환된 String 배열을 join으로 하나의 String으로 합침
		answer = Long.parseLong(num);					// 처음에 요구된 자료형과 맞춰주기 위해 String to Long
		
		System.out.println("answer : " + answer);
	}

}
