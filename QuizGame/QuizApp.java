package QuizGame;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizApp {

    ArrayList<Question> question = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    public QuizApp() {

        Question question1 = new Question("A person with well-developed abdominal muscles is said to have a what? ", "One-pack", "Six-pack", "12-pack ", "family-pack ", "Six-pack");
        Question question2 = new Question("A person with well-developed abdominal muscles is said to have a what? ", "One-pack", "Six-pack", "12-pack ", "family-pack ", "Six-pack");
        Question question3 = new Question("A person with well-developed abdominal muscles is said to have a what? ", "One-pack", "Six-pack", "12-pack ", "family-pack ", "Six-pack");
        question.add(question1);
        question.add(question2);
        question.add(question3);

    }

    public void showQuestion() {
        System.out.println();
        System.out.println("All Question info:");
        for (Question quest:question) {
            System.out.println(quest.question + " - " + quest.answerright);
        }
        System.out.println("------------End----------");
        System.out.println();

    }


}
