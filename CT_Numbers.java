package ctTest;

import java.util.ArrayList;
import java.util.Arrays;

public class CT_Numbers {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] answer = solution( numbers);
		System.out.println( Arrays.toString(answer));
	}
	
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        
        Arrays.sort( numbers);
        System.out.println( Arrays.toString(numbers));
        ArrayList<Integer> List = new ArrayList<Integer>();
        for( int i = 0; i < numbers.length; i++){
        	
        	for( int j=i+1; j<numbers.length; j++){
        		int sum = numbers[i]+numbers[j];
        		if( !List.contains( sum)){
        			List.add(sum);
        		}
        	}
        }
        System.out.println( List.toString());
        answer = new int[List.size()];
        for( int i = 0; i < List.size(); i++){
        	answer[i] = List.get(i);
        }
        Arrays.sort( answer);
        return answer;
    }
}
