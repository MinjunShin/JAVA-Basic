package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException{
		System.out.println("상담 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로");	
		System.out.println("L : 대기가 가장 적은 차례로");
		System.out.println("P : 우선순위가 가장 높은 고객 우선");
		
		int ch = System.in.read(); // 할당방식을 입력받아 ch에 대입
		
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
			System.out.println("지원되지 않는 기능이다.");
			return;
		}

		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
