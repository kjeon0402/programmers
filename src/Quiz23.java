
public class Quiz23 {
	// 중복된 문자 제거
	// ex. String str = "People" -> String answer = "Peol"
	public static void main(String[] args) {
		String str = "We are the world";
		String answer = "";
		
		String[] arr = str.split("");					// 문자열 쪼개서 배열로 저장
		
		for(int i = 0; i < arr.length; i++) {			// i는 배열의 길이만큼
			for(int j = 0; j < i; j++) {				// j는 i만큼(비교할 대상의 왼쪽 요소(앞의 요소)들과 비교)
				if(arr[i].equals(arr[j])) {				// 비교할 대상(arr[i])과 같은 것이 앞의 요소들(arr[j]) 중 있으면
					arr[i] = "";						// 비교할 대상(arr[i])은 공백으로
				}
			}
		}
		
		answer = String.join("", arr);
		System.out.println("answer : " + answer);
	}

}
