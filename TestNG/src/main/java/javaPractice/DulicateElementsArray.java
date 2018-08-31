package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class DulicateElementsArray {

	public static void main(String[] args) {
		 String[] duplicates= {"java","selenium","appium","java","phython","ruby","selenium"};
		/* for(int i=0;i<duplicates.length;i++) {
			 for(int k=i+1;k<duplicates.length;k++)
			 {
				 if(duplicates[i].equals(duplicates[k])) {
					 System.out.println(duplicates[i]);
					 
				 }
			 }
		 }*/
		 Set<String> s=new HashSet<String>();
		for(String dup:duplicates) {
			if(s.add(dup)==false) {
				System.out.println("Duplicate elements are"+dup);
				
			}
			}
		}

	}


