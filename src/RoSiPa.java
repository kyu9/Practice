import java.util.Scanner;
class Player{
	protected String name = "철수";
	private Scanner sc = new Scanner(System.in);
	protected int num;
	public Player(String name) {
		this.name=name;
	}
	public String getName() {return name;}
	public int turn() {
		System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
		return sc.nextInt();
	}
	
}

class Computer extends Player {
	public Computer(String name){
		super(name);
	}
	public int turn() {
		return (int)(Math.random()*3+1);
	}

}

public class RoSiPa{
	private final String s[] = {"가위", "바위", "보"};
	private Player [] players = new Player[2];
	
	public RoSiPa() {
		players[0]=new Player("철수");
		players[1]=new Computer("컴퓨터");	
	}
	
	public void run() {
		int playernum,computernum;
		
		while(true) {
			playernum=players[0].turn();
			if(playernum==1) {
				computernum=players[1].turn();
				if(computernum==1) {
					System.out.println("비겼습니다.");
				}
				if(computernum==2) {
					System.out.println(players[1].getName()+"가 이겼습니다.");
				}
				if(computernum==3) {
					System.out.println(players[0].getName()+"가 이겼습니다.");
				}
			}
			if(playernum==2) {
				computernum=players[1].turn();
				if(computernum==1) {
					System.out.println(players[0].getName()+"가 이겼습니다.");
				}
				if(computernum==2) {
					System.out.println("비겼습니다");
				}
				if(computernum==3) {
					System.out.println(players[1].getName()+"가 이겼습니다.");
				}
			}
			if(playernum==3) {
				computernum=players[1].turn();
				if(computernum==1) {
					System.out.println(players[0].getName()+"가 이겼습니다.");
				}
				if(computernum==2) {
					System.out.println(players[1].getName()+"가 이겼습니다.");
				}
				if(computernum==3) {
					System.out.println("비겼습니다.");
				}
			}
			if(playernum==4) {
				return;
			}
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoSiPa game = new RoSiPa();
		game.run();
		
	}
}

