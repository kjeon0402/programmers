
public class Hashard {
	// 하샤드 수 : 각 자릿수의 합으로 나누어 떨어지는 수
	// ex) 18 => 1 + 8 = 9, 18 % 9 = 0 / 18은 하샤드 수
	public static void main(String[] args) {
		int sum = 0;
		int first = 25;
		int second = first;
		while(first != 0) {
			sum += first % 10;
			first /= 10;
		}
		System.out.println("second : " + second);
		System.out.println("sum : " + sum);
		System.out.println(second % sum);
		
		boolean answer = second % sum == 0 ? true : false;
		
		System.out.println("answer : " + answer);
	}
}
