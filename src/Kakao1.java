import java.util.HashMap;
import java.util.Map;

public class Kakao1 {

	// 성격유형 검사지
	// 총 n개의 질문, 선택지 7개(매우 비동의 1, 비동의 2, 약간 비동의 3, 모르겠음 4, 약간 동의 5, 동의 6, 매우 동의 7)
	// 각 지표 4가지(RT, CF, JM, AN)
	// survey : 주어지는 지표의 배열, choices : 선택지를 선택하는 숫자들의 배열)
	// 매우 비동의(1) 지표 뒷 글자 3점, 비동의(2) 지표 뒷 글자 2점, 약간 비동의(3) 지표 뒷 글자 1점, 모르겠음(4) 0점
	// 매우 동의 (7) 지표 앞 글자 3점, 동의(6) 지표 앞 글자 2점, 약간 동의(5) 지표 앞 글자 1점
	// 합이 같은 경우 지표 앞 글자를 사용
	
	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		System.out.println(solution(survey, choices));
	}
	
	public static String solution(String[] survey, int[] choices) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < survey.length; i++) {
			if(choices[i] > 0 && choices[i] < 4) {	// choices[i] = 1, 2, 3(매우 비동의, 비동의, 약간 비동의)
				char ch = survey[i].charAt(0);		// survey[i]를 나누었을 때 첫번째 것
				map.put(ch, map.getOrDefault(ch, 0) + 4 - choices[i]);
				// map에 ch를 key로 value를 지정, 여기서 value는 map의 key로 지정된 ch에 매핑되는 value가 없으면 0을 반환 
				// +4 -> 최대로 더해질 수 있는 점수를 더하고, -choices[i] -> choices[i]에 해당하는 숫자를 뺌
				// 결과적으로 Map(지표의 유형 한 가지(앞), 해당하는 지표의 점수(1, 2, 3))
			} else if(choices[i] > 4) {				// choices[i] = 5, 6, 7(약간 동의, 동의, 매우 동의)
				char ch = survey[i].charAt(1);		// survey[i]를 나누었을 때 두번째 것
				map.put(ch, map.getOrDefault(ch, 0) + choices[i] - 4);
				// +choices[i] -> 최대 7까지니까 4보다 큰 경우 choices[i]를 먼저 더해줌
				// -4 -> Map(지표의 유형 한 가지(뒤), 해당하는 지표의 점수(1, 2, 3))
			}
		}
		String answer = new StringBuilder()
				.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
				// map의 key가 'R'인 것의 value가 있으면 그 값을, 없으면 0을 반환한다
				// map의 key가 'R'인 것과, 'T'인 것의 value를 비교하여 더 큰 쪽의 key를 반환한다
				// 단, 두 값이 같을 경우 앞의 알파벳을 우선한다
				.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
				.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
				.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
				.toString();
		return answer;
	}
}
