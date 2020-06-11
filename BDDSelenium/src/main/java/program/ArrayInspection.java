package program;

import java.util.ArrayList;
import java.util.List;

public class ArrayInspection {
	
	public List<Integer> findTwoMatch (int[] A, int[] B) {
		 List<Integer> matchList = new ArrayList<Integer>(); 
		 
		 for (int i=0;i<A.length;i++) {		 
			 for (int j=0 ; j < B.length; j++) {				 
				 if (A[i]==B[j]) {
					 matchList.add(A[i]);
				 }
			 }			 
			 if (matchList.size()==2) {
				 break;
			 }			 
		 }		 
		 return matchList;
	}

}
