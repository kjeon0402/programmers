
public class Quiz09 {
	// 없는 숫자 더하기
	// 0 <= 배열[i] <= 9, 주어진 배열에서 없는 수를 찾아 더하여 반환하기
	// ex) int[] arr = [1, 2, 3, 4, 6, 7, 8, 0] => answer = 5 + 9 = 14
	public static void main(String[] args) {
		int[] numbers = {5, 8, 9, 2, 6, 3, 0};
		int answer = 0;
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		System.out.println("answer : " + answer);
		
		for(int i = 0; i < numbers.length; i++) {
			answer -= numbers[i];
		}
		
		System.out.println("answer : " + answer);
		
		// 0~9까지 전부 다 더하고, 주어진 배열의 요소들도 모두 더해 서로 빼는 방법을 선택
	}

}
