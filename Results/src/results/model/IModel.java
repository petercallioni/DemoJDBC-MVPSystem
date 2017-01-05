/**
 * Interface for ResultsModel
 */
package results.model;

public interface IModel {
    
    public void getResultsForAllStudents(); 
    public void getResultsForStudent( String c );
    public void getTotalMarksInRange( int m1, int m2 );
    public void getAllAbsentFails();
    public void close();
    public void updateExamMark( String student, int exam, int total );
    public void updateGrade( String student, String grade );
	
    public void next();
    public void previous();
    public Result current();
    
    // did the last query succeed?
    public boolean queryStatus();       
}
