import java.util.*;

public class Main {
    public static void main(String args[]) {
        Repo repo = new Repo();
        Scanner sc = new Scanner(System.in);
        String correctAnswer;
        int score = 0;

        for (int i = 0; i < repo.questions().length; i++) {
            Question question = repo.questions()[i];
            System.out.println(question.getQuestion());
            correctAnswer = question.getCorrectAnswer().getOption().toLowerCase();
            
            for (int j = 0; j < repo.questions()[i].getAnswers().length; j++) {
                String answer = repo.questions()[i].getAnswers()[j].getAnswerWithOption();

                System.out.println(answer);
            }

            System.out.println("Enter your answer: ");
            String answerInput = sc.nextLine().toLowerCase().trim();

            if (answerInput.equals(correctAnswer)) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Wrong answer! The correct answer is: " + question.getCorrectAnswer().getAnswerWithOption());
            }
        }
        System.out.println("Your final score is: " + score);
    }
}