public class Question {

    private String question;
    private Answer[] answers = new Answer[4];
    private Answer correctAnswer;

    public Question(String question, Answer[] answers, Answer correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return this.question;
    }

    public Answer[] getAnswers() {
        return this.answers;
    }

    public Answer getCorrectAnswer() {
        return this.correctAnswer;
    } 
}
