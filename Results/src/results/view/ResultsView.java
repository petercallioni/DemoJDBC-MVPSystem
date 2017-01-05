/**
 * The GUI
 */
package results.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import results.presenter.ResultsPresenter;

public class ResultsView extends javax.swing.JFrame implements IView
{
	private ResultsPresenter presenter;
	
	/**
	 * Creates new GUI ResultsView and binds a presenter object
	 * so it can delegate operations to it
	 * @param resultsPresenter
	 */
	public ResultsView(ResultsPresenter resultsPresenter)
	{
		presenter = resultsPresenter;
		initComponents(); //make the gui
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				setVisible(true);
			}
		});// could use a lambda expression here

		//close the connection on window close
		addWindowListener(
				new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent evt)
			{
				presenter.close(); // close database connection
				System.exit(0);
			}
		}
		);

	}
	//auto generated UI code
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        inputLabel = new javax.swing.JLabel();
        studentLabel = new javax.swing.JLabel();
        assign1Label = new javax.swing.JLabel();
        assign2Label = new javax.swing.JLabel();
        examLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        rangeOfMarksLabel = new javax.swing.JLabel();
        inputStudent = new javax.swing.JTextField();
        inputAss1 = new javax.swing.JTextField();
        inputAss2 = new javax.swing.JTextField();
        inputExam = new javax.swing.JTextField();
        inputGrade = new javax.swing.JTextField();
        inputTotal = new javax.swing.JTextField();
        inputRangeLow = new javax.swing.JTextField();
        inputRangeHigh = new javax.swing.JTextField();
        outputLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        queriesLabel = new javax.swing.JLabel();
        allStudentsButton = new javax.swing.JButton();
        specifiedStudentButton = new javax.swing.JButton();
        totalMarksInRangeButton = new javax.swing.JButton();
        absentFailsButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        updateAllGradesButton = new javax.swing.JButton();
        updateExamMarkButton = new javax.swing.JButton();
        viewingLabel = new javax.swing.JLabel();
        listLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane2);

        inputLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        inputLabel.setText("Input");

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        studentLabel.setText("Student #");

        assign1Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assign1Label.setText("Assignment 1");

        assign2Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assign2Label.setText("Assignment 2");

        examLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        examLabel.setText("Examination");

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        totalLabel.setText("Total");

        gradeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gradeLabel.setText("Grade");

        rangeOfMarksLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rangeOfMarksLabel.setText("Range of Marks");

        outputLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        outputLabel.setText("Output");

        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        outputArea.setRows(5);
        jScrollPane3.setViewportView(outputArea);

        queriesLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        queriesLabel.setText("Queries");

        allStudentsButton.setText("All Students");
        allStudentsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                allStudentsButtonActionPerformed(evt);
            }
        });

        specifiedStudentButton.setText("Specified Student");
        specifiedStudentButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                specifiedStudentButtonActionPerformed(evt);
            }
        });

        totalMarksInRangeButton.setText("Total Marks in Range");
        totalMarksInRangeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                totalMarksInRangeButtonActionPerformed(evt);
            }
        });

        absentFailsButton.setText("Absent Fails");
        absentFailsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                absentFailsButtonActionPerformed(evt);
            }
        });

        previousButton.setText("Previous");
        previousButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nextButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clearButtonActionPerformed(evt);
            }
        });

        updateAllGradesButton.setText("Update All Grades");
        updateAllGradesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateAllGradesButtonActionPerformed(evt);
            }
        });

        updateExamMarkButton.setText("Update Exam Marks");
        updateExamMarkButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateExamMarkButtonActionPerformed(evt);
            }
        });

        viewingLabel.setText("Viewing List:");

        listLabel.setText("All");

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel1.setText("Student, Assign1, Assign2, Exam, Total, Grade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(absentFailsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalMarksInRangeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(specifiedStudentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateAllGradesButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(allStudentsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateExamMarkButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(queriesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(previousButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rangeOfMarksLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputRangeLow))
                            .addComponent(inputLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(assign2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputAss2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assign1Label)
                                    .addComponent(studentLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(inputAss1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(examLabel)
                                    .addComponent(totalLabel)
                                    .addComponent(gradeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputGrade)
                                    .addComponent(inputExam, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(inputTotal))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputRangeHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(outputLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewingLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(outputLabel)
                        .addComponent(viewingLabel)
                        .addComponent(listLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentLabel)
                            .addComponent(inputStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assign1Label)
                            .addComponent(inputAss1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assign2Label)
                            .addComponent(inputAss2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examLabel)
                            .addComponent(inputExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalLabel)
                            .addComponent(inputTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradeLabel)
                            .addComponent(inputGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rangeOfMarksLabel)
                            .addComponent(inputRangeLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputRangeHigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(queriesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(previousButton)
                                .addComponent(nextButton))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allStudentsButton)
                    .addComponent(updateExamMarkButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specifiedStudentButton)
                    .addComponent(updateAllGradesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalMarksInRangeButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(absentFailsButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
	
	/**
	 * allStudentsButton Clicked
	 * @param evt 
	 */
    private void allStudentsButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_allStudentsButtonActionPerformed
    {//GEN-HEADEREND:event_allStudentsButtonActionPerformed
        listLabel.setText("All");
		presenter.getResultsForAllStudents();
    }//GEN-LAST:event_allStudentsButtonActionPerformed

	/**
	 * specifiedButton Clicked
	 * @param evt 
	 */
    private void specifiedStudentButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_specifiedStudentButtonActionPerformed
    {//GEN-HEADEREND:event_specifiedStudentButtonActionPerformed
        listLabel.setText("Specfic Student");
		presenter.getResultsForStudent(getStudent());
    }//GEN-LAST:event_specifiedStudentButtonActionPerformed

	/**
	 * previousButton Clicked
	 * Iterates to the previous student
	 * @param evt 
	 */
    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_previousButtonActionPerformed
    {//GEN-HEADEREND:event_previousButtonActionPerformed
        presenter.previous();
    }//GEN-LAST:event_previousButtonActionPerformed

	/**
	 * totalMarksInRangeButton Clicked
	 * Performs limited data validations, such as checking nullity
	 * @param evt 
	 */
    private void totalMarksInRangeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_totalMarksInRangeButtonActionPerformed
    {//GEN-HEADEREND:event_totalMarksInRangeButtonActionPerformed
         listLabel.setText("Marks In Range");
		try
		{
			int markLow = 0;
			int markHigh = 0;
			if ((!getRangeLower().isEmpty()) && !(getRangeHigher().isEmpty())) //check if both fields have numbers in them
			{
				markLow = Integer.parseInt(getRangeLower());
				markHigh = Integer.parseInt(getRangeHigher());
				if (markHigh < markLow) //check if higher bounder lower than lower bound
				{
					showMesssageDialog("Error: Higher bound cannot be lower than lower bound", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
			//if low field has number but high is empty, set the higher bound to the lower bound
			if (getRangeHigher().isEmpty() && !getRangeLower().isEmpty())
			{
				markLow = Integer.parseInt(getRangeLower());
				markHigh = Integer.parseInt(getRangeLower());
			}
			//if no lower bound, but higher bound has a number, throw an error
			if (!getRangeHigher().isEmpty() && getRangeLower().isEmpty())
			{
				showMesssageDialog("Error: A lower bound is required", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			presenter.getTotalMarksInRange(markLow, markHigh);
		
		} catch (Exception e)
		{
			//This should never happen
			showMesssageDialog(e.getLocalizedMessage()+"\n Please contact the developer.","Error", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_totalMarksInRangeButtonActionPerformed

	/**
	 * absentFailsButton Clicked
	 * @param evt 
	 */
    private void absentFailsButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_absentFailsButtonActionPerformed
    {//GEN-HEADEREND:event_absentFailsButtonActionPerformed
        listLabel.setText("Absent Fails");
		presenter.getAllAbsentFails();
    }//GEN-LAST:event_absentFailsButtonActionPerformed

	/**
	 * updateEameMarkButton Clicked
	 * @param evt 
	 */
    private void updateExamMarkButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateExamMarkButtonActionPerformed
    {//GEN-HEADEREND:event_updateExamMarkButtonActionPerformed
        //updates a student exam and total marks according to student id
		String student = getStudent();
		int exam = Integer.parseInt(getAssign1());
		int total = Integer.parseInt(getAssign2());
		presenter.updateExamMark(student, exam, total);
    }//GEN-LAST:event_updateExamMarkButtonActionPerformed

	/**
	 * updateAllGradesButton Clicked
	 * @param evt 
	 */
    private void updateAllGradesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateAllGradesButtonActionPerformed
    {//GEN-HEADEREND:event_updateAllGradesButtonActionPerformed
        presenter.updateAllGrades();
    }//GEN-LAST:event_updateAllGradesButtonActionPerformed

	/**
	 * clearButton Clicked
	 * @param evt 
	 */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clearButtonActionPerformed
    {//GEN-HEADEREND:event_clearButtonActionPerformed
       //cleaers all fields
		inputStudent.setText("");
		inputAss1.setText("");
		inputAss2.setText("");
		inputTotal.setText("");
		inputExam.setText("");
		inputGrade.setText("");
		inputRangeHigh.setText("");
		inputRangeLow.setText("");
		outputArea.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

	/**
	 * exitButton Clicked
	 * Same as pressing the windows close button
	 * @param evt 
	 */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitButtonActionPerformed
    {//GEN-HEADEREND:event_exitButtonActionPerformed
        //close the connection and exit
		presenter.close();
		System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

	/**
	 * nextButton Clicked
	 * Iterates to the next student
	 * @param evt 
	 */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        presenter.next();
    }//GEN-LAST:event_nextButtonActionPerformed

	/**
	 * @return entered student as String
	 */
	@Override
	public String getStudent()
	{
		return inputStudent.getText();
	}
		/**
	 * @return entered assignment 1 as String
	 */
	@Override
	public String getAssign1(){
		return inputAss1.getText();
	}
		/**
	 * @return entered assignment 2 as String
	 */
	@Override
	public String getAssign2(){
		return inputAss2.getText();
	}
		/**
	 * @return entered exam as String
	 */
	@Override
	public String getExam(){
		return inputExam.getText();
	}
		/**
	 * @return entered total as String
	 */
	@Override
	public String getTotal(){
		return inputTotal.getText();
	}
		/**
	 * @return entered grade as String
	 */
	@Override
	public String getGrade(){
		return inputGrade.getText();
	}
		/**
	 * @return entered lower range as String
	 */
	@Override
	public String getRangeLower(){
		return inputRangeLow.getText();
	}
		/**
	 * @return entered higher range as String
	 */
	@Override
	public String getRangeHigher(){
		return inputRangeHigh.getText();
	}
	/**
	 * Sets the output area to s
	 * @param s 
	 */
	@Override
	public void setOutput (String s){
		outputArea.setText(s);
	}
	/**
	 * Shows a message dialog with a title, s1; message s2; and messageType int
	 * @param s1
	 * @param s2
	 * @param messageType 
	 */
	
	@Override
	public void showMesssageDialog(String s1, String s2, int messageType){
		JOptionPane.showMessageDialog( this, s1, s2, messageType );
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absentFailsButton;
    private javax.swing.JButton allStudentsButton;
    private javax.swing.JLabel assign1Label;
    private javax.swing.JLabel assign2Label;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel examLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JTextField inputAss1;
    private javax.swing.JTextField inputAss2;
    private javax.swing.JTextField inputExam;
    private javax.swing.JTextField inputGrade;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JTextField inputRangeHigh;
    private javax.swing.JTextField inputRangeLow;
    private javax.swing.JTextField inputStudent;
    private javax.swing.JTextField inputTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel listLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel queriesLabel;
    private javax.swing.JLabel rangeOfMarksLabel;
    private javax.swing.JButton specifiedStudentButton;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton totalMarksInRangeButton;
    private javax.swing.JButton updateAllGradesButton;
    private javax.swing.JButton updateExamMarkButton;
    private javax.swing.JLabel viewingLabel;
    // End of variables declaration//GEN-END:variables

	/**
	 * Populates the fields with the students details
	 * @param sid
	 * @param ass1
	 * @param ass2
	 * @param exam
	 * @param total
	 * @param grade 
	 */
	@Override
	public void populateDetails(String sid, String ass1, String ass2, String exam, String total, String grade)
	{
		inputStudent.setText(sid);
		inputAss1.setText(ass1);
		inputAss2.setText(ass2);
		inputExam.setText(exam);
		inputTotal.setText(total);
		inputGrade.setText(grade);
	}
}
