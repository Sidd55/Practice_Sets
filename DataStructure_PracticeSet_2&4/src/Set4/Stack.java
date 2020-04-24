package Set4;

class StackArray {
		
		int arr[];
		int top;
		int capacity;
		
		StackArray(int len){
			
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

public class Stack {

		public static void main(String[] args) {
			int a[] = {6,0,-3,0,0,4};
		
			StackArray s = new StackArray(a.length);
			
			for(int i = 0; i< a.length; i++) {
				
					s.push(a[i]);
				
				if(a[i] == 0) {
					s.pop();
				}
			
			}
			
			s.display();
		
		}


}
