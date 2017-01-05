/**
 * Interface for the view, facilitating communication between the view and presenter
 */
package results.view;

public interface IView
{
	String getStudent();
	
	String getAssign1();
	
	String getAssign2();
	
	String getExam();
	
	String getTotal();
	
	String getGrade();
	
	String getRangeLower();
	
	String getRangeHigher();
	
	void populateDetails(String sid, String ass1, String ass2, String exam, String total, String grade);
	
	void setOutput (String s);
	
	void showMesssageDialog(String s1, String s2, int messageType);
}
