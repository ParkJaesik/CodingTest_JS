package ctTest;

import java.util.HashSet;

public class CT_Poketmon {
	
	public static void main(String[] args) {

			int[] nums = {3,1,2,3};
			int answer = solution( nums);
			
			System.out.println( answer);
	}
	
	public static int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        
        
        HashSet<String> hashSet = new HashSet<>();
        
        for(int item : nums){
            hashSet.add(item+"");
        }
        
        
        if(max <= hashSet.size()){
        	
        	answer = max;
        }else{
        	answer = hashSet.size();
        }
        
        return answer;
    }
}
