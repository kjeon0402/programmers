//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;

public class Hash02 {
	// 폰켓몬 - 해시
	// 연구실에 있는 폰켓몬 n마리 중 n/2마리를 데리고 갈 수 있음
	// 최대한 다양한 종류의 폰켓몬을 데리고 가려고 함
	// 가장 많은 종류의 폰켓몬을 고른다고 가정했을 때, 폰켓몬 종류의 수는?
	// ex. 폰켓몬 = [3, 1, 2, 3] -> answer = 2, 최대 2종류의 폰켓몬 선택 가능
	public static void main(String[] args) {
		int[] nums = {2, 2, 4, 4, 5, 7, 3};
		int answer = 0;
		
		// 최대 가져갈 수 있는 폰켓몬 수를 계산
		// 중복을 제거한 폰켓몬 수 계산
		// 둘 중 작은 수가 answer
		// HashSet에 값을 저장하면 중복이 제거되는 것을 활용한 풀이
		int max = nums.length / 2;						// 최대 n/2마리를 데리고 갈 수 있으므로 최댓값은 nums.length / 2
		HashSet<Integer> set = new HashSet<Integer>();	// HashSet 선언
		
		// HashSet에 nums의 요소들을 저장하면 중복을 제거하고 저장됨(중복이 제거되는 것이 HashSet의 가장 큰 특징 중 하나)
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		if(set.size() > max) {		// HashSet의 크기가  max보다 크면
			answer = max;			// answer = max (max의 숫자보다 더 클수는 없기 때문)
		} else {					// HashSet의 크기가 max보다 작으면
			answer = set.size();	// answer = HashSet.size() (폰켓몬 종류의 제한)
		}
		
		System.out.println("answer : " + answer);
		
		// list를 이용한 풀이
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i = 0; i < nums.length; i++) {
//			if(!list.contains(nums[i])) {
//				list.add(nums[i]);
//			}
//		}
//		answer = list.size() > nums.length / 2 ? nums.length / 2 : list.size();
//		System.out.println("answer : " + answer);
	}

}
