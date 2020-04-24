package Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int arr[] = {5,3,2,6,7,8,8};
	
		int larg= arr[0];
		int secLarg = 0,temp;
		
		for(int i=1;i<arr.length;i++) {
			
			if(larg < arr[i]) {
				
				temp = larg;
				larg = arr[i];
				secLarg = temp;
			}
		}
		
		System.out.println("Second Largest No is : " +secLarg);
		//System.out.println(larg);

	}

}
