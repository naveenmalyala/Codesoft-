import java.util.*;

public class QuizApplicationWithTimer {
    static Scanner scanner = new Scanner(System.in);
    static int score = 0;
    static boolean answered = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the Java Quiz!");

        Question[] questions = {
            new Question("What is the capital of France?",
                         new String[]{"A. Berlin", "B. Paris", "C. Rome", "D. Madrid"}, 'B'),
            new Question("What is 5 + 3?",
                         new String[]{"A. 6", "B. 7", "C. 8", "D. 9"}, 'C'),
            new Question("Which language runs in a web browser?",
                         new String[]{"A. Java", "B. C++", "C. Python", "D. JavaScript"}, 'D')
        };

        for (Question q : questions) {
            askQuestionWithTimer(q, 10); // 10-second timer
        }

        System.out.println("\nQuiz Over! Your Score: " + score + "/" + questions.length);
    }

    static void askQuestionWithTimer(Question q, int timeLimitInSeconds) {
        answered = false;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                if (!answered) {
                    System.out.println("\nTime's up!");
                    answered = true;
                }
            }
        }, timeLimitInSeconds * 1000);

        System.out.println("\n" + q.questionText);
        for (String option : q.options) {
            System.out.println(option);
        }
        System.out.print
