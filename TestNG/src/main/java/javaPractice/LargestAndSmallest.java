package javaPractice;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int[] numbers= {1,-2,37,23,65,-98,345,-987,9,876};
		int largest=numbers[0];
		int secLargest=numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				secLargest=largest;
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];}
			}
		
		
			{
				System.out.println(largest);
				System.out.println(secLargest);
				System.out.println(smallest);
			
		}
	}

}
