package unitTesting;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import program.ArrayInspection;





public class FabelioTest {
	
	@Test
	public void testFindTwoMatchModule() {
		
		 int[] array1 = new int[]{ 1,2,3,4,5 };
		 int[] array2 = new int[]{ 1,3,5,7,9 };
		 List<Integer> expectedResult=new ArrayList<Integer>(); 
		 expectedResult.add(1);
		 expectedResult.add(3);		 
		 ArrayInspection arrayInspection= new ArrayInspection ();			
		List<Integer> result= arrayInspection.findTwoMatch (array1,array2);			  
		 Assert.assertTrue(expectedResult.equals(result));
		
	}
	
	
	@Test
	public void testFindTwoMatchModule_negative() {
		
		 int[] array1 = new int[]{ 1,2,3,4,5 };
		 int[] array2 = new int[]{ 1,3,5,7,9 };
		 List<Integer> expectedResult=new ArrayList<Integer>(); 
		 expectedResult.add(1);
		 expectedResult.add(3);	
		 expectedResult.add(5);	
		 ArrayInspection arrayInspection= new ArrayInspection ();			
		List<Integer> result= arrayInspection.findTwoMatch (array1,array2);			 		 
		 Assert.assertFalse(expectedResult.equals(result));
		
	}

}
