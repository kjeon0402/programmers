
public class Kakao3 {

	// 실패율 구하기
	// 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
	// N : 전체 스테이지 갯수 (1 <= N <= 500)
	// stages : 게임을 이용하는 사용자가 멈춰있는 스테이지의 번호 (1 <= stages[i] <= N + 1, 1 <= stages.length <= 200,000)
	// answer : 실패율이 높은 순서대로 스테이지 번호 배열
	// 스테이지에 도달한 유저가 없으면 실패율은 0
	public static void main(String[] args) {
		int n = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		int[] answer = new int[n];
		
		int user = stages.length;	// 참여한 사람의 숫자
		double[] failure = new double[n + 1];	// 스테이지별 실패율의 배열, n + 1인 이유는 배열의 첫번째는 0번째이기 때문
		
		for(int i = 1; i <= n; i++) {
			int challenger = 0;		// i번째 스테이지 도전자 수
			
			for(int j = 0; j < stages.length; j++) {
				if(stages[j] == i) {
					challenger++;
				}
			}
			
			// 실패율
			failure[i] = (double) challenger / user;
			if(Double.isNaN(failure[i])) {	// 유저가 0일 때 나눌 수 없는 경우
				failure[i] = 0;
			}
			user -= challenger;
		}
		
		for(int i = 0; i < n; i++) {
            double max = -1.0;	//실패율이 0일 수도 있기 때문
            for(int j = 1; j <= n; j++) {
                if(failure[j] > max) {
                    max = failure[j];
                    answer[i] = j;
                }
            }
            failure[answer[i]] = -100.0;
        }
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println("answer[i] : " + answer[i]);
		}
	}

}
