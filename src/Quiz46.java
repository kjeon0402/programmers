import java.util.Arrays;

public class Quiz46 {
	// 이진변환 반복하기
	// 문자열 s가 주어졌을 때, 0을 제거하고 0을 제거한 후의 길이를 이진변환하는 방법을 반복한다. 1이 될 때까지
	// 1이 되었을 때, 반복을 진행한 횟수와 마지막까지 제거된 0의 갯수를 구하여 반환
	// ex. String s = "110010101001" -> 111111(0 여섯개 제거) -> length : 6, 6을 이진변환 -> 110
	//     -> 11(0 1개 제거) -> length : 2, 2를 이진변환 -> 10
	//     -> 1(0 1개 제거) -> length : 1, 1을 이진변환 -> 1 (종료)
	//     answer : 반복횟수 3, 제거된 총 0의 갯수 6 + 1 + 1 = 8 [3, 8]
	public static void main(String[] args) {
		String s = "1111111";
		int[] answer = new int[2];
		
		while(!s.equals("1")) {							// s가 문자열 "1"이 아닌동안 반복해라
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '0') {				// s의 하나가 0일 때마다
					answer[1]++;						// answer[1](0의 갯수)++ 해라
				}
			}
			s = s.replace("0", "");						// s에서 0을 공백으로 바꾸고
			s = Integer.toBinaryString(s.length());		// s의 길이를 이진변환하여 다시 s에 저장
			answer[0]++;								// answer[0](반복횟수)++ 해라
		}
		
		System.out.println("answer : " + Arrays.toString(answer));
	}

}
