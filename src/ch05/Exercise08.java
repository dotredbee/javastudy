package ch05;

public class Exercise08 {
	public static void main(String[] args) { 
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		
		int count = 0;
		for(int i = 0; i < array.length; ++i) {
			for(int l = 0; l < array[i].length; ++l) {
				++count;
				sum += array[i][l];
			}
		}
		
		avg = (double) sum / count;
		
		
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
