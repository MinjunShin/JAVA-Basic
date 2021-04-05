package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
//BinaryOperator�� ������ Ŭ���� ����
	
	@Override
	public String apply(String s1, String s2) {
		//reduce �޼��尡 ȣ��� �� �Ҹ��� �޼���, �� ���ڿ� ���̸� ��
		System.out.print(s1 + " ");
		System.out.println(s1.getBytes().length);
		System.out.print(s2 + " ");
		System.out.println(s2.getBytes().length);
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"�ȳ��ϼ���~~!", "hello", "Good morning", "�ݰ����ϴ�!!"};
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2)-> 
		{if(s1.getBytes().length >= s2.getBytes().length) return s1; else return s2;}));
		//���ٽ��� ���� �����ϴ� ���
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		//BinaryOperator�� ������ Ŭ���� ���
		System.out.println(str);
		
	}

}
