package javaPractice;

public class DulicateElementsArray {

	public static void main(String[] args) {
		 String[] duplicates= {"java","selenium","appium","java","phython","ruby","selenium"};
		 for(int i=0;i<duplicates.length;i++) {
			 for(int k=i+1;k<duplicates.length;k++)
			 {
				 if(duplicates[i].equals(duplicates[k])) {
					 System.out.println(duplicates[i]);
					 
				 }
			 }
		 }

	}

}
