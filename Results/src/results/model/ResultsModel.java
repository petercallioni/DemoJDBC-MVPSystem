/**
 * Results model layer that facilitates  communication between the presenter and the business logic
 */
package results.model;

import java.util.List;


public class ResultsModel implements IModel
{
	private int current;
	private List <Result> results;
	private ResultsQueries resultQueries;
	private boolean status;
	/**
	 * Constructor takes a ResultsQueries and uses it 
	 * @param rq 
	 */
	public ResultsModel(ResultsQueries rq)
	{
		resultQueries = rq;
		current = 0;
		results = resultQueries.getResultsForAllStudents();
		status = true;
	}

	/**
	 * Sets the list of students to all students
	 */
	@Override
	public void getResultsForAllStudents()
	{
		results = resultQueries.getResultsForAllStudents();
	}

	/**
	 * Gets results for student c
	 * @param c 
	 */
	@Override
	public void getResultsForStudent(String c)
	{
		current = 0;
		results = resultQueries.getResultsForStudent(c);
	}

	/**
	 * Sets list of students to students with marks in between m1 and m2
	 * @param m1
	 * @param m2 
	 */
	@Override
	public void getTotalMarksInRange(int m1, int m2)
	{
		current = 0;
		results = resultQueries.getTotalMarksInRange(m1, m2);
	}

	/**
	 * Sets list of students to students with absent fails
	 */
	@Override
	public void getAllAbsentFails()
	{
		current = 0;
		results = resultQueries.getAllAbsentFails();
	}

	/**
	 * Closes the connection to the database
	 */
	@Override
	public void close()
	{
		resultQueries.close();
	}

	/**
	 * Updates a students exam and total marks according to student
	 * @param student
	 * @param exam
	 * @param total 
	 */
	@Override
	public void updateExamMark(String student, int exam, int total)
	{
		status = false;
		try
		{
			resultQueries.updateExamMark(student, exam, total);
		status = true;
		}
		catch(Exception e){}
	}

	/**
	 * Updates a students grade, according to student
	 * @param student
	 * @param grade 
	 */
	@Override
	public void updateGrade(String student, String grade)
	{
		status = false;
		try
		{
			resultQueries.updateResult(student, grade);
			status = true;
		}
		catch (Exception e){}
		
	}
	
	/**
	 * Iterates the current student in the list forward
	 */
	@Override
	public void next()
	{
      current++;
      // wrap arounds
      if ( current == results.size() )
         current = 0;
	}

	/**
	 * Iterates the current student in the list backward
	 */
	@Override
	public void previous()
	{
	current--;
      // wrap around
      if ( current == -1 )
         current = results.size() -1;
	}

	/**
	 * @return current Result
	 */
	@Override
	public Result current()
	{
		return results.get(current);
	}

	/**
	 * @return true if the query succeeded
	 */
	@Override
	public boolean queryStatus()
	{
		return status;
	}

}
