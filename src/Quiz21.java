import java.util.ArrayList;
import java.util.List;

public class Quiz21 {
	// 7의 개수를 반환
	// ex. arr = [7, 77, 17] => answer = 4
	public static void main(String[] args) {
		int[] arr = {7, 77, 17};							// 숫자를 전부 쪼개야한다 -> String 배열로 변환이 필요하다
		String[] strArr = new String[arr.length];			// String 배열로 변환하여 저장할 String 배열 선언(길이는 주어진 int 배열과 동일)
		
		for(int i = 0; i < arr.length; i++) {
			strArr[i] = String.valueOf(arr[i]);				// 기존에 주어진 배열을 String 배열로 변환
		}
		
		List<String> list = new ArrayList<String>();		// 쪼개진 숫자들과 기존에 있는 숫자들을 전부 넣을 list 선언
		
		for(int i = 0; i < strArr.length; i++) {			// String 배열의 길이 만큼
			for(int j = 0; j < strArr[i].length(); j++) {	// String 배열 하나의 요소의 길이만큼
				if(strArr[i].length() >= 2) {				// String 배열 하나의 요소의 길이가 2보다 크거나 같으면(숫자가 두자릿수 이상이면)
					list.add(strArr[i].split("")[j]);		// 쪼개서 list에 저장
				} else {
					list.add(strArr[i]);					// 그 외의 경우(숫자가 한자릿수이면) 그대로 list에 저장
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("7")) {					// list에서 "7"이 있으면
				answer++;									// answer에 1을 더하라
			}
		}
		System.out.println("answer : " + answer);
	}

}
