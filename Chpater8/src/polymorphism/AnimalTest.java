package polymorphism;

import java.util.ArrayList;

class super_Animal {
	public void move() {
		System.out.println("������ �����δ�.");
	}

}

class Human extends super_Animal{
	public void move() {
		System.out.println("����� �ι߷� �ȴ´�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �д´�");
	}

}

class Tiger extends super_Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ȴ´�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}


}

class Eagle extends super_Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ����.");
	}
	
	public void flying() {
		System.out.println("�������� ���ư���.");
	}

}


public class AnimalTest {

	ArrayList<super_Animal> aniList = new ArrayList<super_Animal>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest.testCasting();

	}
	
	public void addAnimal() { // ArrayList�� �߰��ϸ鼭 Animal�� ����ȯ
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for (super_Animal ani : aniList) { //�迭��Ҹ� Animal������ ������ move()�� ȣ�� �� �����ǵ� �Լ��� ȣ��
			ani.move();
		}
	
	}
	
	public void testCasting() {
		for(int i = 0; i<aniList.size(); i++) { //��� �迭 ��Ҹ� �ϳ��� ���鼭
			super_Animal ani = aniList.get(i); // Animal ������ ������
			if(ani instanceof Human) { // Human�� ���
				Human h = (Human)ani;  // Human���� �ٿ�ĳ����
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
				System.out.println("�������� �ʴ� ���Դϴ�");
			}
		}
	}	

}