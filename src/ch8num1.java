import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ch8num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\kyudo\\OneDrive\\바탕 화면");
		if(f.exists()) {
			System.out.println(f.length());
		}
		else {
			System.out.println("a파일이 없습니다.");
		}
	}

}
