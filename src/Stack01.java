import java.util.Stack;

public class Stack01 {
	// 올바른 괄호
	// 괄호 '('와 ')'로 이루어진 문자열이 주어짐
	// 완벽한 순서쌍으로 이루어진 문자열이 주어졌을 때 true를 반환
	// ex. '()()' -> true / ')((' -> false
	public static void main(String[] args) {
		String s = ")(())(";
		boolean answer = true;
		
		// 주어진 문자열에서 완전한 괄호가 되면 stack.pop으로 빼내는 방법으로 접근
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {	// 문자열의 길이만큼 반복
			if(s.charAt(i) == '(') {			// 문자열에서'('을 만났을 때
				stack.push('(');				// 스택에도 '('을 넣음
			} else {							// ')'을 만났을 때
				// s[0]이 ')'인 경우
				if(stack.isEmpty()) {			// stack이 비어있는지 확인
					answer = false;				// 비어있다면 ')'이 새로 들어가야하므로 false
				} else {						// 비어 있는 것이 아니라면 '('가 있으므로
					stack.pop();				// 그대로 삭제
				}
			}
		}
		answer = (stack.isEmpty()) ? true : false;	// 루프를 다 돌았을 때 스택이 비어 있으면 true, 그렇지 못하면 false
		System.out.println("answer : " + answer);
	}

}
