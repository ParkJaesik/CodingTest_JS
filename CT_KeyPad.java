package ctTest;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.Keymap;

public class CT_KeyPad {
	
	public static void main(String[] args) {
		
//		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String hand = "right";
	    //String new_id = "abcdefghijklmn.p";
		//String new_id = "=.=";
		
		int[] numbers = {8,8,0,0,0,8,8,8};
		
		System.out.println( solution(numbers,hand));
		
	}
	
	
	public static String solution(int[] numbers, String hand) {
		
		Map<String, int[]> keyMap = new HashMap<String, int[]>();
		StringBuilder sb = new StringBuilder();
		
		
		keyMap.put("1", new int[] {1,1});
		keyMap.put("2", new int[] {1,2});
		keyMap.put("3", new int[] {1,3});
		keyMap.put("4", new int[] {2,1});
		keyMap.put("5", new int[] {2,2});
		keyMap.put("6", new int[] {2,3});
		keyMap.put("7", new int[] {3,1});
		keyMap.put("8", new int[] {3,2});
		keyMap.put("9", new int[] {3,3});
		keyMap.put("*", new int[] {4,1});
		keyMap.put("0", new int[] {4,2});
		keyMap.put("#", new int[] {4,3});
		
		int[] rightHand = keyMap.get("*");
		int[] leftHand = keyMap.get("*");
		int[] currentKey = null;
		int rp = 0;
		int lp = 0;
		for( int i =0; i<numbers.length; i ++){
			
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
				sb.append("L");
				leftHand = keyMap.get(numbers[i]+"");
			}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
				sb.append("R");
				rightHand= keyMap.get(numbers[i]+"");
				
			}else{
				
				currentKey = keyMap.get(numbers[i]+"");
				
				rp =  (int) Math.pow((currentKey[0] - rightHand[0]),2)+ (int) Math.pow((currentKey[1] - rightHand[1]),2); 
				lp =  (int) Math.pow((currentKey[0] - leftHand[0]),2)+ (int) Math.pow((currentKey[1] - leftHand[1]),2); 
				
				if( rp > lp){
					sb.append("L");
					leftHand = keyMap.get(numbers[i]+"");
				}else if( rp < lp){
					sb.append("R");
					rightHand= keyMap.get(numbers[i]+"");
				}else if ( rp == lp){
					
					if( "right".equals(hand)){
						sb.append("R");
						rightHand= keyMap.get(numbers[i]+"");
					}else{
						
						sb.append("L");
						leftHand = keyMap.get(numbers[i]+"");
					}
				}
			}
		}
		
        String answer = sb.toString();
        return answer;
    }
}
