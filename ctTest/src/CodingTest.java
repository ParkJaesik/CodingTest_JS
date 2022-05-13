import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class CodingTest {
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		int[] answer = solution(id_list,report,k);
		System.out.println( Arrays.toString( answer));
	}
	
	public static void solution2() {
        
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		//report 배열 중복제거 
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
		String[] reportArray = hashSet.toArray(new String[0]);
		//System.out.println(reportArray.toString());
		System.out.println(Arrays.toString(reportArray));
		
		//각 유저별 신고당한 횟수
		Map<String, Integer> userReport = new HashMap<String, Integer>();
		//유저별 메일 발송 횟수
		Map<String, Integer> userMailCount = new HashMap<String, Integer>();
		ArrayList<String> userList = new ArrayList<String>();
		ArrayList<String> reportUserList = new ArrayList<String>();
		
		for( String userId : id_list){
			
			userList.add(userId);
			userReport.put(userId, 0);
			userMailCount.put(userId, 0);
		}
		
		String[] splitCnt = null;
		
		//신고 받은 횟수 검사
		for( String reportCnt : reportArray){
			
			splitCnt = reportCnt.split("\\s+");
			
			if( userList.contains( splitCnt[1])){
				int count = userReport.get(splitCnt[1]) + 1;
				userReport.put( splitCnt[1], count);
			}
		}
		//정지 당한 유저 
		for( String userId : id_list){
			
			if(k <= userReport.get(userId)){
				reportUserList.add( userId);
			}
		}
		/*System.out.println( "------- 신고 당한횟수 ---------");
		userReport.forEach((key, value) -> {
			System.out.println(key + " : " + value);
			});*/
		
		//메일 발송 횟수 검사
		for( String reportCnt : reportArray){
			
			splitCnt = reportCnt.split("\\s+");
			
			if( reportUserList.contains( splitCnt[1])){
				int count = userMailCount.get(splitCnt[0]) + 1;
				userMailCount.put( splitCnt[0], count);
			}
		}
		
		/*System.out.println( "-----결과 -------");
		userMailCount.forEach((key, value) -> {
			System.out.println(key + " : " + value);
			});*/

        
    }
	

	    public static int[] solution(String[] id_list, String[] report, int k) {
	        
	        
	      //report 배열 중복제거 
			HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
			String[] reportArray = hashSet.toArray(new String[0]);
			//System.out.println(reportArray.toString());
			System.out.println(Arrays.toString(reportArray));
			
			//각 유저별 신고당한 횟수
			Map<String, Integer> userReport = new HashMap<String, Integer>();
			//유저별 메일 발송 횟수
			Map<String, Integer> userMailCount = new HashMap<String, Integer>();
			ArrayList<String> userList = new ArrayList<String>();
			ArrayList<String> reportUserList = new ArrayList<String>();
			
			for( String userId : id_list){
				
				userList.add(userId);
				userReport.put(userId, 0);
				userMailCount.put(userId, 0);
			}
			
			String[] splitCnt = null;
			
			//신고 받은 횟수 검사
			for( String reportCnt : reportArray){
				
				splitCnt = reportCnt.split("\\s+");
				
				if( userList.contains( splitCnt[1])){
					int count = userReport.get(splitCnt[1]) + 1;
					userReport.put( splitCnt[1], count);
				}
			}
			//정지 당한 유저 
			for( String userId : id_list){
				
				if(k <= userReport.get(userId)){
					reportUserList.add( userId);
				}
			}
			/*System.out.println( "------- 신고 당한횟수 ---------");
			userReport.forEach((key, value) -> {
				System.out.println(key + " : " + value);
				});*/
			
			//메일 발송 횟수 검사
			for( String reportCnt : reportArray){
				
				splitCnt = reportCnt.split("\\s+");
				
				if( reportUserList.contains( splitCnt[1])){
					int count = userMailCount.get(splitCnt[0]) + 1;
					userMailCount.put( splitCnt[0], count);
				}
			}
	        
			int[] answer = new int[ id_list.length];
			
			for( int i =0; i<id_list.length; i++){
				
				answer[i] = userMailCount.get( id_list[i]);
			}
			
			
	        return answer;
	    }
	
}
