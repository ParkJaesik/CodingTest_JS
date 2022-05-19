package ctTest;

import java.util.Arrays;

public class CT_Marathon {
	
	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String answer = solution( participant,completion);
		
		System.out.println(answer);
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        int lastIndex = 0;
        
        for( int i=0; i<completion.length; i++){
        	lastIndex=i;
        	if(!completion[i].equals( participant[i])){
        		answer = participant[i];
        		break;
        			
        	}
        	
        }
        if( "".equals(answer)){
        	answer = participant[lastIndex+1];
        }
        
        
        
        return answer;
    }
}
