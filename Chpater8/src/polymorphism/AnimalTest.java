package polymorphism;

import java.util.ArrayList;

class super_Animal {
	public void move() {
		System.out.println("동물이 움직인다.");
	}

}

class Human extends super_Animal{
	public void move() {
		System.out.println("사람이 두발로 걷는다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽는다");
	}

}

class Tiger extends super_Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷는다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}


}

class Eagle extends super_Animal{
	public void move() {
		System.out.println("독수리가 하늘을 난다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날아간다.");
	}

}


public class AnimalTest {

	ArrayList<super_Animal> aniList = new ArrayList<super_Animal>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();

	}
	
	public void addAnimal() { // ArrayList에 추가하면서 Animal로 형변환
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for (super_Animal ani : aniList) { //배열요소를 Animal형으로 꺼내서 move()를 호출 시 재정의된 함수가 호출
			ani.move();
		}
	
	}
	
	public void testCasting() {
		for(int i = 0; i<aniList.size(); i++) { //모든 배열 요소를 하나씩 돌면서
			super_Animal ani = aniList.get(i); // Animal 형으로 가져옴
			if(ani instanceof Human) { // Human일 경우
				Human h = (Human)ani;  // Human으로 다운캐스팅
				h.readBook();
			}
			
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}			
			else {
				System.out.println("지원되지 않는 형입니다");
			}
		}
	}	

}