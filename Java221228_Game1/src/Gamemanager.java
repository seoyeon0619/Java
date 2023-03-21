import java.util.ArrayList;
import java.util.Scanner;

public class Gamemanager {
	// 게임에 대한 정보를 저장할 리스트
	ArrayList<GameDTO> gameList = new ArrayList<GameDTO>(); 
	Scanner k = new Scanner(System.in);
	
	public void gameStart() {
		while (true) {
			GameDTO dto = new GameDTO();
			System.out.print("1.가위 2.바위 3.보 : ");
			dto.setPerson(k.nextInt());
			System.out.println(dto);
			
			if (dto.isWinner()==1) {
				System.out.println("컴퓨터 승");
			} else if (dto.isWinner()==2) {
				System.out.println("사람 승");
			} else if (dto.isWinner()==3) {
				System.out.println("무승부");
			gameList.add(dto);
			System.out.print("계속?");
			String again = k.next();
			
			if (again.equals("N")) {
				break;
			}
				
			}
		}
	}
			
	public void Display() {
		int com=0;
		int per=0;
		int other=0;
		GameDTO dto = new GameDTO();
		for (GameDTO gameDTO : gameList) {
			if (dto.getWinner()==1) {
				com++;
			} else if (dto.getWinner()==2) {
				per++;
			} 
			other++;
			System.out.println(dto);
		}
		
		int total = com+per+other;
		if (per==0) {
			System.out.println("승률은 0입니다");
		} 
		System.out.printf("승률은 %.2f입니다", (double)per/total);
	}
}