import java.util.Scanner;

public class pattern5diamond 
{
    public static void main(String[] args) 
    {
     
    int i=0,j,num,star=1,sp;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of rows you waant to print for pattern:- ");   
    num=sc.nextInt();
    sp=num/2;


    for(i=1 ; i<=num ; i++)
    {
    

        for (int k = 1; k <= sp; k++) 
        {
            System.out.print(" ");
        }
        for (int k = 1; k <= star; k++) 
        {
            System.out.print("*");
            
        }
        System.out.println();
       
        if (i<=num/2) 
        {
            sp--;
            star+=2;  
        }
        else
        {
            sp++;
            star-=2;
        }
    }



   
    }
    
    
}
