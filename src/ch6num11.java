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
			System.out.print("���: ");
			String tmp = sc.nextLine();
			if(tmp.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				return;
			}
			String [] tokens = tmp.split("!");
			if(tokens.length!=2) {
				System.out.println("�߸��� ����Դϴ�! ");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() ==0 ) {
					System.out.println("�߸��� ����Դϴ�!");
					continue;  
				}
			}
			int index = sb.indexOf(tokens[0]);
			if(index==-1) {
				System.out.println("ã�� �� �����ϴ�! ");
				continue;
			}
			sb.replace(index, tokens[0].length(), tokens[1]);
			System.out.println(sb.toString());
		}
	
	}


}
	