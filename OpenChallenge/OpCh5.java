import java.util.ArrayList;
import java.util.Scanner;


	 class product{
		int id;
		String explain;
		String producer;
		int price;
		void setId(int id) {
			this.id=id;
		}
		int getId() {
			return id;
		}
		void input() {
			Scanner sc = new Scanner(System.in);
			System.out.print("상품 설명>>");
			explain=sc.nextLine();
			System.out.print("생산자>>");
			producer=sc.nextLine();
			System.out.print("가격>>");
			price=sc.nextInt();
		}
		void print() {
			System.out.println("상품 ID : "+id);
			System.out.println("상품설명 : "+explain);
			System.out.println("생산자 : "+producer);
			System.out.println("가격 : "+price);
			
		}
	}
	
	 class Book extends product{
		int ISBN;
		String writer;
		String boTitle;
		@Override
		void input() {
			super.input();
			Scanner sc = new Scanner(System.in);
			System.out.print("책 제목 :");
			boTitle=sc.nextLine();
			System.out.print("책 저자 :");
			writer = sc.nextLine();
			System.out.print("IBSN");
			ISBN=sc.nextInt();
		}
		@Override
		void print() {
			super.print();
			System.out.println("책 제목 : "+boTitle);
			System.out.println("책 저자 : "+writer);
			System.out.println("ISBN : "+ISBN);
		}
	}
	
class CompactDisc extends product{
		String alTitle;
		String singer;
		@Override
		void input() {
			super.input();
			Scanner sc = new Scanner(System.in);
			System.out.print("앨범 제목 :");
			alTitle = sc.nextLine();
			System.out.print("가수 :");
			singer = sc.nextLine();
		}
		@Override
		void print() {
			super.print();
			System.out.println("앨범 제목 : "+alTitle);
			System.out.println("가수 : "+singer);
		}
	}
	
	 class ConversationBook extends Book{
		String lang;
		@Override
		void input() {
			super.input();
			Scanner sc = new Scanner(System.in);
			System.out.print("언어 :");
			lang = sc.nextLine();
		}
		@Override
		void print() {
			super.print();
			System.out.println("언어 :"+lang);
		}
	}
public class OpCh5 {
	
	static ArrayList<product> productList = new ArrayList<product>();
	
	static void productAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 종류: 책(1), 음악CD(2), 회화책(3)>>");
		product p = null;
		int num = sc.nextInt();
		switch(num) {
		case 1:
			p = new Book();
			break;
		case 2:
			p = new CompactDisc();
			break;
		case 3:
			p = new ConversationBook();
			break;
		}
		
		p.input();
		p.setId(productList.size());
		productList.add(p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) >>");
			num = sc.nextInt();
			if(num==1) {
				productAdd();
			}
			else if(num==2) {
				for(int i=0;i<productList.size();i++) {
					productList.get(i).print();
					System.out.println();
				}
			}
			else if(num==3) {
				break;
			}
		}
	}

}

//상속에서 자식함수가 부모함수의 클래스를 사용하기 위해선 super.함수명 을 사용하는거!! 까먹지 말자!
