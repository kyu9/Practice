import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ch8num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bout = new BufferedOutputStream(System.out,5);
		//���۸� ������ ��Ʈ�� �����
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\Users\\kyudo\\OneDrive\\����\\�ڹٿ뵵\\dream.txt");
			int c;
			while((c=fin.read())!=-1){
				bout.write((char)(c-32));
			}
			fin.close();
			bout.close();
		}catch(IOException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

}
