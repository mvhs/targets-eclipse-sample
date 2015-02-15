
public class Student {
	
	public Student(String name, int grade, double gpa){
		// Construct a Student with name, grade, and gpa
	}
	
	public Student(String name, int grade){
		// Construct a Student with name,
		// grade, and default gpa of 3.0
	}
	
	public Student(String name){
		// Construct a Student with name,
		// default grade of 9 and
		// default gpa of 3.0
	}
	
	public String getName(){
		// Return the Student's name
		return "";
	}
	
	public int getGrade(){
		// Return the Student's grade
		return 0;
	}
	
	public double getGPA(){
		return 0;
	}
	
	public void setName(String name){
		// Set the Student's name
	}
	
	public void setGrade(int grade){
		// Set the Student's grade
	}
	
	public void setGPA(double gpa){
		// Set the Student's gpa
	}
	
	public String getGradeString(){
		// Returns a String representing the Student's grade
		// Kindergarten for grade = 0
		// nth Grade for grades 1 - 8
		// Freshman, Sophomore, Junior, Senior for grades 9 - 12
		return "";
	}
	
	public static Student[] sortByGrade(Student[] students){
		// Return the array of students sorted from lowest to highest grade
		// You are allowed to use Comparable or Comparator
		return students;
	}
	
	public static double averageGPA(Student[] students){
		// Return the average GPA of the students
		return 0;
	}
	
	
}
