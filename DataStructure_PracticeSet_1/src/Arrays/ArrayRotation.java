package Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int n = 3;
		
		System.out.println("Orignal Array is :");
		
		for(int a: arr) {
			System.out.print(" "+a);
			
		}
				
			
		for(int i=0;i<n;i++) {
			
			int j,last;
			
			last = arr[arr.length-1];
			
			for(j=arr.length-1;j>0;j--) {
				
				arr[j]=arr[j-1];
			}
			
			arr[0]=last;
		}
		
		System.out.println();
		
		System.out.println("Array after Rotation is :");
		
		for(int a: arr) {
			System.out.print(" "+a);
		}
		

	}

}
