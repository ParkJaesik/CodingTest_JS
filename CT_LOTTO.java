package ctTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CT_LOTTO {
	
	public static void main(String[] args) {
		
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		int[] answer = solution( lottos,win_nums);
		
		System.out.println( Arrays.toString(answer));
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        
		//rank 표 
		Map<Integer,Integer> rank = new HashMap<Integer, Integer>();
        
        rank.put(6, 1);
        rank.put(5, 2);
        rank.put(4, 3);
        rank.put(3, 4);
        rank.put(2, 5);
        rank.put(1, 6);
        rank.put(0, 6);
		
        int dmgNum = 0;  //훼손숫자 갯수-> 맞을 가능성
        int rowNum = 0;  //무조건 맞는 숫자 갯수
        int highNum = 0;  //훼손숫자 + 무조건 맞는 숫자
        
        for ( int i =0;  i < lottos.length; i ++){
        	
        	if( lottos[i] == 0){
        		
        		dmgNum ++;
        		
        	}
        	for ( int j=0; j < win_nums.length; j++){
        		
        		if ( lottos[i] == win_nums[j]){
        			rowNum ++;
        		}
        	}
        }
        
        highNum = dmgNum + rowNum;
        
        
        int[] answer = {rank.get(highNum) , rank.get(rowNum)};
        
        return answer;
    }
}
