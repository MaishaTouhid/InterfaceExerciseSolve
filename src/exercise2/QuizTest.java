package exercise2;

public class QuizTest {
    public static void main(String[] args) {
        Quiz[] quizzes = {
                new Quiz(85, "B"),
                new Quiz(92, "A-"),
                new Quiz(78, "C+"),
                new Quiz(95, "A"),
                new Quiz(88, "B+")
        };


        double averageScore = Data.average(quizzes);
        Quiz highestQuiz = (Quiz) Data.max(quizzes);


        System.out.println("Average Score: " + averageScore);
        System.out.println("Highest Score: " + highestQuiz.getMeasure() + " (" + highestQuiz.getLetterGrade() + ")");
    }
}

