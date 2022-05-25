package ctTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CT_K {
	
	public static void main(String[] args) {
		
//		String new_id = "...!@BaT#*..y.abcdefghijklm";
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
	    //String new_id = "abcdefghijklmn.p";
		//String new_id = "=.=";
		
		System.out.println( Arrays.toString(solution( array,commands)));
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> originlist = new ArrayList<Integer>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        for( int i = 0; i<array.length; i++){
        	
        	originlist.add(array[i]);
        }
        
        for( int i = 0; i<commands.length; i++){
        	ArrayList<Integer> newlist = new ArrayList<Integer>();
        	
        	for( int j = commands[i][0]-1; j <= commands[i][1]-1; j++){
        		newlist.add(originlist.get(j));
            }
        	
        	Collections.sort(newlist);
        	
        	answerList.add( newlist.get( commands[i][2]-1));
        }
        
        
        int[] answer = new int[answerList.size()];
        
        for( int i =0; i < answer.length; i++){
        	
        	answer[i] = answerList.get(i);
        }
        
        return answer;
    }

}
