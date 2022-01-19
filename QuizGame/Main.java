package QuizGame;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("\tQuiz\n\t====\n");
        System.out.println("\tRules \n\tYou win if you answer 10 Questions in a row :-)\n\n\tLETS Start");
        QuizApp app = new QuizApp();
        app.showQuestion();
    }
}
