import java.util.Arrays;

public class Quiz34 {
	// 최대값 구하기
	// int 배열에서 두 수의 곱이 가장 큰 경우의 곱을 구하라
	// ex. int[] num = {1, 2, 3, 4, 5} -> int answer = 4 * 5 = 20
	public static void main(String[] args) {
		int[] num = {0, 31, 24, 10, 1, 9};
		int answer = 0;
		
		Arrays.sort(num);				// 정렬해서
		answer = num[num.length - 1] * num[num.length - 2];	// 가장 맨 뒷숫자와 그 앞의 숫자를 곱함
		System.out.println("answer : " + answer);
		
//		int max1 = 0, max2 = 0;
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] > max1) {
//				max1 = num[i];
//			}
//		}
//		
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] != max1) {
//				list.add(num[i]);
//			}
//		}
//		
//		int[] arr = new int[list.size()];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = list.get(i);
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > max2) {
//				max2 = arr[i];
//			}
//		}
//		
//		System.out.println("max1 : " + max1 + ", max2 : " + max2);
//		answer = max1 * max2;
	}

}
