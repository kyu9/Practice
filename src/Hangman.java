import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		BufferedReader in = null;
		char replay ='y';
		int result;
		Scanner sc = new Scanner(System.in);
		
		try {
			while(replay=='y') {
				in = new BufferedReader(new FileReader("C:\\Users\\kyudo\\OneDrive\\문서\\자바용도\\words.txt"));
				random = (int)(Math.random()*25143);
				for(int i=0;i<random-1;i++) {
					in.readLine();
				}
				String str = in.readLine();
				System.out.println("지금부터 행맨 게임을 시작합니다.");
				result = startGame(str);
				System.out.println(str);
				if(result==0) {
					System.out.println("5번 실패 하였습니다.");
				}
				System.out.print("Next(y/n?");
				replay=sc.next().charAt(0);
			}
		}catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}
	static int startGame(String str) {
		int fail=0;
		int success=0;
		int level=2;
		char word[] = str.toCharArray();
		char hidden[] = str.toCharArray();
		int tmp[] = new int[level];
		Scanner sc = new Scanner(System.in);
		char ch;
		for(int i=0;i<level;i++) {
			tmp[i]=(int)(Math.random()*str.length());
			for(int j=0;j<i;j++) {
				if(tmp[j]==tmp[i]) {
					tmp[i]=(int)(Math.random()*str.length());
					j=-1;
				}
			}
			hidden[tmp[i]]='-';
		}
		int i;
		while(fail!=5) {
			System.out.println(hidden);
			System.out.print(">>");
			ch=sc.next().charAt(0);
			for(i=0;i<tmp.length;i++) {
				if(word[tmp[i]]==ch) {
					hidden[tmp[i]]=ch;
					success++;
				}
			}
			if(i==tmp.length) {
				fail++;
			}
			if(success==level) {
				break;
			}
		}
		
		if(fail==5) {
			return 0;
		}
		else {
			return 1;
		}
	}

}
