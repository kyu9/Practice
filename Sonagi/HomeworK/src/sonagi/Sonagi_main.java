package sonagi;



public class Sonagi_main {
	public static void main(String[] args) { // Main ������ 

		Sonagi_main main = new Sonagi_main(); 
		Sonagi_Nick gui = new Sonagi_Nick();  //�г��� ���� ȭ�� ���� 
		
		gui.setSonagi_main(main); // Main ��ġ ��� ;

	}
	
	// �г��� Ŭ���� , �г��� ������ showGameView �޼ҵ� ���� 
	public void showGameView(Sonagi_Nick gui ,String nick){
		
		
		gui.dispose();//�г��� ȭ�� ���ֱ�
		Sonagi_GameView game = new Sonagi_GameView(nick);// �г��� ������ ����ȭ�� ���� 
		
	}

}
