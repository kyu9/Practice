import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ch8num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("C:\\Users\\kyudo\\OneDrive\\문서\\자바용도\\a.jpg");
			fout = new FileOutputStream("C:\\Users\\kyudo\\OneDrive\\문서\\자바용도\\b.pmg");
			int c;
			int total = fin.available();
			int count=0;
			while((c=fin.read())!=-1) {
				if(count==total/10) {
					System.out.print("*");
					count=0;
				}
				fout.write(c);
				count++;
			}
		}
		catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
