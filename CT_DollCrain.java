package ctTest;

import java.util.ArrayList;
import java.util.Stack;

public class CT_DollCrain {
	
	public static void main(String[] args) {
		
		int[][] board = {
						{0,0,0,0,0},
						{0,0,1,0,3},
						{0,2,5,0,1},
						{4,2,4,4,2},
						{3,5,1,3,1}
						};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = solution( board,moves);
		
		System.out.println( answer);
	}
	
	public static int solution(int[][] board, int[] moves) {
        
		int answer = 0;
		int currentDoll = 0;
		int beforeDoll = 0;
		Stack<Integer> dollStack = new Stack<Integer>();
		
		for( int i =0; i< moves.length; i++){
			
			for( int j=0; j< board.length; j++){
				
				currentDoll = board[j][moves[i]-1];
				
				if( currentDoll != 0){
					if( !dollStack.isEmpty()){
						beforeDoll = dollStack.peek();
					}
					if( currentDoll == beforeDoll){
						
						dollStack.pop();
						answer += 2;
						board[j][moves[i]-1] = 0;
						break;
					}else{
						dollStack.push(currentDoll);
						board[j][moves[i]-1] = 0;
						break;
					}
				}
			}
		}
		
       /* ArrayList<Stack<Integer>> boardStack = new ArrayList<Stack<Integer>>();
		for( int i = 0; i < board.length; i++ ){
			
			Stack<Integer> stack = new Stack<Integer>();
			for( int j =0; j < board[i].length; j++){
				stack.add(board[i][j]);
				
			}
			boardStack.add( stack);
			
		}
		
		for( int i = 0; i<moves.length; i++){
			
			currentDoll = boardStack.get(moves[i]-1).pop();
			if( !dollStack.isEmpty()){
				beforeDoll = dollStack.peek();
			}
			if( currentDoll == beforeDoll){
				dollStack.pop();
				answer += 2;
			}else{
				dollStack.push(currentDoll);
			}
		}
        */
        
        return answer;
    }
}
