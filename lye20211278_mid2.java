package mine;
import java.util.*;

public class lye20211278_mid2 {
	public static void main(String[] args) {
		System.out.println("----------------------------\n 셋이서 가위바위보게임을 시작합니다.\n----------------------------");
		System.out.println("'가위', '바위', '보' 중 선택하여 하나만 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		int puter1 = comrandom1();
		int puter2 = comrandom2();
		int puter11 = comrandom11();
		int puter22 = comrandom22();
		
		String com1 = "";
		String com2 = "";
		String com11 = "";
		String com22 = "";
		
		//컴퓨터1, 컴퓨터2 쪼개서 만들기
		if(puter1 == 1) {
	      	com1 = "가위";
	      }else if(puter1 == 2){
	      	com1 = "바위";
	      }else {
	       com1 = "보";
	      }
		if(puter2 == 1) {
	      	com2 = "가위";
	      }else if(puter2 == 2){
	      	com2 = "바위";
	      }else {
	       com2 = "보";
	      }
		if(puter11 == 1) {
	      	com11 = "가위";
	      }else if(puter2 == 2){
	      	com11 = "바위";
	      }else {
	       com11 = "보";
	      }
	     if(puter22 == 1) {
		     com22 = "가위";
		   }else if(puter22 == 2){
		     com22 = "바위";
		   }else {
		    com22 = "보";
		    }
		
		System.out.println("유저: "+user);
		System.out.println("컴퓨터1: "+com1);
		System.out.println("컴퓨터2: "+com2);
		 
		
		
		
		if(user.equals("가위") && com1.equals("가위")) {
			if(com2.equals("가위")) {
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}else if(com2.equals("바위")) {
				System.out.println("컴퓨터2의 압도적인 승리!");
			}else {
				System.out.println("유저와 컴퓨터1이 이겼습니다! 결승전을 시작합니다.\n값을 입력해주세요");
				Scanner sc0 = new Scanner(System.in);
				String user0 = sc.next();
				System.out.println("유저: "+user0);
				System.out.println("컴퓨터1: "+com11);
				if(user0.equals("가위")) {
					if(com11.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com11.equals("바위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}else {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}
				}else if(user0.equals("바위")) {
					if(com11.equals("가위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}
				}else if(user0.equals("보")){                            
					if(com11.equals("가위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
				
			}
			
			
			
			
			
			
		}else if(user.equals("바위") &&com1.equals("바위")) {
			if(com2.equals("가위")) {
				System.out.println("유저와 컴퓨터1이 이겼습니다! 결승전을 시작합니다.\n값을 입력해주세요");
				Scanner sc0 = new Scanner(System.in);
				String user0 = sc.next();
				System.out.println("유저: "+user0);
				System.out.println("컴퓨터1: "+com11);
				if(user0.equals("가위")) {
					if(com11.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com11.equals("바위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}else {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}
				}else if(user0.equals("바위")) {
					if(com11.equals("가위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}
				}else if(user0.equals("보")){                            
					if(com11.equals("가위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
			}else if(com2.equals("바위")) {
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}else {
				System.out.println("컴퓨터2의 압도적인 승리!");
			}
		}else if(user.equals("보") && com1.equals("보")) {
			if(com2.equals("가위")) {
				System.out.println("컴퓨터2의 압도적인 승리!");
			}else if(com2.equals("바위")) {
				System.out.println("유저와 컴퓨터1이 이겼습니다! 결승전을 시작합니다.\n값을 입력해주세요");
				Scanner sc0 = new Scanner(System.in);
				String user0 = sc.next();
				System.out.println("유저: "+user0);
				System.out.println("컴퓨터1: "+com11);
				if(user0.equals("가위")) {
					if(com11.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com11.equals("바위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}else {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}
				}else if(user0.equals("바위")) {
					if(com11.equals("가위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}
				}else if(user0.equals("보")){                            
					if(com11.equals("가위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터1 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
			}else {
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}
		}else if(user.equals("가위") && com2.equals("가위")) {
			if(com1.equals("가위")) {
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}else if(com1.equals("바위")) {
				System.out.println("컴퓨터1의 압도적인 승리!");
			}else {
				System.out.println("유저와 컴퓨터2가 이겼습니다! 결승전을 시작합니다.\n값을 입력해주세요");
				Scanner sc0 = new Scanner(System.in);
				String user0 = sc.next();
				System.out.println("유저: "+user0);
				System.out.println("컴퓨터1: "+com22);
				if(user0.equals("가위")) {
					if(com22.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com22.equals("바위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}else {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}
				}else if(user0.equals("바위")) {
					if(com22.equals("가위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else if(com22.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}
				}else if(user0.equals("보")){                            
					if(com22.equals("가위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}else if(com22.equals("바위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
				
			}
		}else if(user.equals("바위") && com2.equals("바위")) {
			if(com1.equals("가위")) {
				System.out.println("유저와 컴퓨터2가 이겼습니다! 결승전을 시작합니다.\n값을 입력해주세요");
				Scanner sc0 = new Scanner(System.in);
				String user0 = sc.next();
				System.out.println("유저: "+user0);
				System.out.println("컴퓨터1: "+com22);
				if(user0.equals("가위")) {
					if(com22.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com22.equals("바위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}else {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}
				}else if(user0.equals("바위")) {
					if(com22.equals("가위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else if(com22.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}
				}else if(user0.equals("보")){                            
					if(com22.equals("가위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}else if(com22.equals("바위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
			}else if(com1.equals("바위")) {
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}else {
				System.out.println("컴퓨터1의 압도적인 승리!");
			}
		}else if(user.equals("보") && com2.equals("보")) {
			if(com1.equals("가위")) {
				System.out.println("컴퓨터1의 압도적인 승리!");
			}else if(com1.equals("바위")) {
				System.out.println("유저와 컴퓨터2가 이겼습니다! 결승전을 시작합니다.\n값을 입력해주세요");
				Scanner sc0 = new Scanner(System.in);
				String user0 = sc.next();
				System.out.println("유저: "+user0);
				System.out.println("컴퓨터1: "+com22);
				if(user0.equals("가위")) {
					if(com22.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com22.equals("바위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}else {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}
				}else if(user0.equals("바위")) {
					if(com22.equals("가위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else if(com22.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}
				}else if(user0.equals("보")){                            
					if(com22.equals("가위")) {
						System.out.println("졌습니다! 최종 승자는 컴퓨터2 입니다!");
					}else if(com22.equals("바위")) {
						System.out.println("이겼습니다! 최증 승자는 당신입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
			}else {
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}
		}else if(com1.equals("가위") && com2.equals("가위")) {
			if(user.equals("가위")) {
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}else if(user.equals("바위")) {
				System.out.println("유저의 압도적인 승리!");
			}else {
				System.out.println("컴퓨터1과 컴퓨터2가 이겼습니다! 결승전을 시작합니다.\'결승시작'을 입력해주세요");
				 Scanner sc0 = new Scanner(System.in);
			        String user0 = sc0.nextLine();
			        if (!user0.equals("결승시작")) {
			            System.out.println("치명적 오류! 게임을 종료합니다.");
			            return;
			        }
				System.out.println("컴퓨터1: "+com11);
				System.out.println("컴퓨터2: "+com22);
		
				if(com22.equals("가위")) {
					if(com11.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com11.equals("바위")) {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}else {
						System.out.println("최증 승자는 컴퓨터2 입니다!");
					}
				}else if(com22.equals("바위")) {
					if(com11.equals("가위")) {
						System.out.println("최증 승자는 컴퓨터2 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}
				}else if(com22.equals("보")){                            
					if(com11.equals("가위")) {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("최증 승자는 컴퓨터2 입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
				
			}
		}else if(com1.equals("바위") && com2.equals("바위")){
			if(user.equals("가위")) {
				System.out.println("컴퓨터1과 컴퓨터2가 이겼습니다! 결승전을 시작합니다.\'결승시작'을 입력해주세요");
				Scanner sc0 = new Scanner(System.in);
		        String user0 = sc0.nextLine();
		        if (!user0.equals("결승시작")) {
		            System.out.println("치명적 오류! 게임을 종료합니다.");
		            return;
		        }
				System.out.println("컴퓨터1: "+com11);
				System.out.println("컴퓨터2: "+com22);
				if(com22.equals("가위")) {
					if(com11.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com11.equals("바위")) {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}else {
						System.out.println("최증 승자는 컴퓨터 2입니다!");
					}
				}else if(com22.equals("바위")) {
					if(com11.equals("가위")) {
						System.out.println("최증 승자는 컴퓨터2 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}
				}else if(com22.equals("보")){                            
					if(com11.equals("가위")) {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("최증 승자는 컴퓨터2 입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
			}else if(com2.equals("바위")) {
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}else {
				System.out.println("유저의 압도적인 승리!");
			}
		}else if(com1.equals("보") && com2.equals("보")) {
			if (user.equals("가위")) {
				System.out.println("유저의 압도적인 승리!");
			}else if(user.equals("바위")) {
				System.out.println("컴퓨터1과 컴퓨터2가 이겼습니다! 결승전을 시작합니다.\n'결승시작'을 입력해주세요");
				Scanner sc0 = new Scanner(System.in);
				String user0 = sc0.nextLine();
				if (!user0.equals("결승시작")) {
					System.out.println("치명적 오류! 게임을 종료합니다.");
					return;
			        }
				System.out.println("컴퓨터1: "+com11);
				System.out.println("컴퓨터2: "+com22);
				if(com22.equals("가위")) {
					if(com11.equals("가위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else if(com11.equals("바위")) {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}else {
						System.out.println("최증 승자는 컴퓨터2 입니다!");
					}
				}else if(com22.equals("바위")) {
					if(com11.equals("가위")) {
						System.out.println("최증 승자는 컴퓨터2 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}else {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}
				}else if(com22.equals("보")){                            
					if(com11.equals("가위")) {
						System.out.println("최종 승자는 컴퓨터1 입니다!");
					}else if(com11.equals("바위")) {
						System.out.println("최증 승자는 컴퓨터2 입니다!");
					}else {
						System.out.println("비겼습니다! 최종 승자는 없습니다.");
					}
				}else {
					System.out.println("치명적 오류! 게임을 종료합니다.");
				}
			}else if (user.equals("보")){
				System.out.println("비겼습니다! 게임을 다시 시작해주세요.");
				return;
			}else {
				System.out.println("치명적 오류! 게임을 종료합니다.");
			}
			
		}else if(user.equals("가위") && com1.equals("바위") && com2.equals("보")) {
			System.out.println("게임을 다시 시작해주세요.");
		}else if(user.equals("가위") && com1.equals("보") && com2.equals("바위")) {
			System.out.println("게임을 다시 시작해주세요.");
		}else if(user.equals("바위") && com1.equals("가위") && com2.equals("보")) {
			System.out.println("게임을 다시 시작해주세요.");
		}else if(user.equals("바위") && com1.equals("보") && com2.equals("가위")) {
			System.out.println("게임을 다시 시작해주세요.");
		}else if(user.equals("보") && com1.equals("가위") && com2.equals("바위")) {
			System.out.println("게임을 다시 시작해주세요.");
		}else if(user.equals("보") && com1.equals("바위") && com2.equals("가위")) {
			System.out.println("게임을 다시 시작해주세요.");
		}else {
			System.out.println("치명적 오류! 게임을 종료합니다.");
		}
	}
		
	
	  public static int comrandom1() {
	      	double i = 3 * Math.random();
	      	int temp = (int) i;
	      	return temp+1;
	  }
	  
	  public static int comrandom2() {
	      	double d = 3 * Math.random();
	      	int temp = (int) d;
	      	return temp+1;
	  }
	  
	  public static int comrandom11() {
	      	double a = 3 * Math.random();
	      	int temp = (int) a;
	      	return temp+1;
	  }
	  
	  public static int comrandom22() {
	      	double b = 3 * Math.random();
	      	int temp = (int) b;
	      	return temp+1;
	  }
}
