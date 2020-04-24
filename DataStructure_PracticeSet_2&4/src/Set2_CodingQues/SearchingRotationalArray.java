package Set2_CodingQues;

public class SearchingRotationalArray {
	
	 static int binarySearch(int arr[], int lb, int ub, int x) 
	    { 
	        if (ub >= lb) { 
	            int mid = lb + (ub - lb) / 2; 
	  
	            
	            if (arr[mid] == x) 
	                return mid; 
	  
	            
	            if (arr[mid] > x) 
	                return binarySearch(arr, lb, mid - 1, x); 
	  
	            
	            return binarySearch(arr, mid + 1, ub, x); 
	        } 
	  
	        
	        return -1; 
	    } 

	public static void main(String[] args) {
		
		int arr[] = {67, 75, 88, 32, 43, 49, 55};
		
		int[] newArr = new int[7];
		
		int temp;
		
		// make array sorted.
		for(int i=0;i<arr.length;i++) {
			
			if(i<4) {
			newArr[i] = arr[i+3];
			}
			
			else {
				newArr[i]= arr[i-4];
			}
			
		}
		
		for(int a:newArr) {
			System.out.println(a);
		}
		
		int x= 75;  // element to be searched
		
		int n = newArr.length;
		
		int result  = binarySearch(newArr, 0, n-1, x);
		
		if(result == -1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Found at : "+result);
		}
		
		

	}

}
