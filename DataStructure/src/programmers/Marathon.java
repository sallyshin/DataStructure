package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class Marathon {
	public String solution(String[] participant, String[] completion) {
    	Arrays.sort(participant); // 참가자 정렬
    	Arrays.sort(completion); // 완주자 정렬
         
        HashMap<String, Integer> map = new HashMap<>(); // 중복된 이름이 있을 수 있으므로 Set말고 Map 이용
        for(int i = 0; i < participant.length; i++){ // map에 차례로 참가자 put, 동명이인 발생시 value값은 2 이상이 된다.
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        for(int i = 0; i < completion.length; i++) { //map에 차례로 완주자 put, 이름이 같으면 value값에서 -1을 뺸다.
            map.put(completion[i], map.get(completion[i]) - 1);
        }
        for(String answer : map.keySet()) { // Map의 Key값들을 통해 Value값에 접근한다.
        	if(map.get(answer) != 0) { // 만약 map의 value값이 0이 아니라면 참가자 중 완주하지 못한 사람의 value값이다.
        		return answer; // key값인 이름을 리턴
        	}
        }
        return null;
    }

}
