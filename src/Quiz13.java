import java.util.Arrays;

public class Quiz13 {
	// 최대공약수 최소공배수
	public static void main(String[] args) {
		int n = 2;
		int m = 5;
		int[] answer = new int[2];
		
		int max = 0;
		for(int i = 1; i <= n && i <= m; i++) {
			if(n % i == 0 && m % i == 0) {
				max = i;
			}
		}
		System.out.println("최대공약수 : " + max);
		
		int min = (n * m) / max;
		System.out.println("최소공배수 : " + min);
		
		answer[0] = max;
		answer[1] = min;
		
		System.out.println(Arrays.toString(answer));
	}

}
