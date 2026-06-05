import java.util.Scanner;

public class benjanimbulb 
{
    public static void main(String[] args) 
    {
        int bulb,toggle;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of bulb:- ");
        bulb=sc.nextInt();

        toggle=bulb;

        for(int i =2 ; i<=bulb ;i++)
        {
           for(int j=1 ;j<=bulb ;j++)
           {
            if(j%i==0)
            toggle++;
           }
        }

        System.out.println(toggle);
        
    }
    
}

