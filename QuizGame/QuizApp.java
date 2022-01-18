package QuizGame;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizApp {

    ArrayList<Question> question = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int timer = 1;

    public QuizApp() {

        Question question1 = new Question("A person with well-developed abdominal muscles is said to have a what? ", "One-pack", "Six-pack", "12-pack ", "family-pack ", "Six-pack");
        Question question2 = new Question("Which two words traditionally appear onscreen at the termination of a feature film?", "The End", "Six-pack", "12-pack ", "family-pack ", "Six-pack");
        Question question3 = new Question("A person with well-developed abdominal muscles is said to have a what? ", "One-pack", "Six-pack", "12-pack ", "family-pack ", "Six-pack");


        question.add(question1);
        question.add(question2);
        question.add(question3);

    }

    public void showQuestion() {
        System.out.println();
        System.out.println("Quiz");
        for (Question quest : question) {
            System.out.println("------------Question " + (question.indexOf(quest) + 1) + "---------");
            System.out.println(question.indexOf(quest) + 1 + quest.question);
            System.out.printf(" \t 1: %s - 2: %s - 3: %s - 4: %s ", quest.answerA,  quest.answerB, quest.answerC, quest.answerD);

            System.out.println(quest.answerright);
            System.out.println("--------------------------------------------------------------------------------");
            if (timer == 10) {
                printwin(timer);
            } else {
                while (timer <= 2) {
                    System.out.println("Timer is: " + timer);
                    System.out.print("Answer ");
                    int choice = input.nextInt();

                    input.nextLine();
                    switch (choice) {
                        case 1:
                            if (quest.answerA.equals(quest.answerright)) {
                                timer++;
                                showQuestion();
                            } else {
                                printend(timer);
                                break;
                            }
                        case 2:
                            if (quest.answerB.equals(quest.answerright)) {
                                timer++;
                                showQuestion();
                            } else {
                                printend(timer);
                                break;
                            }
                        case 3:
                            if (quest.answerC.equals(quest.answerright)) {
                                timer++;
                                showQuestion();
                            } else {
                                printend(timer);
                                break;
                            }
                        case 4:
                            if (quest.answerD.equals(quest.answerright)) {
                                timer++;
                                showQuestion();
                            } else {
                                printend(timer);
                                break;
                            }
                        default:
                            System.out.println("Not valid input");
                            showQuestion();
                            break;
                    }
                }
            }
        }
    }


    public void printend(int timer) {
        System.out.println();
        System.out.println("You lose in round " + timer);
        System.out.println("------------End----------");
        System.out.println();
        System.exit(0);
    }

    public void printwin(int timer) {
        System.out.println();
        System.out.println("You win " + timer);
        System.out.println("------------End----------");
        System.out.println();
        System.exit(0);
    }

}