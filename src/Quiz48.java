
public class Quiz48 {
	// 숫자의 표현
	// 임의의 숫자가 주어졌을 때 연속된 숫자로 합을 나타내려고 함
	// 연속된 숫자로 나타낼 수 있는 경우의 수의 갯수를 반환하는 함수를 작성할 것
	// ex. n = 15, -> 1 + 2 + 3 + 4 + 5, 4 + 5 + 6, 7 + 8, 15 -> 4개
	public static void main(String[] args) {
		int n = 300;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			int sum = 0;
			for(int j = i; j <= n; j++) {	// i부터(i는 1부터 n까지 돌기 때문에)
				sum += j;					// 연속되는 숫자를 누적해서 합산하는데
											// 1 + 2 + 3... -> 2 + 3 + 4... 의 모양이 됨
				if(sum == n) {				// sum이 n이 되면
					answer++;				// answer++해주고 for문(j)을 빠져나옴
					break;
				} else if(sum > n) {		// sum이 n보다 커지면
					break;					// for문(j)를 그냥 빠져나옴
				}
			}
		}
		
		System.out.println("answer : " + answer);
	}

}
