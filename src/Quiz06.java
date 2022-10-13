import java.util.Arrays;

public class Quiz06 {
	// 음양더하기
	// absolutes : 정수들의 절댓값의 배열
	// signs : 정수들의 부호를 차례로 담은 배열 / true +, false -
	// answer : 정수들의 합
	public static void main(String[] args) {
		int[] absolutes = {1, 2, 3};
		boolean[] signs = {false, false, true};
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == false) {
				absolutes[i] = -(absolutes[i]);
			}
		}
		System.out.println(Arrays.toString(absolutes));
		
		for(int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i];
		}
		
		System.out.println("answer : " + answer);
	}

}
