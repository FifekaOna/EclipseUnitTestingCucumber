package stepDefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import program.ArrayInspection;

public class ArrayInspectionStep {
	
	
	List<Integer> result;
	
	@When("^I input given array$")
	public void i_input_given_array()  {
		
		 int[] array1 = new int[]{ 1,2,3,4,5 };
		 int[] array2 = new int[]{ 1,3,5,7,9 };
		 	 
		 ArrayInspection arrayInspection= new ArrayInspection ();			
		 result= arrayInspection.findTwoMatch (array1,array2);	
	   
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes()  {
		
		
		 List<Integer> expectedResult=new ArrayList<Integer>(); 
		 expectedResult.add(1);
		 expectedResult.add(3);	
		 Assert.assertTrue(expectedResult.equals(result));
		 
	}

	
	



}
