//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class Quiz44 {
	// 3진법 뒤집기
	// 10진수 수를 입력받으면 3진수로 변환해 뒤집어서 10진수로 다시 변환하여 반환
	// ex. n = 45 -> 1200(3) -> 0021(3) -> answer = 7
	public static void main(String[] args) {
		int n = 45;
		int answer = 0;
		
		String s = "";			// 주어진 숫자의 3진수를 뒤집어서 저장
		while(n != 0) {
			s += n % 3;			// 나머지가 문자열 처음부터 순서대로 쌓인다
			n /= 3;				// 45 -> 15...0 -> 5...0 -> 1...2 -> 1	=> s = 0021
		}
		
		answer = Integer.parseInt(s, 3);		
		// parseInt(n, m) -> 문자열 n을 m진수 수라고 인지하고 10진수로 변환하여 int로 반환
		// m이 2가 될 수는 없음(toBinaryString)
		System.out.println("answer : " + answer);
		
		// 다른 풀이
//		String[] nums = s.split("");				// 3진수의 뒤집어진 모양의 문자열을 배열로 쪼갬
//		List<String> list = Arrays.asList(nums);	// 배열을 리스트로 변환
//		Collections.reverse(list);					// 리스트를 역순으로 뒤집음(배열의 인덱스를 제곱에 써먹기 위함)
//		
//		int[] arr = new int[list.size()];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(list.get(i));	// int 배열에 뒤집어진 배열의 요소들을 int로 바꿔 저장하면서
//			answer += arr[i] * Math.pow(3, i);		// answer에 3의 i제곱한 것을 곱한 값을 +
//		}
//		
//		System.out.println("answer : " + answer);
	}

}
