import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz16 {
	// 문자열에서 정수만 뽑아서 int 배열에 오름차순으로 넣기
	public static void main(String[] args) {
		String my_string = "abcde0";
		
		String[] strArr = my_string.split("");
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals("0") || strArr[i].equals("1") || strArr[i].equals("2") || strArr[i].equals("3") || strArr[i].equals("4") || 
					strArr[i].equals("5") || strArr[i].equals("6") || strArr[i].equals("7") || strArr[i].equals("8") || strArr[i].equals("9")) {
				list.add(strArr[i]);
			}
		}
		
		String[] intArr = new String[list.size()];
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = list.get(i);
		}
		System.out.println(Arrays.toString(intArr));
		
		int[] answer = new int[intArr.length];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(intArr[i]);
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}

}
