package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException{
		System.out.println("��� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ�");	
		System.out.println("L : ��Ⱑ ���� ���� ���ʷ�");
		System.out.println("P : �켱������ ���� ���� �� �켱");
		
		int ch = System.in.read(); // �Ҵ����� �Է¹޾� ch�� ����
		
		Scheduler scheduler;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		
		else if(ch == 'L'|| ch == 'l') {
			scheduler = new LeastJob();		
			
		}
		
		else if(ch == 'P'|| ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		
		else {
			System.out.println("�������� �ʴ� ����̴�.");
			return;
		}

		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
