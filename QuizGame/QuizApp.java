package QuizGame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class QuizApp {

    ArrayList<Question> question = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> gamequestion = new ArrayList<>();
    int timer = 1;


    public QuizApp() {

        Question question1 = new Question("A person with well-developed abdominal muscles is said to have a what? ", "One-pack", "Six-pack", "12-pack ", "family-pack", "Six-pack");
        Question question2 = new Question("Which two words traditionally appear onscreen at the termination of a feature film?", "The End","The Conclusion","The Finish","the TimeOut", "The End");
        Question question3 = new Question("A magnet would most likely attract which of the following?","Metal","Plastic","Wood","The wrong people", "Metal");
        Question question4 = new Question("Which of these names is not in the title of a Shakespeare play?","Hamlet","Romeo","Macbeth","Helder", "Helder");
        Question question5 = new Question("Where did Scotch whisky originate?","Ireland","The United States","Scotland","Sweden", "Scotland");
        Question question6 = new Question("In the United States, what is traditionally the proper way to address a judge?", "Your holiness","Your honor","Your eminence","You da man!", "Your honor");
        Question question7 = new Question("What Supervillian is near Helder?","The Penguin","The Riddler","Two Face","The Joker", "The Joker");
        Question question8 = new Question("What is not a car VW name?","Golf","Jetta","Passat","Bulldog", "Bulldog");
        Question question9 = new Question("What was the name of the band led by Jim Morrison?", "The Doors","The Windows","The Floors","The Roofs", "The Doors");
        Question question10 = new Question("By definition, a 10-speed bike has 10 what?","Wheels","Gears","Spokes","Lives", "Gears");
        Question question11 = new Question("What is not black or white", "Milk", "coal", "tires", "rainbow", "rainbow");
        Question question12 = new Question("What is not Java", "Great", "Awesome", "Loud", "a Programming language", "Loud");




        question.add(question1);
        question.add(question2);
        question.add(question3);
        question.add(question4);
        question.add(question5);
        question.add(question6);
        question.add(question7);
        question.add(question8);
        question.add(question9);
        question.add(question10);
        question.add(question11);
        question.add(question12);

    }

    public void showQuestion() {
        System.out.println();
//        System.out.println("Quiz");
//        questionnumber();

        Question quest = question.get(questionnumber());
            System.out.println("------------Question " + (question.indexOf(quest) + 1) + "---------");
            System.out.println((question.indexOf(quest) + 1)+ " " + quest.question);
            System.out.printf(" \t 1: %s - 2: %s - 3: %s - 4: %s \n", quest.answerA,  quest.answerB, quest.answerC, quest.answerD);

            System.out.println(quest.answerright);
            System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Timer = " + timer);
            if (timer == 10) {
                printwin(timer);
            } else {
                while (timer <= 9) {
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

    public int questionnumber() {
        int newquestion = ThreadLocalRandom.current().nextInt(0, question.size() - 1);
        if (gamequestion.contains(newquestion)) {
            questionnumber();
        }
        gamequestion.add(newquestion);
        return newquestion;

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