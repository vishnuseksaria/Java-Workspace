import java.util.*;

public class RockPaperScissor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME\nThis is a rock paper scissor game.\nThere will be five rounds in this game.\nIf there is a tie, the round will not be counted.\nThe scores will be displayed after each round.\nThe one with greater score will be declared the winner.");
        int n=0,a=0,b=0;
        while(n!=5)
        {
            System.out.println("Enter :\n1 for Rock\n2 for Paper\n3 for Scissor");
            System.out.print("Player : ");
            double p = in.nextByte();

            if (p>3 || p<1)
            {
                System.out.println("Invalid choice! Enter again.");
                continue;
            }
            double c = Math.floor((Math.random()*3)+1);
            System.out.println("Computer : "+(int)c);

            if(p==1 && c==2 || p==2 && c==3 || p==3 && c==1)
            {
                a++;
                System.out.println("Computer : "+a+" | Player : "+b);
            }
            else if(c==1 && p==2 || c==2 && p==3 || c==3 && p==1)
            {
                b++;
                System.out.println("Computer : "+a+" | Player : "+b);
            }
            else
            {
                System.out.println("Computer : "+a+" | Player : "+b);
                continue;
            }
            n++;
        }

        if(a>b)
            System.out.println("Computer wins.");
        else
            System.out.println("Player wins.");

        System.out.println("ThankYou for using my game.");
    }
}
