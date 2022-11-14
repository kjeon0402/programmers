import java.util.Arrays;

public class Quiz43 {
	// 외계어 사전
	// 주어진 spell 배열의 글자들로 단어로 이루어진 배열에 있는 단어를 만들 수 있는가
	// 만들 수 있으면 1 반환, 불가능하면 2 반환
	// ex. spell = {"p", "o", "s"}, dic = {"sod", "eocd", "qixm", "adio", "soo"} => answer = 2
	public static void main(String[] args) {
		String[] spell = {"z", "d", "x"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		int answer = 0;
		
		// 모든 글자들이 같다면 정렬해서 하나의 단어로 만들어 같은지 비교하면 된다
		Arrays.sort(spell);						// 정렬해서
		String s = String.join("", spell);		// 하나의 단어로 합침
		
		for(int i = 0; i < dic.length; i++) {
			String[] arr = dic[i].split("");	// dic의 요소를 쪼개어
			Arrays.sort(arr);					// 정렬해서
			String str = String.join("", arr);	// 하나의 단어로 합침
			if(s.equals(str)) {					// 두 단어가 같으면
				answer = 1;						// answer에 1을 저장하고
				break;							// 반복문을 빠져나옴
			} else {							// 같은 단어가 없으면
				answer = 2;						// answer에 2를 저장
			}
		}
		System.out.println("answer : " + answer);
	}

}
