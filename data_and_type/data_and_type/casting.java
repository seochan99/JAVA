package data_and_type;

public class casting {

	public static void main(String[] args) {
		double b = 1; //정수 이지만 double로 컴퍼팅 됨
		System.out.println(b); // 1.0
		
		int d = (int) 1.1; // 손실이 일어남 
		String f = Integer.toString(1); //숫자->문자열로 변환 
		System.out.println(f.getClass()); //getClass : 어떤 데이터타입인지 알려줌 
		
		

	}

}
