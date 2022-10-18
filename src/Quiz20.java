
public class Quiz20 {
	// 개미 군단
	// 장군 5, 병정 3, 일 1
	// hp에 맞게 병력 출동시키는데, 가장 적은 수를 데리고 나가고자 함
	// ex. int hp = 23 => 장군 4마리 병정 1마리 / int answer = 5
	public static void main(String[] args) {
		int hp = 23;
		
		int answer = 0;
		
		answer += hp / 5;						// answer에 hp를 가장 큰 수치인 5로 나눈 몫을 더해줌
		hp = hp - (hp / 5) * 5;					// 남은 hp 계산
		
		answer += hp / 3;						// answer에 hp를 두번째 큰 수치인 3으로 나눈 몫을 더해줌
		hp = hp - (hp / 3) * 3;					// 남은 hp 계산
		
		if(hp == 2 || hp == 1) {				// 남은 hp가 2나 1인 경우
			answer += hp;						// answer에 합산
		}
		
		System.out.println("answer : " + answer);
	}

}
