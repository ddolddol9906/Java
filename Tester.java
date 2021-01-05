package Tester;

import java.util.Random;
import java.util.Scanner;


public class Tester {
	static Scanner stdIn = new Scanner(System.in);
	static Random rand = new Random();
	static int winpoint = 0;
	static int rn;
	static int want;
	static int alltry = 0;
	static int BlackGamePoint = 0;
	static int BlackGamePoint2 = 0;
	
	//////////////////////////////////////////숫자게임.
	private static void chancehint(int chance) { 
		alltry++;
		System.out.print(alltry + "번째 힌트.");
	}
	
	private static void hintPage(int hint) { 
		if(hint == 1) { 
			if(rn >= want) { 
				System.out.println("더 큰값입니다.");
			}
			else { 
				System.out.println("더 작은값입니다.");
			}
		}
		else { 
		}
	}
	private static void NumberGame() { 
		{int retry;
		do { 
		System.out.println("숫자를 눌려보세요!(0~99).");
		
		rn = rand.nextInt(100);
		System.out.print("얼마나 해보겠습니까? "); int trynum = stdIn.nextInt();
		for(int i = 0; i < trynum; i++) { 
			System.out.print("예상 숫자는 ?"); want = stdIn.nextInt();
			if(rn == want) { 
				System.out.println("정답입니다.");
				winpoint++;
				break;
			}
			else { 
				System.out.println("틀렸습니다.");
				if(i < trynum-1) {System.out.println("힌트를 보시겠습니까? y- 1, n - 0");
				int hint = stdIn.nextInt();
				if(hint == 1) {chancehint(hint); }
				hintPage(hint); }
				continue;
			}
		}System.out.println("답은 " + rn +"입니다.");
		System.out.println("다시해보겠습니까? 예 - 1, 아니요 - 2");
		retry = stdIn.nextInt();
			} while(retry == 1); { 
				System.out.println("종료합니다.");
					} 
				}
	}
	//////////////////////////////////////////숫자로 마추게임.
	
	static void PlayBlackCard() { 
	for(int i = 0; i < 5; i++) { 
		int Player1 = rand.nextInt(10);
		System.out.println(Player1);
		System.out.println("킵=1 or 패스");
		int KeepOrPass = stdIn.nextInt();
		if(KeepOrPass == 1) { 
			BlackGamePoint += Player1;
			}
		else {
			continue;
		}
		int Player2 = rand.nextInt(10);
		System.out.println(Player2);
		System.out.println("킵=1 or 패스");
		int KeepOrPass2 = stdIn.nextInt();
		if(KeepOrPass2 == 1) { 
			BlackGamePoint2 += Player2;
			}
		else {
			continue;
		}
		
		}
	int magicNumber = rand.nextInt(20);
	System.out.println("매직넘버는 바로!! : " + magicNumber);
	if(Math.abs(BlackGamePoint - magicNumber) < Math.abs(BlackGamePoint2 - magicNumber)) { 
		System.out.println("플레이어 1 이 이겼습니다!");
	}
	else if(Math.abs(BlackGamePoint - magicNumber) > Math.abs(BlackGamePoint2 - magicNumber)){ 
		System.out.println("플레이어 2 가 이겼습니다!");
	}
	else if(Math.abs(BlackGamePoint - magicNumber) == Math.abs(BlackGamePoint2 - magicNumber)) { 
		System.out.println("비겼습니다.");
	}
	System.out.println("플레이어 1 : " + BlackGamePoint);
	System.out.println("플레이어 2 : " + BlackGamePoint2);
	System.out.println("게임센터로 돌아갑니다.");
	}
	
	static void ExplainGame() { 
		System.out.println("5개의 무작위 숫자가 보여집니다."
				+ "\n킵을 할수도 있고 패스를 할수도 있습니다\n"
				+ "마지막 선택된 숫자와 차이가 적은 사람이 이깁니다.");
		System.out.print("이해 됐으면 1키를 누르세요.");
		int GoBlackCardMenu = stdIn.nextInt();
		if(GoBlackCardMenu == 1) { 
			BlackCard();
		}
	}
	
	static void BlackCard() { 
		System.out.println("블랙카드 게임을 합니다. 시작하려면 1번, 설명을 볼려면 2번.");
		int startorexplain = stdIn.nextInt();
		if(startorexplain == 1) { 
			PlayBlackCard();
		}
		else {
			ExplainGame();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("게임센터에 오신걸 환영합니다.");
		int swi;
		int showPit;
		do {
			System.out.println(" 메인 화면 ");
			System.out.println("1번 숫자게임.");
			System.out.println("2번 숫자에 근접하기.");
			System.out.println("3번 토탈 점수.");
			System.out.println("99번 종료합니다.");
			 swi = stdIn.nextInt();
		switch(swi) {
		case 1 : NumberGame(); break;
		//점수를 게임 끝나고 다시 케이스문에 오게끔 만들어보기.
		case 2 : BlackCard(); break;
		case 3 : System.out.println("당신의 점수는 : " + winpoint + "입니다."); break;
		case 99 : System.exit(0);
				} 
		System.out.println("메인화면은 1번입니다.");
		showPit = stdIn.nextInt();
			} while(showPit == 1);
		}
	}