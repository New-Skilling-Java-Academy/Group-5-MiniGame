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
        Question question2 = new Question("Which two words traditionally appear onscreen at the termination of a feature film?", "The End", "The Conclusion", "The Finish", "the TimeOut", "The End");
        Question question3 = new Question("A magnet would most likely attract which of the following?", "Metal", "Plastic", "Wood", "The wrong people", "Metal");
        Question question4 = new Question("Which of these names is not in the title of a Shakespeare play?", "Hamlet", "Romeo", "Macbeth", "Helder", "Helder");
        Question question5 = new Question("Where did Scotch whisky originate?", "Ireland", "The United States", "Scotland", "Sweden", "Scotland");
        Question question6 = new Question("In the United States, what is traditionally the proper way to address a judge?", "Your holiness", "Your honor", "Your eminence", "You da man!", "Your honor");
        Question question7 = new Question("What Supervillian is near Helder?", "The Penguin", "The Riddler", "Two Face", "The Joker", "The Joker");
        Question question8 = new Question("What is not a car VW name?", "Golf", "Jetta", "Passat", "Bulldog", "Bulldog");
        Question question9 = new Question("What was the name of the band led by Jim Morrison?", "The Doors", "The Windows", "The Floors", "The Roofs", "The Doors");
        Question question10 = new Question("By definition, a 10-speed bike has 10 what?", "Wheels", "Gears", "Spokes", "Lives", "Gears");
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

        if (timer == 11) {
            printwin();
        } else {
            int qNumber = questionnumber();
            while (gamequestion.contains(qNumber)) {
                qNumber = questionnumber();
            }

            Question quest = question.get(qNumber);
            gamequestion.add(qNumber);
//            for (int i = 0; i < gamequestion.size(); i++) {
//                System.out.print(gamequestion.get(i)+"-");
//            }

            System.out.println("\n------------Question " + (timer) + "--------------------------------------------------------");
            System.out.println(" " + quest.question);
            System.out.printf(" \n 1: %s \n 2: %s \n 3: %s \n 4: %s \n", quest.answerA, quest.answerB, quest.answerC, quest.answerD);

//            System.out.println(quest.answerright);
            System.out.println("--------------------------------------------------------------------------------");
//            System.out.println("Timer = " + timer);

            while (timer <= 10) {
//                System.out.println("Timer is: " + timer);
                System.out.print("\nYour Answer :  ");
                int choice = input.nextInt();

                input.nextLine();
                switch (choice) {
                    case 1:
                        if (quest.answerA.equals(quest.answerright)) {
                            timer++;
                            System.out.println(quest.answerright + " is right");
                            showQuestion();
                        } else {
                            printend(timer, quest.answerA);
                            break;
                        }
                    case 2:
                        if (quest.answerB.equals(quest.answerright)) {
                            timer++;
                            System.out.println(quest.answerright + " is right");
                            showQuestion();
                        } else {
                            printend(timer,quest.answerB);
                            break;
                        }
                    case 3:
                        if (quest.answerC.equals(quest.answerright)) {
                            System.out.println(quest.answerright + " is right");
                            timer++;
                            showQuestion();
                        } else {
                            printend(timer,quest.answerC);
                            break;
                        }
                    case 4:
                        if (quest.answerD.equals(quest.answerright)) {
                            System.out.println(quest.answerright + " is right");
                            timer++;
                            showQuestion();
                        } else {
                            printend(timer, quest.answerC);
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

    int questionnumber() {
        return ThreadLocalRandom.current().nextInt(0, question.size() - 1);
    }

    public void printend(int timer, String answer) {
        System.out.println();
        System.out.println(answer + " is not right");
        System.out.println("You lose in round " + timer);
        System.out.println("------------End----------");
        System.out.println();
        System.exit(0);
    }

    public void printwin() {
        System.out.println();
        System.out.println("You win the 1 Million Smiles");
        System.out.println("------------End----------");
        System.out.println();
        System.exit(0);
    }

}