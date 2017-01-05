/**
 * Results is a program for managing student marks and grades
 */
package results;
import results.model.ResultsModel;
import results.model.ResultsQueries;
import results.presenter.ResultsPresenter;
import results.view.ResultsView;

public class Results
{
	/**
	 * initializing the program. Makes four object, 
	 * ResultsQueries, which gets injected into the model
	 * ResultsModel which gets injected into the presenter
	 * ResultsPresenter that gets bound the view
	 * ResultsView, the GUI
	 * @param args 
	 */
	public static void main(String[] args)
	{
		ResultsQueries rq = new ResultsQueries();
		ResultsModel rm = new ResultsModel(rq);
		ResultsPresenter rp = new ResultsPresenter(rm);
		ResultsView rv = new ResultsView(rp);
		rp.bind(rv);
	}
}
