package Arrays;

class Stack{
	
	int arr[];
	int top;
	int capacity;
	
	Stack(int len){
		
		arr = new int[len];
		top = -1;
		capacity = len;
	}
	
	public void push(int i) {
		
		if(this.top != this.capacity-1) {
		arr[++top] = i;
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	
	public int pop() {
		
		return arr[--top];
	}
	
	public void display() {
		
		for(int q: arr) {
			System.out.print(" "+q);
		}
	}
}

	


public class SortZerosOnesTwos {

	public static void main(String[] args) {
		
		int arr[] = {1, 1, 2, 0, 1, 2, 1, 0};
		
		
		
		}
		

	

}
