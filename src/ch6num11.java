import java.util.Scanner;

public class ch6num11 {
	
	public static final int FIND_ME = 10;
	//this is my work!

	public static void main(String[] args) {
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		String main = sc.nextLine();
		StringBuffer sb = new StringBuffer(main);
		while(true) {
			System.out.print("명령: ");
			String tmp = sc.nextLine();
			if(tmp.equals("그만")) {
				System.out.println("종료합니다.");
				return;
			}
			String [] tokens = tmp.split("!");
			if(tokens.length!=2) {
				System.out.println("잘못된 명령입니다! ");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() ==0 ) {
					System.out.println("잘못된 명령입니다!");
					continue;  
				}
			}
			int index = sb.indexOf(tokens[0]);
			if(index==-1) {
				System.out.println("찾을 수 없습니다! ");
				continue;
			}
			sb.replace(index, tokens[0].length(), tokens[1]);
			System.out.println(sb.toString());
		}
	
	}


}
	