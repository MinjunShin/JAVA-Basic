package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 가장 높은 전화를 가져온다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 능력이 가장 높은 직원에게 우선 배분한다.");	
		
	}

}
