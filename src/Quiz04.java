import java.util.Arrays;

public class Quiz04 {
	// x씩 증가하는 숫자를 n개 지니는 배열
	// ex) x = 2, n = 5, answer = [2, 4, 6, 8, 10];
	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		long[] answer = new long[n];
		
		long num = 0;
		
		for(int i = 0; i < n; i++) {
			num += x;
			answer[i] = num;
		}
		
		System.out.println(num);
		System.out.println(Arrays.toString(answer));
	}

}
