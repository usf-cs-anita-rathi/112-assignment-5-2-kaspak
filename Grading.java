public class Grading
{
	private int quizzes = 0; //3 quizzes = 10 pts each, 30 total
	private int midterm = 0; //1 midterm = 100 pts
	private int finalExam = 0; //1 final = 100 pts
	private int courseScore = 0; //0-100
	private char finalGrade; //A-F

	public void calcCourseScore()
	{
		courseScore = (quizzes + midterm + finalExam);
		courseScore = ( (courseScore * 100)/230 ); //converts 0-230 to 0-100
	}

	public void calcFinalGrade()
	{
		if (courseScore < 60)
			finalGrade = 'F';

		else if ( (courseScore >= 60) && (courseScore < 70) )
			finalGrade = 'D';

		else if ( (courseScore >= 70) && (courseScore < 80) )
			finalGrade = 'C';

		else if ( (courseScore >= 80) && (courseScore < 90) )
			finalGrade = 'B';

		else if (courseScore >= 90)
			finalGrade = 'A';
	}

	public int getCourseScore()
	{
		return courseScore;
	}

	public char getFinalGrade()
	{
		return finalGrade;
	}

	public void setQuizScore(int quizScore) //quizScore = 0-10 , quizzes = 0-30
	{
		quizzes += quizScore;
	}

	public void setMidtermScore(int midtermScore) // midterm = 0-100
	{
		midterm = midtermScore;
	}

	public void setFinalScore(int finalExamScore) // final = 0-100
	{
		finalExam = finalExamScore;
	}

	public int getQuizScore()
	{
		return quizzes;
	}

	public int getMidtermScore()
	{
		return midterm;
	}

	public int getFinalScore()
	{
		return finalExam;
	}	

	public String toString()
	{
		return ("Quizzes Score: " + quizzes + "\n" +
				"Midterm Score: " + midterm + "\n" +
				"Final Exam Score: " + finalExam + "\n" +
				"Course Score: " + courseScore + "\n" +
				"Final Grade: " + finalGrade );
	}

	public boolean equals(Grading otherStudent)
	{
		return ( (courseScore == otherStudent.courseScore) && 
				 (finalGrade == otherStudent.finalGrade ) );
				 
	}

}