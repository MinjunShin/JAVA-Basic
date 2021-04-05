package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;

class Person implements Serializable{

	private static final long serialVersionUID = -1503252402544036183L;

	//버전 관리를 위한 정보

	String name;
	transient String job;
	
	public Person(){}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString(){
		return name + "," + job;
	}
}

public class SerializationTest{
	public static void main(String[] args) throws ClassNotFoundException{
		Person personPark = new Person("HY", "TechPM");
		Person personShin = new Person("MJ", "Sales");
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personPark);
			oos.writeObject(personShin); 
			// personPark과 personShin의 값을 파일에 씀(직렬화)
		} catch(IOException e){
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			// personPark과 personShin의 값을 파일에서 읽어옴(역직렬화)
			System.out.println(p1);
			System.out.println(p2);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}