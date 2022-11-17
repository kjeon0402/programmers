
public class Quiz47 {
	// 종이 자르기
	// 종이의 세로 길이와 가로 길이가 주어질 때, 1 x 1의 크기로 종이를 자르려면 몇 번의 가위질을 해야하는가
	// ex. 세로 : 2, 가로 : 2 -> 가로로 한 번, 나누어진 두 종이를 세로로 두 번 -> 총 세 번의 가위질 필요
	public static void main(String[] args) {
		int n = 1;
		int m = 1;
		int answer = 0;
		
		int cnt = n;
		while(cnt != 1) {
			cnt--;
			answer++;
		}
		answer += (m - 1) * n;
		System.out.println("answer : " + answer);
	}

}
