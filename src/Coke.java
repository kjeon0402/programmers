
public class Coke {
	// 콜라 문제
	// 콜라 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는가?
	// ex. 콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트, 빈 병 20개인 경우
	// 빈 병 20병 -> 콜라 10병 -> 빈 병 10병 -> 콜라 5병 -> 빈 병 4병(1병 남음) -> 콜라 2병 -> 빈 병 2병 -> 콜라 1병 -> 빈 병 1병 + 남은 1병 -> 콜라 1병
	// 10 + 5 + 2 + 1 + 1 = 19
	// 보유 중인 빈 병이 n병 미만이면 추가적으로 빈 병을 받을 수 없음
	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		int n = 20;
		
		int sum = 0;			// 최종적으로 받은 콜라의 합
		
		while(n >= a) {			// 남은 빈 병이 새 콜라를 받는 최소 갯수 일때까지 진행
			int dis = n % a;	// 빈 병을 콜라로 바꾸고 남은 나머지 빈 병을 따로 저장
			n = n / a * b;		// 먹고 남은 빈 병은 새 콜라로 바꾼 병의 갯수에 빈 병의 갯수 당 주기로 한 새콜라 병의 곱
			sum += n;			// 합계에 빈 병을 더함
			n += dis;			// 나머지 빈 병을 더해서 다시 계산
		}
		
		System.out.println("sum : " + sum);
	}

}