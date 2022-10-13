
public class Kakao2 {
	// 두 배열의 이진수를 or연산하여
	// 1은 #으로 0은 공백으로 변환하여 배열에 넣기
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		String[] answer = new String[n];
		int[] orCal = new int[n];
		
		for(int i = 0; i < n; i++) {
			orCal[i] = arr1[i] | arr2[i];	// 두 배열의 각 요소들을 or연산하여 orCal 배열에 배치
		}
		
		for(int i = 0; i < orCal.length; i++) {
			String binary = Integer.toBinaryString(orCal[i]);	// or연산한 orCal의 요소들을 이진수로 변환 
			if(binary.length() < n) {							// 변환한 이진수의 자릿수가 n보다 작을 경우
				int diff = n - binary.length();
				for(int j = 0; j < diff; j++) {
					binary = "0" + binary;						// 모자란만큼 0을 앞에 붙임
				}
			}
			binary = binary.replace("1", "#");					// 만들어진 이진수(String)의 1은 #으로
			binary = binary.replace("0", " ");					// 0은 공백으로
			answer[i] = binary;									// answer 배열에 최종 결과 배치
		}
		System.out.println("answer = {" + answer[0] + ", " + answer[1] + ", " + answer[2] + ", " + answer[3] + ", " + answer[4] + "}");
	}
}
