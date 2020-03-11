import java.util.Scanner;
class Game{
	private String arr[] = {};
	private int total=0;
	private int count=0;
	private String tmp, ex="아버지", cur="";
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇 명입니까??>>");
		total=sc.nextInt();
		arr = new String[10];
		for(int i=0;i<total;i++) {
			System.out.println("참가자의 이름을 입력하세요>>");
			tmp = sc.next();
			arr[i]=tmp;
		}
		System.out.println("시작단어는 아버지 입니다 ");
		while(true) {
			
			System.out.println(arr[count]+">>");
			count++;
			if(count==total) {
				count=0;
			}
			cur=sc.next();
			int lastIndex = ex.length()-1;
			char lastWord = ex.charAt(lastIndex);
			char firstWord = cur.charAt(0);
			ex=cur;
			if(lastWord!=firstWord) {
				System.out.println("패배자는 "+arr[count-1]+"입니다!");	
				break;
			}
		}
	}
}

public class OpCh4{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game pl = new Game();
		pl.run();
	}

}
