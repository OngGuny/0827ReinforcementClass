
public class FirstJava {
	public static void main(String[] args) {
		double avg = 89.5;
		long value1 = Double.doubleToRawLongBits(avg);
		System.out.println(Long.toBinaryString(value1));
		//89.5를 2진수로 저장한 방법. 
		//64바이트로 저장되어야 하는데 맨앞의 0들은 생략해서 표시됨
		//쟤네를 읽을때 자바 컴파일러가 가지고있는 primative 타입, 정해진 약속에 따라 읽는다.
	}
}
