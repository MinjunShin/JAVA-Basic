package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getFactory();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNo());
		System.out.println(yourSonata.getCarNo());

	}

}
