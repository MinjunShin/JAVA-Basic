package Exercise;

public class question4 {
	
	private String name;
	private String type;
	
	public question4 (String name, String type) {
		this.name = name;
		this.type = type;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String ShowInfo() {
		return name + "," + type;
	}

}
