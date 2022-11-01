
public class Kakao5 {
	// 키패드 누르기
	//	1	2	3
	//	4	5	6
	//	7	8	9
	//	*	0	#
	// 왼손은 *에서, 오른손은 #에서 시작
	// int 배열이 주어졌을 때, 오른손으로 누를지, 왼손으로 누를지 판별하여 L(왼손)과 R(오른손)으로 이루어진 문자열 반환
	// 1, 4, 7은 왼손으로 3, 6, 9는 오른손으로 누르되 2, 5, 8, 0은 이전에 가까운 손이 움직임
	// 단, 거리가 같은 경우 오른손잡이는 오른손, 왼손잡이는 왼손으로 누름
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String answer = "";
		
		String[] arr = new String[numbers.length];
		
		// 거리를 계산하기 위해 *와 #의 초기값 또한 위치에 맞게 초기화 해준다
		int left = 10;
		int right = 12;
		
		for(int i = 0; i < numbers.length; i++) {
			int n = numbers[i];
			
			if(n == 1 || n == 4 || n == 7) {
				left = n;					// 다음 번호를 누를 때 활용할 수 있게 현재 누른 번호를 저장해준다
				arr[i] = "L";
			} 
			if(n == 3 || n == 6 || n == 9) {
				right = n;
				arr[i] = "R";
			} 
			if(n == 2 || n == 5 || n == 8 || n == 0) {
				if(n == 0) {
					n = 11;		// 배열의 요소가 0이면 자릿값 11로 바꿔준다
				}
				// 두 좌표 사이의 거리를 구하는 공식 
				// (절대값(누르는 번호 - 거리를 구하고자 하는 번호) / 3(숫자 키패드 이동거리)) + (절대값(누르는 번호 - 거리를 구하고자 하는 번호) % 3(숫자 키패드 이동거리))
				int leftDis = (Math.abs(n - left) / 3) + (Math.abs(n - left) % 3);
				int rightDis = (Math.abs(n - right) / 3) + (Math.abs(n - right) % 3);
				
				if(leftDis == rightDis) {			// 오른손에서의 거리나 왼손에서의 거리가 같고
					if(hand.equals("right")) {		// 오른손잡이이면
						right = n;
						arr[i] = "R";
					} else {						// 왼손잡이이면
						left = n;
						arr[i] = "L";
					}
				} else if(leftDis > rightDis) {		// 오른손에서의 거리보다 왼손에서의 거리가 더 크다면(오른손이 더 가깝다면)
					right = n;
					arr[i] = "R";
				} else {
					left = n;
					arr[i] = "L";
				}
			}
		}
		answer = String.join("", arr);
		System.out.println("answer : " + answer);
	}

}
