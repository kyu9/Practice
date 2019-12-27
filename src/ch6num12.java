import java.util.Scanner;

class Person{
	private int a, b, c;
	public String name;
	public Person(String name) {
		this.name=name;
	}
	public boolean game() {
		a = (int)((Math.random()*3)+1);
		b = (int)((Math.random()*3)+1);
		c = (int)((Math.random()*3)+1);
		System.out.print("\t"+a+" "+b+" "+c+" ");
		if(a==b && b==c) 
			return true;
		else
			return false;
	}
}
public class ch6num12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>> ");
		int count = sc.nextInt();
		
		Person [] persons = new Person[count];
		for(int i=0;i<persons.length;i++) {
			System.out.print((i+1)+"번째 선수 이름>> ");
			String tmp = sc.next();
			Person person = new Person(tmp);
			persons[i]=person;
		}
		while(true) {
			System.out.println("["+persons[0].name+"] :");
			if(persons[0].game()==true) {
				System.out.print(persons[0].name+"님이 이겼습니다!");
				return;
			}
			System.out.println("아쉽군요!");
			
			System.out.println("["+persons[1].name+"] :");
			if(persons[1].game()==true) {
				System.out.print(persons[1].name+"님이 이겼습니다!");
				return;
			}
			System.out.println("아쉽군요!");
			
			System.out.println("["+persons[2].name+"] :");
			if(persons[2].game()==true) {
				System.out.print(persons[2].name+"님이 이겼습니다!");
				return;
			}
			System.out.println("아쉽군요!");
		}
	}

}
