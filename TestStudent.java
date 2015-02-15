// This class is used by Targets to test your code
// It should not be modified

public class TestStudent {
	
	public static void main(String[] args){
		String test = args[0];
		Student a = new Student("Alex", 4, 3.6);
		Student b = new Student("Bob", 0);
		Student c = new Student("Chris");
		Student d = new Student("David", 12, 2.2);
		// Test - basic
		if(test.equals("basic")){
			if(a.getGPA()!=3.6) error("getGPA");
			if(!"Bob".equals(b.getName())) error("getName");
			if(c.getGrade()!=9) error("getGrade");
			c.setGPA(2.4);
			if(c.getGPA()!=2.4) error("setGPA");
			a.setGrade(6);
			if(a.getGrade()!=6) error("setGrade");
			b.setName("Brooke");
			if(!"Brooke".equals(b.getName())) error("setName");
		}
		// Test - gradestring
		if(test.equals("gradestring")){
			if(!"4th Grade".equals(a.getGradeString())) error("4th Grade");
			if(!"Kindergarten".equals(b.getGradeString())) error("Kindergarten");
			if(!"Freshman".equals(c.getGradeString())) error("Freshman");
			if(!"Senior".equals(d.getGradeString())) error("Senior");
		}
		// Test - sort
		if(test.equals("sort")){
			Student[] array = Student.sortByGrade(new Student[]{d, a, c, b});
			if(array.length!=4) error("Length");
			else if(array[0]!=b || array[1]!=a || array[2]!=c || array[3]!=d){
				error("Ordering");
			}
		}
		// Test - average
		if(test.equals("average")){
			Student[] array = {a, b, c, d};
			if(Math.abs(Student.averageGPA(array)-2.95) > 1e-10) error("Incorrect");
		}
	}
	
	private static boolean firstError = true;
	
	private static void error(String err){
		if(firstError){
			firstError = false;
			System.out.println("\nErrors With:");
		}
		System.out.println(err);
	}
}
