package ch03;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(200000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("�����÷ο� �߻�! ��Ȯ�ϰ� ��� �Ұ�");
		}
	}
	
	public static int safeAdd(int left, int right) { 
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		
		return left + right;
	}
}
