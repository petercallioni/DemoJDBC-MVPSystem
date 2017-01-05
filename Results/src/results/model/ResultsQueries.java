/**
 * Object which interacts with the database
 */
package results.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ResultsQueries
{
	//change these as you will
	private static final String URL = "jdbc:derby://localhost:1527/Results"; 
	private static final String USERNAME = "cqu";
	private static final String PASSWORD = "cqu";

	private Connection connection = null; 
	private PreparedStatement selectAllStudents = null;
	private PreparedStatement selectStudent = null;
	private PreparedStatement selectTotalInRange = null;
	private PreparedStatement updateExamMark = null;
	private PreparedStatement updateGrade = null;
	private PreparedStatement selectAbsentFails = null;

	/**
	 * Constructor connects to the database and creates prepared statements
	 */
	public ResultsQueries()
	{
		try
		{
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); //connects to database
			selectAllStudents = connection.prepareStatement("SELECT * FROM MARKS");
			selectTotalInRange = connection.prepareStatement("SELECT * FROM MARKS WHERE TOTAL BETWEEN ? AND ?");
			selectAbsentFails = connection.prepareStatement("SELECT * FROM MARKS WHERE ASSIGNMENT1= 0 AND ASSIGNMENT2 = 0 AND EXAM = 0");
			selectStudent = connection.prepareStatement("SELECT * FROM MARKS WHERE STUDENTID = ?");
			updateExamMark = connection.prepareStatement("UPDATE MARKS SET EXAM = ?, TOTAL = ? WHERE STUDENTID = ?");
			updateGrade = connection.prepareStatement("UPDATE MARKS SET GRADE = ? WHERE STUDENTID = ?");

		} // end try
		catch (SQLException sqlException)
		{
			JOptionPane.showMessageDialog(null, "Application exiting: could not connect to database\n"
					+ sqlException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
			sqlException.printStackTrace();
		} // end catch
	}

	/**
	 * @return list of all students
	 */
	public List< Result> getResultsForAllStudents()
	{

		List< Result> results = null;
		ResultSet resultSet = null;

		try
		{
			// executeQuery returns ResultSet containing matching entries
			resultSet = selectAllStudents.executeQuery();
			results = new ArrayList< Result>();

			while (resultSet.next())
			{
				results.add(new Result( //puts the results into a Result object in a list which will get returned
						resultSet.getString("STUDENTID"),
						resultSet.getInt("ASSIGNMENT1"),
						resultSet.getInt("ASSIGNMENT2"),
						resultSet.getInt("EXAM"),
						resultSet.getInt("TOTAL"),
						resultSet.getString("GRADE")));
			}
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		finally
		{
			try
			{
				resultSet.close();
			}
			catch (SQLException sqlException)
			{
				sqlException.printStackTrace();
				close();
			}
		}

		return results;
	}
	/**
	 * @param student
	 * @return list of one specified student
	 */
	public List<Result> getResultsForStudent(String student)//get results for one student
	{
		List< Result> results = null;
		ResultSet resultSet = null;

		try
		{
			selectStudent.setString(1, student);
			resultSet = selectStudent.executeQuery();
			results = new ArrayList< Result>();

			while (resultSet.next())
			{
				results.add(new Result(
						resultSet.getString("STUDENTID"),
						resultSet.getInt("ASSIGNMENT1"),
						resultSet.getInt("ASSIGNMENT2"),
						resultSet.getInt("EXAM"),
						resultSet.getInt("TOTAL"),
						resultSet.getString("GRADE")));
			}
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		finally
		{
			try
			{
				resultSet.close();
			}
			catch (SQLException sqlException)
			{
				sqlException.printStackTrace();
				close();
			}
		}

		return results;
	}
	
	/**
	 * @param mark1
	 * @param mark2
	 * @return list of students with marks in between mark1 and mark2
	 */
	public List<Result> getTotalMarksInRange(int mark1, int mark2)
	{
		List< Result> results = null;
		ResultSet resultSet = null;

		try
		{
			selectTotalInRange.setInt(1, mark1);
			selectTotalInRange.setInt(2, mark2);
			resultSet = selectTotalInRange.executeQuery();
			results = new ArrayList< Result>();

			while (resultSet.next())
			{
				results.add(new Result(
						resultSet.getString("STUDENTID"),
						resultSet.getInt("ASSIGNMENT1"),
						resultSet.getInt("ASSIGNMENT2"),
						resultSet.getInt("EXAM"),
						resultSet.getInt("TOTAL"),
						resultSet.getString("GRADE")));
			}
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		finally
		{
			try
			{
				resultSet.close();
			}
			catch (SQLException sqlException)
			{
				sqlException.printStackTrace();
				close();
			}
		}
		return results;
	}  

	/**
	 * @param student
	 * @param exam
	 * @param total
	 * @return updates a students exam and total
	 */
	public int updateExamMark(String student, int exam, int total)
	{
		int result = 1;
		try
		{
			updateExamMark.setInt(1, exam);
			updateExamMark.setInt(2, total);
			updateExamMark.setString(3, student);
			result = updateExamMark.executeUpdate();
		} catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		return result;
	}

	public void close()
	{
		try
		{
			connection.close();
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
	
	/**
	 * Updates a students grade
	 * @param Student
	 * @param grade 
	 */
	public void updateResult (String Student, String grade)
	{
		try
		{
			updateGrade.setString(1, grade);
			updateGrade.setString(2, Student);
			int result = updateGrade.executeUpdate();
		} catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
	
	/**
	 * @return list of all students absent fails
	 */
	public List<Result> getAllAbsentFails()
	{
		List< Result> results = null;
		ResultSet resultSet = null;

		try
		{
			// executeQuery returns ResultSet containing matching entries
			resultSet = selectAbsentFails.executeQuery();
			results = new ArrayList< Result>();

			while (resultSet.next())
			{
				results.add(new Result( //puts the results into a Result object in a list which will get returned
						resultSet.getString("STUDENTID"),
						resultSet.getInt("ASSIGNMENT1"),
						resultSet.getInt("ASSIGNMENT2"),
						resultSet.getInt("EXAM"),
						resultSet.getInt("TOTAL"),
						resultSet.getString("GRADE")));
			}
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		finally
		{
			try
			{
				resultSet.close();
			}
			catch (SQLException sqlException)
			{
				sqlException.printStackTrace();
				close();
			}
		}

		return results;
	}
} // end class ResultsQueries
