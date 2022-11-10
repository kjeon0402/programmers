import java.util.HashMap;
import java.util.Map;

public class Hash01 {
	// 완주하지 못한 선수 - 해시
	// 마라톤에 참가한 선수의 이름이 담긴 배열과 완주자의 배열이 있음
	// 참가한 선수 배열에는 있지만 완주자 배열에 없는 이름은 완주하지 못한 선수임
	// 선수 이름은 중복될 수 있음
	// answer에 완주하지 못한 선수의 이름을 반환할 것
	public static void main(String[] args) {
		String[] participant = {"1", "2", "3"};
		String[] completion = {"2", "3"};
		String answer = "";
		
		// 해시, 맵을 이용한 풀이
		// 참석자 배열로 맵에 이름을 key값으로 넣어주고 value에는 숫자를 넣는다
		// 완주자 배열에 이름이 있으면 종전에 저장해둔 map에서 이름을 찾아 해당 이름의 value를 -1 해준다
		// 마지막에 value가 1인 key(이름)는 미완주자
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < participant.length; i++) {
			String par = participant[i];
			map.put(par, map.getOrDefault(par, 0) + 1);	// 참석자 배열의 요소를 map에 저장하는 과정
			// map.getOrDefault(A, B) : 맵의 키가 A인 것이 있으면 A의 value를, 없으면 B을 반환
			// 동명이인의 경우, value의 카운트를 더 해주기 위해 활용
		}
		
		for(int i = 0; i < completion.length; i++) {
			String com = completion[i];
			map.put(com, map.get(com) - 1);				// 완주자 배열에 이름이 있으면 해당 key의 value - 1
		}
		
		String[] keys = map.keySet().toArray(new String[map.size()]);
		// map.keySet() : map의 key들을 모두 출력
		// for문에서 활용하기 위해 배열로 바꿔 저장
		for(int i = 0; i < keys.length; i++) {
			if(map.get(keys[i]) != 0) {					// map의 value가 0이 아닌 key를 발견하면
				answer = keys[i];						// answer로 반환
				break;
			}
		}
		System.out.println("answer : " + answer);
		
//		// 루프를 이용한 풀이
//		// 두 배열을 비교하여 참석자 배열에서 완주자 배열에서 없는 요소를 골라서 반환하면 됨
//		// 두 배열을 정렬해 순서대로 비교하는 방법
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		for(int i = 0; i < completion.length; i++) {
//			if(!participant[i].equals(completion[i])) {	// 참가자 완주자 비교해서 같지 않은 요소가 있다면
//				answer = participant[i];				// answer에 저장, 반복문 종료
//				break;
//			}
//			// 만약 참가자와 완주자가 마지막 반복일 때까지 같다면 (break에 걸리지 않는다면)
//			// 참가자의 마지막에 있는 사람이 미완주자
//			answer = participant[participant.length - 1];
//		}
//		System.out.println("answer : " + answer);
	}

}
