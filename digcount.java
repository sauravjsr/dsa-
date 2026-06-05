import java.util.Scanner;

public class digcount 
{
    public static void main(String[] args) 
    {
        int num,rem,count=0,r,div=100;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        num=sc.nextInt();
        
        if(num==0)
        {
            count++;
        }
        else
        for (int i = num; i >0 ; i=i/10) 
        {
            r=i/div;
            div=div/10;
            System.out.println(r);
        }


    }
    
}
