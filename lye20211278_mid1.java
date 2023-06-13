package mine;
import java.util.*;

public class lye20211278_mid1 {
	public static void main(String[] args) {
		
		System.out.println("----------------------\n 가위바위보게임을 시작합니다.\n----------------------");
		System.out.println("'가위', '바위', '보' 중 선택하여 하나만 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		int puter = comrandom();
		String com = "";
		
		if(puter == 1) {
	      	com = "가위";
	      }else if(puter == 2){
	      	com = "바위";
	      }else {
	        com = "보";
	      }
		System.out.println("유저: "+user);
		System.out.println("컴퓨터: "+com);
		
		if(user.equals("가위")) {
			if(com.equals("가위")) {
				System.out.println("비겼습니다!");
			}else if(com.equals("바위")) {
				System.out.println("졌습니다!");
			}else {
				System.out.println("이겼습니다!");
			}
		}else if(user.equals("바위")) {
			if(com.equals("가위")) {
				System.out.println("이겼습니다!");
			}else if(com.equals("바위")) {
				System.out.println("비겼습니다!");
			}else {
				System.out.println("졌습니다!");
			}
		}else if(user.equals("보")){                            
			if(com.equals("가위")) {
				System.out.println("졌습니다!");
			}else if(com.equals("바위")) {
				System.out.println("이겼습니다!");
			}else {
				System.out.println("비겼습니다!");
			}
		}else {
			System.out.println("치명적 오류! 다시 입력해주세요.");
		}
	      	
}
	
	  public static int comrandom() {
      	double i = 3 * Math.random(); 
      	int temp = (int) i;
      	return temp+1;
  }
}