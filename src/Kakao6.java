import java.util.Stack;

public class Kakao6 {
	// 크레인 인형뽑기 게임
	// n * n의 공간이 있은데 공간을 채우고 있는 인형들이 있음
	// 인형을 뽑아서 다른 바구니에 담는데 같은 모양이 2개 쌓이면 사라짐
	// ex. int[][] board = [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
	//     moves[] = [1,5,3,5,1,2,1,4]
	//  0  0  0  0  0
	//  0  0  1  0  3
	//  0  2  5  0  1
	//  4  2  4  4  2
	//  3  5  1  3  1
	// [1][2][3][4][5]
	// moves대로라면 요소 첫번째가 1이므로 [1]의 맨 위의 요소를 뽑는다(4)
	// 두번째 요소는 5이므로 [5]의 맨 위의 요소를 뽑는다 (3)
	//							        (4)
	// 이렇게 두 개가 쌓이면 사라지는데, 사라진 숫자의 갯수를 반환할 것
	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		int answer = 0;
		
		Stack<Integer> stack = new Stack<Integer>();			// 바구니 역할을 해줄 Stack 선언
		stack.push(0);			// Stack의 맨 윗값과 비교해야하는데 아무 것도 없으면 오류가 발생하므로 0을 넣어줌
		
		for(int i = 0; i < moves.length; i++) {
			int move = moves[i];
			for(int j = 0; j < board.length; j++) {
				if(board[j][move - 1] != 0) {					// move는 1부터 시작하므로 1을 빼준다
					if(stack.peek() == board[j][move - 1]) {	// stack의 맨 윗값(peek)이 해당 요소(이제 stack으로 들어가는 요소)와 일치하면
						stack.pop();							// 스택에서 제거하고
						answer += 2;							// answer에는 2를 더해줌
					} else {
						stack.push(board[j][move - 1]);			// 일치하는 것이 아니라면 그대로 Stack에 추가
					}
					board[j][move - 1] = 0;						// 크레인이 들어간 칸이 0인 경우
					break;										// 빠져나옴
				}
			}
		}
		System.out.println("answer : " + answer);
	}
	
	// 자료형 Stack
	// 밑에서 위로 쌓이는 구조, 가장 마지막에 넣은 자료를 가장 먼저 뺄 수 있음
	// stack.pop : 제거, stack.push : 넣기, stack.peek : 뽑기

}
