import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt"); //p1 =인스턴스 
		//하나의 클래스를 new를 사용해서 인스턴스를 만들어서 
		//계속 사용할 수 있게 만듬 
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		
	}

}
