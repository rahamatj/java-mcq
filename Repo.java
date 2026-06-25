public class Repo {

    public Question[] questions() {
        Answer[] answers1 = {new Answer("A", "Dhaka"), new Answer("B", "Cumilla"), new Answer("C", "Noakhali"), new Answer("D", "Bogra")};

        Answer[] answers2 = {new Answer("A", "English"), new Answer("B", "Arabic"), new Answer("C", "Bangla"), new Answer("D", "Hindi")};

        Answer[] answers3 = {new Answer("A", "Rupee"), new Answer("B", "Dollar"), new Answer("C", "Rial"), new Answer("D", "Taka")};

        Answer correctAnswer1 = new Answer("A", "Dhaka");
        Answer correctAnswer2 = new Answer("C", "Bangla");
        Answer correctAnswer3 = new Answer("D", "Taka");

        Question question1 = new Question("What is the capital of Bangladesh?", answers1, correctAnswer1);
        Question question2 = new Question("What is the mother tongue of Bangladesh?", answers2, correctAnswer2);
        Question question3 = new Question("What is the currency of Bangladesh?", answers3, correctAnswer3);

        Question[] questions = new Question[] { question1, question2, question3 };

        return questions;
    }
}
