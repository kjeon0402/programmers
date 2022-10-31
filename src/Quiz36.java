import java.util.ArrayList;
import java.util.List;

public class Quiz36 {
	// 2 ~ n까지의 수 중 소수 찾기
	// ex int n = 10 -> 2, 3, 5, 7 -> answer = 4
	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		List<Integer> list = new ArrayList<Integer>();		// 2~n까지 들어갈 리스트 선언
		for(int i = 2; i <= n; i++) {
			list.add(i);									// 2~n까지 리스트에 저장
		}
		int[] arr = new int[list.size()];
		for(int i = 0; i < arr.length; i++) {				// 배열로 list 복사
			arr[i] = list.get(i);
		}
		for(int i = 0; i < arr.length; i++) {
			if(prime(arr[i]) == 2) {						// 배열의 요소마다 약수의 개수가 2개이면
				answer++;									// answer에 1을 더할 것
			}
		}
		System.out.println("answer : " + answer);
	}
	
	public static int prime(int n) {						// 약수의 갯수를 구하는 함수
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		return count;
	}

}
