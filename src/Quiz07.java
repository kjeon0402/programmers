import java.util.Arrays;

public class Quiz07 {
	// 수박수박수박수
	// n만큼 글자 출력
	// ex. int n = 3 => 수박수 / int n = 7 => 수박수박수박수
	public static void main(String[] args) {
		int n = 5;
		String answer = "";
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = "수";
			} else {
				arr[i] = "박";
			}
		}
		System.out.println(Arrays.toString(arr));
		
		answer = String.join("", arr);
		System.out.println("answer : " + answer);
	}

}
