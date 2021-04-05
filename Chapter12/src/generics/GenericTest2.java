package generics;

public class GenericTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrint = new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		powderPrint.Printing();

	}

}
