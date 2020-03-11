import java.util.Scanner;
public class OpCh3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int count=1;
		int users=0;
		int max=99, min=0;
		int mainNum=(int)(Math.random()*100);
		System.out.println("게임을 시작합니다.... 숫자를 맞춰보세요!");
		while(true) {
			System.out.println(min+"-"+max);
			System.out.print(count+">>");
			users = sc.nextInt();
			while(users!=mainNum) {
				if(users>mainNum) {
					count++;
					max=users;
					System.out.println("DOWN!");
					break;
				}
				else if(users<mainNum){
					count++;
					min=users;
					System.out.println("UP!");
					break;
				}
			}
			if(users==mainNum) {
				System.out.println("맞았습니다!");
				break;
			}
		
		}

	}
}
