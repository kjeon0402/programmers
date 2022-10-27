import java.util.Arrays;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Quiz29 {
	// OX퀴즈
	// 수식이 담긴 배열의 결과가 맞으면 O, 틀리면 X를 넣은 배열을 반환
	// ex. {"4 + 3 = 7", "5 - 7 = 2"} => answer = {"O", "X"}
	public static void main(String[] args) throws NumberFormatException, ScriptException {
		String[] quiz = {"4 + 3 = 7", "5 - 7 = 2"};						// 문자열 수식을 계산해야하는 문제
		String[] answer = new String[quiz.length];
		
		ScriptEngineManager manager = new ScriptEngineManager();		// 자바스크립트의 함수를 불러온다
		ScriptEngine engine = manager.getEngineByName("JavaScript");	// 자바스크립트 함수 중 배열 수식을 계산할 수 있는 함수가 있음
		
		String[][] arr = new String[quiz.length][2];					// 배열의 요소를 쪼개므로 2중배열이 됨
		for(int i = 0; i < arr.length; i++) {
			arr[i] = quiz[i].split(" = ");								// '='을 기준으로 배열의 요소를 쪼갠다
			if((int) engine.eval(arr[i][0]) == Integer.parseInt(arr[i][1])) {	// 문자열 수식의 결과가 '=' 이후의 문자와 같으면
				answer[i] = "O";
			} else {
				answer[i] = "X";
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
