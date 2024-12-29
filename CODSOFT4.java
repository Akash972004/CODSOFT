import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Quiz {
    private String question;
    private String[] options;
    private char correctAnswer;

    public Quiz(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }
}

public class CODSOFT4 {
    private static int score = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static boolean answered = false;

    public static void main(String[] args) {
        Quiz[] quizzes = {
            new Quiz("What is the capital of India?", new String[]{"A. Dehli", "B. Bengaluru", "C. Patna", "D. Rajasthan"}, 'A'),
            new Quiz("Who is the present P.M of India?", new String[]{"A. Modi", "B. Rahul Gandhi", "C. Murmu ", "D. yogi"}, 'A'),
            new Quiz("Who is known as 'Iron Man of India'?", new String[]{"A. Modi", "B. Sardar vallabhbhai Patel ", "C. Jamshed J", "D. Ratan Tata"}, 'B')
        };

        for (Quiz quiz : quizzes) {
            presentQuestion(quiz);
        }

        displayResult(quizzes.length);
    }

    private static void presentQuestion(Quiz quiz) {
        System.out.println(quiz.getQuestion());
        for (String option : quiz.getOptions()) {
            System.out.println(option);
        }

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (!answered) {
                    System.out.println("\nTime's up! You took too long to answer.");
                    answered = true; // Ensure the user cannot submit an answer after time's up.
                }
            }
        };
        
        // Schedule the task to run after 10 seconds
        timer.schedule(task, 10000);

        System.out.print("Your answer (A, B, C, D): ");
        char answer = scanner.next().toUpperCase().charAt(0);
        answered = true;
        timer.cancel(); // Cancel the timer if the answer is submitted in time

        if (answer == quiz.getCorrectAnswer()) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }
        
        answered = false; // Reset answered for the next question
    }

    private static void displayResult(int totalQuestions) {
        System.out.println("\nQuiz Completed!");
        System.out.println("Your score: " + score + "/" + totalQuestions);
        System.out.println("You got " + score + " correct answers and " + (totalQuestions - score) + " incorrect answers.");
    }
}

