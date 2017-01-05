/**
 * ResultsPresenter communicates between and updates the view (UI) and the model
 */
package results.presenter;

import results.model.IModel;
import results.view.IView;

public class ResultsPresenter
{

	IView resultsView;
	IModel resultsModel;

	/**
	 * Constructor takes a model object and binds with it
	 *
	 * @param m
	 */
	public ResultsPresenter(IModel m)
	{
		resultsModel = m;
	}

	/**
	 * Binds a view to the presenter
	 *
	 * @param v
	 */
	public void bind(IView v)
	{
		resultsView = v;
	}

	/**
	 * Gets results for all students and sets the view to display the first one
	 */
	public void getResultsForAllStudents()
	{
		resultsModel.getResultsForAllStudents();
		resultsView.setOutput(resultsModel.current().toString());
		//This should be in it's own method but we shoulden't have more methods than in the class diagram ¯\_("/)_/¯
		resultsView.populateDetails(resultsModel.current().getStudent(),
				Integer.toString(resultsModel.current().getAssignment1()),
				Integer.toString(resultsModel.current().getAssignment2()),
				Integer.toString(resultsModel.current().getExam()),
				Integer.toString(resultsModel.current().getTotal()),
				resultsModel.current().getGrade());
	}

	/**
	 * Gets results for specified student c and displays it
	 *
	 * @param c
	 */
	public void getResultsForStudent(String c)
	{
		resultsModel.getResultsForStudent(c);
		resultsView.setOutput(resultsModel.current().toString());
		resultsView.populateDetails(resultsModel.current().getStudent(),
				Integer.toString(resultsModel.current().getAssignment1()),
				Integer.toString(resultsModel.current().getAssignment2()),
				Integer.toString(resultsModel.current().getExam()),
				Integer.toString(resultsModel.current().getTotal()),
				resultsModel.current().getGrade());
	}

	/**
	 * Gets list of students with marks between m1 and m2 and displays the first
	 * one
	 *
	 * @param m1
	 * @param m2
	 */
	public void getTotalMarksInRange(int m1, int m2)
	{
		resultsModel.getTotalMarksInRange(m1, m2);
		resultsView.setOutput(resultsModel.current().toString());
		resultsView.populateDetails(resultsModel.current().getStudent(),
				Integer.toString(resultsModel.current().getAssignment1()),
				Integer.toString(resultsModel.current().getAssignment2()),
				Integer.toString(resultsModel.current().getExam()),
				Integer.toString(resultsModel.current().getTotal()),
				resultsModel.current().getGrade());
	}

	/**
	 * Gets list of students with absent fails and displays the first one
	 */
	public void getAllAbsentFails()
	{
		resultsModel.getAllAbsentFails();
		resultsView.setOutput(resultsModel.current().toString());
		resultsView.populateDetails(resultsModel.current().getStudent(),
				Integer.toString(resultsModel.current().getAssignment1()),
				Integer.toString(resultsModel.current().getAssignment2()),
				Integer.toString(resultsModel.current().getExam()),
				Integer.toString(resultsModel.current().getTotal()),
				resultsModel.current().getGrade());
	}

	/**
	 * Closes the database connection
	 */
	public void close()
	{
		resultsModel.close();
	}

	/**
	 * Updates a students exam and total mark
	 *
	 * @param student
	 * @param exam
	 * @param total
	 */
	public void updateExamMark(String student, int exam, int total)
	{
		resultsModel.updateExamMark(student, exam, total);
		if (resultsModel.queryStatus())
		{
			resultsView.setOutput("Successfully updated");
		} else
		{
			resultsView.setOutput("Update Failed");
		}
	}

	/**
	 * Updates a students grade
	 *
	 * @param student
	 * @param grade
	 */
	public void updateGrade(String student, String grade)
	{
		resultsModel.updateGrade(student, grade);
		if (resultsModel.queryStatus())
		{
			resultsView.setOutput("Successfully updated");
		} else
		{
			resultsView.setOutput("Update Failed");
		}
	}

	/**
	 * Loops through each student with next(), until it reaches the start As it
	 * loops through, it determines the appropriate grade and calls
	 * updateGrade(String, String) with the current student and grade
	 */
	public void updateAllGrades()
	{
		resultsModel.getResultsForAllStudents();
		String start = resultsModel.current().getStudent();
		boolean hasNext = true;
		resultsModel.next();
		String next = resultsModel.current().getStudent();
		while (hasNext)
		{
			//The loop has gone all the way around and stops after this loop 
			if (start.equals(next))
			{
				hasNext = false;
			}
			int total = resultsModel.current().getTotal();
			String grade;
			boolean SA = false;
			boolean SE = false;
			//Determines if the student has a SA or SE
			//Failed Assignment1 OR Assignment2 but passed the exam
			if ((resultsModel.current().getAssignment1() < 12 ^ resultsModel.current().getAssignment2() < 12) && resultsModel.current().getExam() >= 25)
			{
				SA = true;
			}
			//Failed the exam but passed both assignments
			if (resultsModel.current().getExam() < 25 && (resultsModel.current().getAssignment1() >= 12 && resultsModel.current().getAssignment2() >= 12))
			{
				SE = true;
			}
			if (total >= 45 && total <= 50 && SA)
			{
				grade = "SA";
			} else if (total >= 45 && total <= 50 && SE)
			{
				grade = "SE";
			} else if (total >= 85 && total <= 100)
			{
				grade = "HD";
			} else if (total >= 75 && total <= 85)
			{
				grade = "D";
			} else if (total >= 65 && total <= 75)
			{
				grade = "C";
			} else if (total >= 50 && total <= 65)
			{
				grade = "P";
			} else if (total == 0)
			{
				grade = "AF";
			} else
			{
				grade = "F";
			}
			//updates the grade
			updateGrade(resultsModel.current().getStudent(), grade);
			//iterates to the next student
			resultsModel.next();
			next = resultsModel.current().getStudent();
		}
		//refreshes the list of students
		resultsModel.getResultsForAllStudents();
	}

	/**
	 * Iterates to the next student
	 */
	public void next()
	{
		resultsModel.next();
		resultsView.setOutput(resultsModel.current().toString());
		resultsView.populateDetails(resultsModel.current().getStudent(),
				Integer.toString(resultsModel.current().getAssignment1()),
				Integer.toString(resultsModel.current().getAssignment2()),
				Integer.toString(resultsModel.current().getExam()),
				Integer.toString(resultsModel.current().getTotal()),
				resultsModel.current().getGrade());
	}

	/**
	 * Iterates to the previous student
	 */
	public void previous()
	{
		resultsModel.previous();
		resultsView.setOutput(resultsModel.current().toString());
		resultsView.populateDetails(resultsModel.current().getStudent(),
				Integer.toString(resultsModel.current().getAssignment1()),
				Integer.toString(resultsModel.current().getAssignment2()),
				Integer.toString(resultsModel.current().getExam()),
				Integer.toString(resultsModel.current().getTotal()),
				resultsModel.current().getGrade());
	}

}
