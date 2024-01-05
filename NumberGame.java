import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int attempts=5;

        int finals=0;

        boolean playAgain=true;

        System.out.println("Guess the Number within 5 trials");
        while(playAgain)
        {
            int RandomNumber=getRandomNumber(1,100);
            boolean guess=false;
            for(int i=0;i<attempts;i++)
            {
                System.out.println("Trial "+(i+1)+"  Enter the guess:");
                int user=sc.nextInt();
                if(user==RandomNumber)
                {
                    guess=true;
                    finals+=1;
                    System.out.println("Congratulations! You won the Game.");
                    break;
                }
                else if(user>RandomNumber)
                {
                    System.out.println("Too high! Try again.");
                }
                else
                {
                    System.out.println("Too low! Try again.");
                }
            }
            if(guess==false)
            {
                System.out.println("Sorry,You lost the attempts.The number was: "+RandomNumber);
            }
            System.out.println("Do you want to play Again?(Yes/No): ");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("Yes");
        }
        System.out.println("We Hope you enjoyed this !!!.");
        System.out.println("Here is your Score "+finals);
    }    
        public static int getRandomNumber(int min,int max)
        {
            return (int)(Math.random()*(max-min+1)+min);
        }
    
}