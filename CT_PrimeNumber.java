package ctTest;

import java.util.ArrayList;
import java.util.Arrays;

public class CT_PrimeNumber {
	
	public static void main(String[] args) {

		int[] nums = {1,2,7,6,4};
		
		int answer = solution( nums);
		
		System.out.println( answer);
	}
	
	public static int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        
        for( int i=0; i<nums.length; i++){
        	if(i + 2 >= nums.length) break;
        	for( int j=i+1; j<nums.length; j++){
        		for( int k=j+1; k<nums.length; k++){
        			
        			sumList.add( nums[i]+nums[j]+nums[k]);
        		}
        	}
        	
        }
        answer = sumList.size();
        
        for( Integer sum : sumList){
        	
        	int i = 2;
        	
        	while( i < sum){
        		
        		if( sum % i  == 0){
        			answer --; 
        			break;
        		}
        		i++;
        	}
        }
        return answer;
    }
}
