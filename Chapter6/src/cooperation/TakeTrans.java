package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentHY = new Student("HY", 50000);
		Student studentMJ = new Student("MJ", 10000);
		
		Bus bus23 = new Bus(23);
		Subway subwayBlue = new Subway("4È£¼±");
		
		
		studentHY.takeBus(bus23);
		studentHY.takeSubway(subwayBlue);
		studentHY.showInfo();
		bus23.showInfo();
		
		

		studentMJ.takeSubway(subwayBlue);
		studentMJ.showInfo();
		subwayBlue.showInfo();
			
	}	
	
}
