
public class Quiz19 {
	// 숫자 찾기
	// 정수 num에서 인수 n이 있으면 그 자릿수를 반환
	// ex) int num = 29138 / int k = 1 / answer = 3
	public static void main(String[] args) {
		int num = 29138;
		int k = 7;
		int answer = 0;
		
		String number = String.valueOf(num);		// split으로 배열로 쪼개기 위해 int to String
		String find = String.valueOf(k);			// 같은 자료형으로 비교하기 위해 int to String
		
		String[] arr = number.split("");			// 변환된 String을 배열로 쪼개기
		for(int i = 0; i < arr.length; i++) {		
			if(arr[i].equals(find)) {				// 배열의 요소를 하나하나 비교하면서 찾는 인수와 같은 것이 있으면
				answer = i + 1;						// 그 자리의 인덱스 + 1한 값을 answer에 저장하고
				break;								// 함수를 빠져나옴
			} else if(!arr[i].equals(find)) {		// 인수와 같은 요소가 없으면
				answer = -1;						// answer에 -1을 저장
			}
		}
		System.out.println("answer : " + answer);
	}

}
