package ch05;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[][] array = { 
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		for(int i = 0; i < array.length; i++) {
			for(int l = 0; l < array[i].length; l++) {
				System.out.println(array[i][l]);
			}
		}
	}
}
