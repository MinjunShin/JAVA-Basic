package lamda;

interface PrintString {
	void showString(String str);
}

public class Testlamda {

	public static void main(String[] args) {
		PrintString lamdaStr = s-> System.out.println(s);
		lamdaStr.showString("hello lamda_1");
		showMyString(lamdaStr);

	}
	
	public static void showMyString(PrintString p) {
		p.showString("hellow lamda_2");
	}

}
