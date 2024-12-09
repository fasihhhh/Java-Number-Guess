import java.util.Scanner;
public class Proj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guessNumber=0;
        int RandomNumber = (int)(Math.random()*10);
        while(RandomNumber!=guessNumber)
        {
            System.out.println("Enter your guess between 1-10 : ");
            guessNumber = sc.nextInt();
        if(guessNumber>10)
        {
            System.out.println("Guess Under 10");
        }
        else if(guessNumber<0)
        {
            System.out.println("Exited");
            System.out.println("The number was : " + RandomNumber);
            break;
        }
        else if(guessNumber!=RandomNumber)
        {
            System.out.println("Incorect guess");
        }

    }
    if(RandomNumber==guessNumber)
    {
    System.out.println("Correctly guessed!");
    }
        else{
            System.out.println("Invalid");
        }
    }
}
