package ctTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CT_AlphabetNum {
	
	public static void main(String[] args) {
		
//		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String s = "one4seveneight";
	    //String new_id = "abcdefghijklmn.p";
		//String new_id = "=.=";
		
		System.out.println( solution(s));
		
	}
	
	public static int solution(String s){
		
		
		int answer = 0;
		
		s=s.replace("zero", "0");
		s=s.replace("one", "1");
		s=s.replace("two", "2");
		s=s.replace("three", "3");
		s=s.replace("four", "4");
		s=s.replace("five", "5");
		s=s.replace("six", "6");
		s=s.replace("seven", "7");
		s=s.replace("eight", "8");
		s=s.replace("nine", "9");
		
		answer = Integer.parseInt( s);
		
		return answer;
	}

/*	public static  int solution2(String s) {
	    int answer = 0;
	    
	    Stack<Character> answer_stack = new Stack<>();
	    Map<String, Character>  convertMap = new HashMap<String, Character>();
	    convertMap.put("zero",'0');
	    convertMap.put("one",'1');
	    convertMap.put("two",'2');
	    convertMap.put("tree",'3');
	    convertMap.put("four",'4');
	    convertMap.put("five",'5');
	    convertMap.put("six",'6');
	    convertMap.put("seven",'7');
	    convertMap.put("eight",'8');
	    convertMap.put("nine",'9');
	    
	    char[] strArr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		boolean isOver = false;
		
		for(int i = 0; i<strArr.length; i++){
			
			stack.add(strArr[i]);
		}
		
		//while( isOver){
		convertAlpabet( stack,answer_stack,convertMap);
			
		//}
		
		System.out.println(answer_stack.toString());
		
	    return answer;
	}*/
	
	/*public static void convertAlpabet(Stack<Character> stack,Stack<Character> answer_stack,Map<String, Character>  convertMap){
		Stack<Character> new_stack = new Stack<>();
		for( int i =0 ; i<stack.size(); i++){
			
			if( Character.isAlphabetic(stack.get(i))){
				new_stack.add( stack.get(i));
			}else{
				
				char[] alpabetArr = new char[new_stack.size()];
				
				for( int j=0; j<new_stack.size(); j++){
					alpabetArr[j] = new_stack.get(j);
				}
				
				String alpabet = new String(alpabetArr);
				char num = convertMap.get(alpabet);
				answer_stack.push(num);
				answer_stack.push(stack.get(i));
				new_stack.clear();
				
			}
		
		}
	}*/
}
