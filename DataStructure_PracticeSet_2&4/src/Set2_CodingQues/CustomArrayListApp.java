package Set2_CodingQues;

import java.util.ArrayList;

public class CustomArrayListApp {
	
	int size = 4;
	
	class Student{
		
		int rollNo;
		String studentName;
		int marks;
		
		public Student(int rollNo, String studentName, int marks) {
			super();
			this.rollNo = rollNo;
			this.studentName = studentName;
			this.marks = marks;
		}

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", marks=" + marks + "]";
		}
		
		
		
		
	}
	
	public ArrayList<Student> addStudent(int rollNo[],String studentName[],int marks[]) {
		
		ArrayList<Student> studlist = new ArrayList<>();
		
		for(int i=0; i< size; i++) {
			
			studlist.add(new Student(rollNo[i],studentName[i],marks[i]));
		}
		
		return studlist;
		
	}
	
	
	
	public static void main(String args[]) 
    { 
        // suppose the custom input data 
        int roll[] = {1, 2, 3, 4}; 
        String names[] = {"Sam", "John", "Rita", "Sham"}; 
        int marks[] = {65, 74, 80, 90}; 
        
        CustomArrayListApp customList = new CustomArrayListApp();
        
        ArrayList<Student> slist = customList.addStudent(roll, names, marks);
        
        for(Student s : slist) {
        	
        	System.out.println(s.getRollNo()+" "+s.getStudentName()+" "+s.getMarks());
        }
        
    }    

}
