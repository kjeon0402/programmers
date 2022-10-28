
public class Quiz33 {
	// 옹알이
	// 조카의 옹알이는 "aya", "ye", "woo", "ma"만 할 수 있음
	// 할 수 있는 4가지의 발음으로 조합해서 옹알이 가능
	// 연속해서 같은 말을 하지는 못함
	// 옹알이의 String 배열이 주어졌을 때, 발음할 수 있는 단어의 수는?
	// ex. String[] a = {"aya", "yee", "u", "maa", "wyeoo"} -> int answer = 1
	public static void main(String[] args) {
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo", "mamaaya", "woowoow"};
		int answer = 0;
		
		String[] cor = {"aya", "ye", "woo", "ma"};					// 들어가야할 문자열의 배열
		String[] inCor = {"ayaaya", "yeye", "woowoo", "mama"};		// 들어갈 수 없는 문자열의 배열
		
		for(int i = 0; i < babbling.length; i++) {
			for(int j = 0; j < inCor.length; j++) {					// 들어갈 수 없는 문자열의 배열 요소가 babbling[i]에서 발견되면
				babbling[i] = babbling[i].replace(inCor[j], "X");	// 그 요소는 "X"로 바꾼다
			}
			for(int j = 0; j < cor.length; j++) {					// 들어가야할 문자열의 배열 요소가 babbling[i]에서 발견되면
				babbling[i] = babbling[i].replace(cor[j], " ");		// 그 요소는 공백으로 바꾼다
			}
			if(babbling[i].trim().length() == 0) {					// 빈 문자열을 제거(trim)한 babbling[i]의 길이가 0이면
				answer++;											// answer += 1 해준다
			}
		}
		System.out.println("answer : " + answer);
	}

}
