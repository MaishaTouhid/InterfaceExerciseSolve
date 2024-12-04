package exercise2;

public class Quiz implements Measurable {
    private double score;
    private String letterGrade;

    public Quiz(double score, String letterGrade) {
        this.score = score;
        this.letterGrade = letterGrade;
    }

    @Override
    public double getMeasure() {
        return score;
    }

    public String getLetterGrade() {
        return letterGrade;
    }
}
