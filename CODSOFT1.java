import java.util.Scanner;
public class CODSOFT1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxAttempts=5;
        int Score=0;
        boolean playAgain=true;
        while (playAgain) {
            int attempts=0;
            boolean guessedcorrectly=false;
            int number=(int)(Math.random()*100);
        while (attempts<maxAttempts && !guessedcorrectly) {
        System.out.println("guess the random number which is generated:\t");
        int GuessNum=sc.nextInt();
        attempts++;
        if (number==GuessNum) {
            System.out.println("guessed it correctly");
            guessedcorrectly=true;
            Score++;
        }
        else if(GuessNum>number){
            System.out.println("Too High");
        }
        else if(GuessNum<number){
            System.out.println("Too Low");
        }
        if (attempts==maxAttempts && !guessedcorrectly) {
            System.out.println("You've run out of attempts. The correct number was " +number);
        }
    }
        System.out.println("Your current score is: " +Score);
        System.out.println("\nif you want to play again enter 'yes' else  'no' ");
        String Again=sc.next();
        playAgain=Again.equalsIgnoreCase("yes");
}
        System.out.println("Thankyou for Playing your final score is\n"+Score);
        sc.close();
    }
}
