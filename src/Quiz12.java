import java.util.Arrays;

public class Quiz12 {
	// 행렬의 합
	public static void main(String[] args) {
//		int[][] arr1 = {{1, 2}, {2, 3}};
//		int[][] arr2 = {{3, 4}, {5, 6}};
		int[][] arr1 = {{1}, {2}};
		int[][] arr2 = {{3}, {4}};
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("answer : " + Arrays.toString(answer[0]) + ", " + Arrays.toString(answer[1]));
	}

}
