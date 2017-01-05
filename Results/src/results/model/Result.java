/**
 * An object to store students results
 */
package results.model;

public class Result {
    private String student;
    private int assignment1;
    private int assignment2;
    private int exam;
    private int total;
    private String grade;
    
	/**
	 * Constructor takes 6 arguments and sets them using the appropriate set method
	 * @param student
	 * @param a1
	 * @param a2
	 * @param exam
	 * @param total
	 * @param grade 
	 */
    public Result(String student, int a1, int a2, int exam, int total, String grade)
    {
        setStudent(student);
        setAssignment1(a1);
        setAssignment2(a2);
        setExam(exam);
        setTotal(total);
        setGrade(grade);
    }

	/**
	 * @return student
	 */
    public String getStudent() {
        return student;
    }

	/**
	 * set student 
	 * @param student
	 */
    public void setStudent(String student) {
        this.student = student;
    }

	/**
	 * @return assignment1
	 */
    public int getAssignment1() {
        return assignment1;
    }

	/**
	 * set assignment1 
	 * @param a1
	 */
    public void setAssignment1(int a1) {
        assignment1 = a1;
    }

	/**
	 * @return assignment2
	 */
    public int getAssignment2() {
        return assignment2;
    }

	/**
	 * set assignment2 
	 * @param a2
	 */
    public void setAssignment2(int a2) {
        assignment2 = a2;
    }
	
	/**
	 * @return exam
	 */
    public int getExam() {
        return exam;
    }

	/**
	 *set exam 
	 * @param exam
	 */
    public void setExam(int exam) {
        this.exam = exam;
    }

	/**
	 * @return total
	 */
    public int getTotal() {
        return total;
    }

	/**
	 * set total 
	 * @param total
	 */
    public void setTotal(int total) {
        this.total = total;
    }

	/**
	 * @return grade
	 */
    public String getGrade() {
        return grade;
    }

	/**
	 * set grade 
	 * @param grade
	 */
    public void setGrade(String grade) {
        this.grade = grade;
    } 
	/**
	 * @return a string of all object variables
	 */
	@Override
    public String toString()
    {
        String format = "%-7s %-9s %-9s %-5s %-6s %s";
        String results = String.format(format, 
                 getStudent(), 
                 getAssignment1(),
                 getAssignment2(),
                 getExam(),
                 getTotal(),
                 getGrade());
        return results;
    }
}
