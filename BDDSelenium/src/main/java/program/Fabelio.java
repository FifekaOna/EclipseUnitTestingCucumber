package program;

import java.util.List;

public class Fabelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = new int[]{ 1,2,3,8,5 };
		int[] array2 = new int[]{ 1,3,11,7,6 };
		
		
		ArrayInspection arrayInspection= new ArrayInspection ();
		
		List<Integer> matchList= arrayInspection.findTwoMatch (array1,array2);	
		
		 System.out.println("Hasilnya adalah : ");
		 
		 for(Integer e:matchList)  {
			  System.out.println(e);  
			  
			} 
		
	}

}
