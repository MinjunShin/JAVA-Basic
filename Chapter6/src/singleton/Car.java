package singleton;

public class Car {
	
	private static int serialNo = 10000;
	int carNo;
	
	public Car() {
		serialNo++;
		carNo = serialNo;		
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
 		
}
