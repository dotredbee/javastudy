package ch02;

import java.util.Iterator;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		
//		강제 형 변환으로 데이터 손실 발생 방지
		if((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 업습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		}else {
			byte b = (byte)i;
			System.out.println(b);
		}
		
	}
}
