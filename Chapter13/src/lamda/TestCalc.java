package lamda;

public class TestCalc {

	public static void main(String[] args) {
		
		Calc Num = (s,v) -> s + v;
		System.out.println(Num.add(10,20));
		
	}

}
