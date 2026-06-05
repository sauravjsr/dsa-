import java.util.Scanner;

public class mirrorpattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no for pattern ");
        int n=sc.nextInt();

        int value=1;
        int chars=8;

        for (int i = 1; i <=n; i++) 
        {
            for (int j = 1; j <=value; j++) 
            {
                System.out.print(j);
                
            }

            for (int j = 1; j <=chars; j++) 
            {
                System.out.print("@");
                
            }

            for (int j = i; j >0; j--) 
            {

                System.out.print(j);
            }
            System.out.println();

            value++;
            chars=chars-2;

            
        }


        
    }
    
}
