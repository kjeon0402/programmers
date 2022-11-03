import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kakao7 {
	// 튜플
	// 튜플의 집합이 문자열로 주어졌을 때 튜플을 배열로 반환
	// 튜플의 집합은 튜플의 순서대로 추가되면서 만들어짐
	// ex. 튜플 = [2, 1, 3, 4] -> 튜플의 집합 : {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
	// 튜플의 집합은 순서가 바뀌어도 튜플은 같음
	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		int[] answer = {};
		
		List<Integer> list = new ArrayList<Integer>();
		s = s.substring(2, s.length());
		s = s.substring(0, s.length() - 2).replace("},{", "-");
		String[] str = s.split("-");
		
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for(int i = 0; i < str.length; i++) {
			String string = str[i];
			String[] temp = string.split(",");
			for(int j = 0; j < temp.length; j++) {
				int n = Integer.parseInt(temp[j]);
				if(!list.contains(n)) {
					list.add(n);
				}
			}
		}
		
		answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println("answer : " + Arrays.toString(answer));
		
//		// 런타임 에러 발생한 풀이
//		// 튜플의 집합에서 가장 갯수가 많은 숫자가 튜플에 가장 먼저 들어간 숫자라는 점을 이용
//		String str1 = s.substring(2, s.length());
//		str1 = str1.substring(0, str1.length() - 2).replace("},{", "-");
//		// str1에는 튜플의 집합의 요소끼리 나눔
//		String[] strArr1 = str1.split("-");
//		
//		String str2 = s.substring(2, s.length());
//		str2 = str2.substring(0, str2.length() - 2).replace("},{", ",");
//		// str2에서는 튜플의 집합 각 요소들을 전부 다 나눔 
//		String[] strArr2 = str2.split(",");
//		
//		// 튜플의 요소들의 갯수를 비교해 갯수가 가장 많은 숫자부터 넣을 리스트
//		List<Integer> list = new ArrayList<Integer>();
//		// 튜플의 집합의 갯수 선언 (튜플의 집합의 갯수 = 튜플의 요소 중 가장 먼저 들어온 숫자가 언급되는 횟수)
//		int n = strArr1.length;
//		while(n != 0) {
//			for(int i = 0; i < strArr2.length; i++) {
//				if(Collections.frequency(Arrays.asList(strArr2), strArr2[i]) == n) {	// 횟수가 튜플의 집합의 갯수만큼 들어가면
//					list.add(Integer.parseInt(strArr2[i]));								// 리스트에 추가하고
//					n--;																// n은 -1을 해줌(그 다음 많이 들어가는 숫자 찾기)
//				}
//			}
//		}
//		System.out.println("list : " + list.toString());
//		
//		answer = new int[list.size()];
//		for(int i = 0; i < answer.length; i++) {
//			answer[i] = list.get(i);
//		}
//		
//		System.out.println("answer : " + Arrays.toString(answer));
	}

}
