import java.util.Scanner;

 public class playeravg 
{
    Scanner sc = new Scanner(System.in);
    int [] players;
    int n,sum=0,count=0;
   public void avg()
    {
        System.out.println("enter no of players");
        int n=sc.nextInt();
        players = new int[n];

        System.out.println("enter scores of "+n+" players ");
        for (int i = 0; i < n; i++) 
        {
            players[i]=sc.nextInt(); 
        }

        for (int i = 0; i < n; i++) 
        {
               sum += players[i];

        }
        
        int avg=sum/n;

        for (int i = 0; i < players.length; i++) 
        {
            if(players[i]>avg)
            {
                count++;
            }
            
        }

        System.out.println(count);

    }
    public static void main(String[] args) 
    {
        playeravg play = new playeravg();

        play.avg();

        
    }
    
}
