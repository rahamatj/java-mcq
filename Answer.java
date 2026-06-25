public class Answer {
    private String answer;
    private String option;

    public Answer(String option, String answer) {
        this.option = option;
        this.answer = answer;
    }

    public String getAnswer() {
        return " (" + this.option + ")" + this.answer;
    }

    public String getOption() {
        return this.option;
    }
}
