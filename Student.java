import java.util.Arrays;

public class Student implements Comparable<Student>{

    private String name;
    private int grade;
    private double gpa;
	
	public Student(String name, int grade, double gpa){
		// Construct a Student with name, grade, and gpa
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
	}
	
	public Student(String name, int grade){
		// Construct a Student with name,
		// grade, and default gpa of 3.0
        this(name, grade, 3.0);
	}
	
	public Student(String name){
		// Construct a Student with name,
		// default grade of 9 and
		// default gpa of 3.0
        this(name, 9);
	}
	
	public String getName(){
		// Return the Student's name
		return name;
	}
	
	public int getGrade(){
		// Return the Student's grade
		return grade;
	}
	
	public double getGPA(){
        // Return the Student's GPA
		return gpa;
	}
	
	public void setName(String name){
		// Set the Student's name
        this.name = name;
	}
	
	public void setGrade(int grade){
		// Set the Student's grade
        this.grade = grade;
	}
	
	public void setGPA(double gpa){
		// Set the Student's gpa
		this.gpa = gpa;
	}
	
	public String getGradeString(){
		// Returns a String representing the Student's grade
		// Kindergarten for grade = 0
		// nth Grade for grades 1 - 8
		// Freshman, Sophomore, Junior, Senior for grades 9 - 12
        if(grade == 0) return "Kindergarten";
        if(grade == 9) return "Freshman";
        if(grade == 10) return "Sophomore";
        if(grade == 11) return "Junior";
        if(grade == 12) return "Senior";
        if(grade == 1) return "1st Grade";
        if(grade == 2) return "2nd Grade";
        if(grade == 3) return "3rd Grade";
		return grade+"th Grade";
	}
	
	public static Student[] sortByGrade(Student[] students){
		// Return the array of students sorted from lowest to highest grade
		// You are allowed to use Comparable or Comparator
        Arrays.sort(students);
		return students;
	}
	
	public static double averageGPA(Student[] students){
		// Return the average GPA of the students
        double total = 0;
        for(Student s : students) total += s.getGPA();
		return total / students.length;
	}
	
    @Override
    public int compareTo(Student other){
        return getGrade() - other.getGrade();
    }
	
}
