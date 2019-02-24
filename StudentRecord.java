public class StudentRecord
{
	public static void main(String[] args)
	{
		Grading student1 = new Grading(), 
				student2 = new Grading();

		student1.setQuizScore(8); //quiz 1
		student1.setQuizScore(10); //quiz 2
		student1.setQuizScore(9); //quiz 3
		student1.setMidtermScore(100);
		student1.setFinalScore(100);

		student1.getQuizScore();
		student1.getMidtermScore();
		student1.getFinalScore();

		student1.calcCourseScore();
		student1.calcFinalGrade();

		System.out.println("Student 01: ");
		System.out.println(student1.toString());

		System.out.println();

		student2.setQuizScore(9); //quiz 1
		student2.setQuizScore(8); //quiz 2
		student2.setQuizScore(10); //quiz 3
		student2.setMidtermScore(100);
		student2.setFinalScore(100);

		student2.getQuizScore();
		student2.getMidtermScore();
		student2.getFinalScore();

		student2.calcCourseScore();
		student2.calcFinalGrade();

		System.out.println("Student 02: ");
		System.out.println(student2.toString());

	}
}