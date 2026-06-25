import java.util.*;

public class Main {
    public static void main(String args[]) {
        Repo repo = new Repo();
        Scanner sc = new Scanner(System.in);
        String correctAnswer;

        for (int i = 0; i < repo.questions().length; i++) {
            Question question = repo.questions()[i];
            System.out.println(question.getQuestion());
            correctAnswer = question.getCorrectAnswer().getAnswer().toLowerCase();
            
            for (int j = 0; j < repo.questions()[i].getAnswers().length; j++) {
                String answer = repo.questions()[i].getAnswers()[j].getAnswer();

                System.out.println(answer);
            }

            System.out.println("Enter your answer: ");
            String answerInput = sc.nextLine().toLowerCase();

            System.out.println("Your answer: " + answerInput);
            System.out.println("Correct answer: " + correctAnswer);
        }
    }
}